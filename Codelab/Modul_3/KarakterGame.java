package Codelab.Modul_3;

public class KarakterGame {
    private final String nama;
    private int kesehatan;

    public String getNama() {
        return nama
                ;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan){
        this.kesehatan = kesehatan;
    }

    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public void serang(KarakterGame target){
        System.out.println(nama + " menyerang " + target.getNama());
    }

    public void displayInfo(){
        System.out.println(nama + " memiliki kesehatan: " + kesehatan);
    }
}
