package Codelab.Modul_4.perpustakaan;

public abstract class Buku {

    static public String[] judul = {
            "Norwegian Wood",
            "The Night Circus",
            "The Road",
            "Where the Crawdads Sing",
            "Project Hail Mary",
            "Sapiens: A Brief History of Humankind",
            "Atomic Habits",
            "Educated",
            "The Body Keeps the Score",
            "Outliers: The Story of Success"
    };

    static public String[] penulis = {
            "Haruki Murakami",
            "Erin Morgenstern",
            "Cormac McCarthy",
            "Delia Owens",
            "Andy Weir",
            "Yuval Noah Harari",
            "James Clear",
            "Tara Westover",
            "Bessel van der Kolk",
            "Malcolm Gladwell"
    };

    static public String[] genre = {
            "Drama, Romance",
            "Fantasy, Romance",
            "Post-apocalyptic, Drama",
            "Mystery, Coming-of-age",
            "Science Fiction",
            "History, Anthropology",
            "Self-help, Personal Development",
            "Memoir, Biography",
            "Psychology, Trauma Studies",
            "Sociology, Business"
    };


    public abstract void displayInfo();




}
