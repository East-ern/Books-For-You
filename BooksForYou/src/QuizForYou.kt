/* Purpose of file : Quiz based on which novels will be suggested */

public class QuizForYou() {

    fun playQuiz(answers : MutableList<Int> = mutableListOf<Int>()) : MutableList<Int>{
        val questions = listOf<String>(
                "a. You’ve been working non-stop for weeks. Where are you itching to take a vacations?",
                "b. Which section do you find yourself most drawn to?",
                "c. What would you choose?",
                "d. What sounds good?",
                "e. Where is your favorite place to cozy up with a book?",
                "f. What do you like to sip on while reading?",
                "g. You’re at a cafe and a middle-aged woman is sobbing at the table next to you. How are you most likely to react?",
                "h. You’re home alone in the middle of the night and you suddenly hear something tapping your window. What do you do?",
                "i. Speaking of women, don’t more stories need strong, female characters?",
                "j. Don't you just love the smell of old books?"
        )
        val options = listOf<String>(
                "1. Rome    2. The Future    3. Las Vegas    4. England",
                "1. Romance    2. Sci-Fi    3. Thriller    4. Motivational",
                "1. something timely    2. something unbelievable    3. something spine-chilling    4. something lighthearted",
                "1. fairytale    2. some bad men    3. an amateur detective    4. a real life person",
                "1. a garden    2. with coffee anywhere    3. near a wood fire    4. doesn't matter",
                "1. hot chocolate    2. coffee    3. wine    4. smoothie",
                "1. offer a tissue and hear her story    2. ask someone else to help her    3. you've been watching her and already know what happened   4. put on your earphones, as if you don't know what happened",
                "1. panic    2.  stay calm   3. wait for another tap    4. check out",
                "1. couples are better    2. yes some superwomen    3. plot should be better than characters    4. we need woman leaders",
                "1. feels nostalgic    2. best    3. allergic    4. never distinguished it from other smells"
        )

        val rules = """*RULES : Enter the option number to the questions that you find appropriate
        and we'll suggest you a novel based on your interests."""
        println("${rules.trimIndent()} \n")

        for (i in 0..9) {
            println(questions[i])
            println(options[i])
            print("Enter an option: ")
            try {
                answers += Integer.valueOf(readLine())
            }
            catch (e : NumberFormatException){
                println()
                println(message = "*ERROR : Enter valid options while you play the quiz. \n ")
                break
            }
            println()
        }
        return answers
    }
}

