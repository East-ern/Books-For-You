/* Purpose of file : made data classes storing title and author of books of different genre to display in result to whoever plays the quiz*/

data class RomanceGenreBook(val title : String, val author : String, val genre: String = "Romance")

data class SciFiGenreBook(val title : String, val author : String, val genre: String = "Science-Fiction" )

data class ThrillerGenreBook(val title : String, val author : String, val genre: String = "Thriller")

data class InspirationGenreBook(val title : String, val author : String, val genre: String = "Inspiration")

class StoreOfBooks() {
    fun returnARomanceGenreBook(): MutableMap<Int, RomanceGenreBook> {
        return mutableMapOf<Int, RomanceGenreBook>(1 to RomanceGenreBook("Pride and Prejudice", "Jane Austen"), 2 to RomanceGenreBook("Outlander", "Diana Gabaldon"), 3 to RomanceGenreBook("It Ends With Us", "Colleen Hoover"), 4 to RomanceGenreBook("The Proposal", "Jasmine Guillory"), 5 to RomanceGenreBook("The Hating Game", "Sally Thorne"), 6 to RomanceGenreBook("2 States", "Chetan Bhagat"), 7 to RomanceGenreBook("Vision in White", "Nora Roberts"), 0 to RomanceGenreBook("A Long Petal of the Sea", "Isabel Allende"))
    }

    fun returnASciFiGenreBook(): MutableMap<Int, SciFiGenreBook> {
        return mutableMapOf<Int, SciFiGenreBook>(1 to SciFiGenreBook("The Blazing World", "Margaret Cavendish"), 2 to SciFiGenreBook("Jurassic Park", "Michael Chrichton"), 3 to SciFiGenreBook("Frankenstein", "Mary Shelley"), 4 to SciFiGenreBook("Foundation", "Isaac Asimov"), 5 to SciFiGenreBook("The Stars My Destination", "Alfred Bester"), 6 to SciFiGenreBook("Solaris", "Stanislaw Lem"), 7 to SciFiGenreBook("Dune", "Frank Herbert"), 0 to SciFiGenreBook("Ice", "Anna Kavan"))
    }

    fun returnAThrillerGenreBook(): MutableMap<Int, ThrillerGenreBook> {
        return mutableMapOf<Int, ThrillerGenreBook>(1 to ThrillerGenreBook("The Silence of the Lambs", "Thomas Harris"), 2 to ThrillerGenreBook("The Girl with the Dragon Tattoo", "Stieg Larsson"), 3 to ThrillerGenreBook("The Da Vinci Code", "Dan Brown"), 4 to ThrillerGenreBook("Kiss the Girls", "James Patterson"), 5 to ThrillerGenreBook("Gone Girl", "Gillian Flynn"), 6 to ThrillerGenreBook("The Bourne Identity", "Robert Ludlum"), 7 to ThrillerGenreBook("A Time to Kill", "John Grisham"), 0 to ThrillerGenreBook("In Cold Blood", "Truman Capote"))
    }

    fun returnAInspirationGenreBook(): MutableMap<Int, InspirationGenreBook> {
        return mutableMapOf<Int, InspirationGenreBook>(1 to InspirationGenreBook("The Checklist Manifesto", "Atul Gawande"), 2 to InspirationGenreBook("The Four Agreements", "Miguel Ruiz"), 3 to InspirationGenreBook("The Only Game in Town: Central Banks, Instability, and Avoiding the Next Collapse", "Mohamed A. El-Erian"), 4 to InspirationGenreBook("The Varieties of Human Experience", "William James"), 5 to InspirationGenreBook("Moonwalking With Einstein: The Art and Science of Remembering Everything", "Joshua Foer"), 6 to InspirationGenreBook("A Tale of Three Kings", "Gene Edwards"), 7 to InspirationGenreBook("The Art of War", "Sun Tzu"), 0 to InspirationGenreBook("The Alchemist", "Paulo Coelho"))
    }
}