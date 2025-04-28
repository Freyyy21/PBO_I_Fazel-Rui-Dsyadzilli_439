package Codelab.Modul_3;

public class Pahlawan extends KarakterGame{
    public Pahlawan(String nama, int kesehatan){
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame musuh){
        System.out.println(getNama() + " Menyerang " + musuh.getNama() + " Menggunakan Orbital Strike!");
        musuh.setKesehatan(musuh.getKesehatan() - 20);
        System.out.println(musuh.getNama() + " sekarang memiliki kesehatan " + musuh.getKesehatan());
    }

}
