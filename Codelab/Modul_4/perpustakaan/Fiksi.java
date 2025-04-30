package Codelab.Modul_4.perpustakaan;
import static Codelab.Modul_4.App.Main.*;

public class Fiksi extends Buku {
    @Override
    public void displayInfo() {
        System.out.println("Daftar Buku Fiksi.");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-40s %-25s %-40s\n", "Judul", "Penulis", "Genre");

        for (int i = 5; i < 10; i++) {
            String title = map.get("Title").get(i);
            String writter = map.get("Writter").get(i);
            String genre = map.get("Genre").get(i);
            System.out.printf("%-40s %-25s %-40s\n", title, writter, genre);
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------\n");

    }
}
