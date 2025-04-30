package Codelab.Modul_4.App;
import Codelab.Modul_4.perpustakaan.Anggota;
import Codelab.Modul_4.perpustakaan.Buku;
import Codelab.Modul_4.perpustakaan.Fiksi;
import Codelab.Modul_4.perpustakaan.NonFiksi;
import java.util.*;


public class Main {
    public static Map<String, List<String>> map = new HashMap<>();

    public static void main(String[] args) {

            map.put("Title", new ArrayList<>());
            map.put("Writter", new ArrayList<>());
            map.put("Genre", new ArrayList<>());
            for (int i = 0; i < 10; i++) {
                map.get("Title").add(Buku.judul[i]);
                map.get("Writter").add(Buku.penulis[i]);
                map.get("Genre").add(Buku.genre[i]);
            }

        Fiksi fiksi1 = new Fiksi();
        NonFiksi nonFiksi1 = new NonFiksi();

        fiksi1.displayInfo();
        nonFiksi1.displayInfo();

        Anggota anggota1 = new Anggota();
        anggota1.pinjamBuku(1);
        anggota1.pinjamBuku(6,7);
        anggota1.kembalikanBuku();





    }



}
