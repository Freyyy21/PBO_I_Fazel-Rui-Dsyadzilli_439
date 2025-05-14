package Codelab.Modul_5;

public class Barang {
    private String nama;
    private int stok;
    private int harga;

    public Barang(String nama, int stok, int harga){
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public String getNama(){
        return nama;
    }

    public int getStok(){
        return stok;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setStok(int stok){
        this.stok = stok;
    }

    public void setHarga(){
        this.harga = harga;
    }

    public int getHarga(){
        return harga;
    }


}
