// main function here
// Purpose of file : calculating result of quiz and suggesting a novel based on it

import java.util.*

class Results {
    val quizForYou : QuizForYou = QuizForYou()
    fun getMostChosenOption(answers : MutableList<Int> = quizForYou.playQuiz()) : Int{

        /* Counting number of times a particular option was selected and storing in a list */
        val counts = listOf(answers.count{e -> e==1},answers.count{e -> e==2},answers.count{e -> e==3},answers.count{e -> e==4})

        // more 1's for Romance Genre Novel
        // more 2's for Sci-Fi Genre Novel
        // more 3's for Sci-Fi Genre Novel
        // more 4's for Sci-Fi Genre Novel

        val maxi = counts.max()
        var mostChosenOption = 0

        // Finding the most chosen option. If more than one any one of it is used
        for(i in 0..3){
            if(maxi == counts[i]) {
                mostChosenOption = i+1
                break
            }
        }

        if(answers.size!= 10) mostChosenOption = 0

        // Getting some novel names from book store to display according to reader's choice

        return mostChosenOption
    }

    fun getRandomBook(): String {

        val typeOfGenre= Results().getMostChosenOption()
        val storeOfBooks = StoreOfBooks()
        val result: String
        result = when(typeOfGenre){
            1 -> { val suggestedBook = storeOfBooks.returnARomanceGenreBook().getValue(randomBookNumber())
                "*RESULT : According to your choices you may be interested in '${suggestedBook.genre}' genre. So we suggest you to read '${suggestedBook.title}' by '${suggestedBook.author}'"
            }
            2 -> { val suggestedBook = storeOfBooks.returnASciFiGenreBook().getValue(randomBookNumber())
                "*RESULT : According to your choices you may be interested in '${suggestedBook.genre}' genre. So we suggest you to read '${suggestedBook.title}' by '${suggestedBook.author}'"
            }
            3 -> { val suggestedBook = storeOfBooks.returnAThrillerGenreBook().getValue(randomBookNumber())
                "*RESULT : According to your choices you may be interested in '${suggestedBook.genre}' genre. So we suggest you to read '${suggestedBook.title}' by '${suggestedBook.author}'"
            }
            4 -> { val suggestedBook = storeOfBooks.returnAInspirationGenreBook().getValue(randomBookNumber())
                "*RESULT : According to your choices you may be interested in 'Motivational' genre. So we suggest you to read '${suggestedBook.title}' by '${suggestedBook.author}'"
            }
            else -> {
                "*MESSAGE : There was a an error in choices you made. Please try again."
            }
        }
        return result
    }

    fun randomBookNumber() : Int{
        return (Random().nextInt(8))
    }
}

fun main() {
    println()
    println("\t\t\t** Welcome to the BooksForYou Quiz ** \n")
    var option : Int = 4
    while (option !=0) {
        println("1. Try the Quiz")
        println("0. Exit")
        print("Enter an option : ")
        try {
            option = readLine()?.toInt() ?:4
            println()
        }
        catch (e : NumberFormatException){
            println()
            println(message = "*ERROR : Enter valid options while you play the quiz. \n ")
        }
        when(option) {
            1 -> {
                println(Results().getRandomBook())
                println()
            }
            0 -> println("\t\t\t\t\t** Thanks. Visit Again **")
            else -> {
                println("*MESSAGE : Try Again. Wrong choice \n")
            }
        }
    }
}