package Codelab.Modul_3;

public class Musuh extends  KarakterGame{
    public Musuh(String nama, int kesehatan){
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame pahlawan){
        System.out.println(getNama() + " Menyerang " + pahlawan.getNama() + " Menggunakan Snake Bite!");
        pahlawan.setKesehatan(pahlawan.getKesehatan() - 15);
        System.out.println(pahlawan.getNama() + " sekarang memiliki kesehatan " + pahlawan.getKesehatan());
    }
}
