package Codelab.Modul_4.perpustakaan;
import static Codelab.Modul_4.App.Main.*;

public class Anggota implements Peminjaman {
    String[] idAnggota = {"I439", "I440"};
    String[] nama = {"Fazel Rui Dsyadzili", "Bagas Dewantara"};

public Anggota(){
    System.out.printf("Anggota: %s (ID: %s)\n", nama[0], idAnggota[0]);
    System.out.printf("Anggota: %s (ID: %s)", nama[1], idAnggota[1]);
}

public void pinjamBuku(int index){
    String title = map.get("Title").get(index);
    System.out.printf("\n%s Meminjam buku berjudul: %s\n", nama[0], title);
}

public void pinjamBuku(int index, int time){
    String title = map.get("Title").get(index);
    System.out.printf("%s Meminjam buku berjudul: %s selama %d hari\n", nama[1], title, time);
}

public void kembalikanBuku(){
    String title1 = map.get("Title").get(1);
    System.out.printf("%s mengembalikan buku berjudul: %s\n", nama[0], title1);
    String title2 = map.get("Title").get(6);
    System.out.printf("%s mengembalikan buku berjudul: %s", nama[1], title2);
}


}