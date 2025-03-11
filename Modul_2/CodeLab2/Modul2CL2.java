package Codelab.Modul_2.CodeLab2;

public class Modul2CL2 {
    public static void main(String[] args){
        RekeningBank rekening1 = new RekeningBank();
        RekeningBank rekening2 = new RekeningBank();

        rekening1.nomorRekening = "202410370110439";
        rekening2.nomorRekening = "202410370110401";

        rekening1.namaPemilik = "Fazel Rui Dsyadzilli";
        rekening2.namaPemilik = "Falih Fiqhi";

        rekening1.saldo = 2000000;
        rekening2.saldo = 1300000;

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        rekening1.setorUang();
        rekening2.setorUang();

        rekening1.tarikUang();
        rekening2.tarikUang();

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }



}
