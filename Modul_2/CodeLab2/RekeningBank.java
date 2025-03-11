package Codelab.Modul_2.CodeLab2;

import java.util.Scanner;

public class RekeningBank {
    Scanner ipt =new Scanner(System.in);
    String nomorRekening;
    String namaPemilik;
    double saldo;
    double setor;
    double tarik;

    void tampilkanInfo(){
        System.out.println("Nomor Rekening = " + nomorRekening);
        System.out.println("Nama Pemilik = " + namaPemilik);
        System.out.println("Saldo = " + saldo)
        ;
    }
    void setorUang() {
        System.out.print("\n");
        System.out.print(namaPemilik + " menyetor Rp");
        setor = ipt.nextInt();
        saldo += setor;
        System.out.printf(" .Saldo sekarang: Rp%.2f\n", saldo);
    }

    void tarikUang(){
        System.out.print("\n");
        System.out.println(namaPemilik + " menarik Rp");
        tarik = ipt.nextInt();
        if (saldo >= tarik){
            saldo -= tarik;
            System.out.printf("(Berhasil) Saldo sekarang: Rp%f", saldo);
        }else {
            System.out.printf("(Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp%f", saldo);
        }
        System.out.print("\n");
    }
}
