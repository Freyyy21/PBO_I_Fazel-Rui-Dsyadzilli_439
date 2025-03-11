package Tugas.Tugas_PBO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Modul1Tg1 {
    public static void main(String[] args) {
        try (Scanner ipt = new Scanner(System.in)) {
            int option = 0;

            while (true) {
                System.out.println("Pilih login:");
                System.out.println("1. Admin");
                System.out.println("2. Mahasiswa");
                System.out.print("Masukkan pilihan: ");

                try {
                    option = ipt.nextInt();
                    ipt.nextLine();
                    if (option == 1 || option == 2) {
                        break;
                    } else {
                        System.out.println("Pilihan tidak valid. Silakan masukkan 1 atau 2.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Silakan masukkan angka 1 atau 2.");
                    ipt.nextLine();
                }
            }

            switch (option) {
                case 1:
                    String userA = "Admin439";
                    String passA = "Password439";
                    String iptUA;
                    String iptPA;
                    System.out.println("Masukkan username:");
                    iptUA = ipt.nextLine();
                    System.out.println("Masukkan password:");
                    iptPA = ipt.nextLine();
                    if (iptUA.equals(userA) && iptPA.equals(passA)) {
                        System.out.println("Login Admin berhasil!");
                    } else {
                        System.out.println("Login gagal! Username atau password salah.");
                    }
                    break;
                case 2:
                    String userM = "Fazel Rui Dsyadzilli";
                    String passM = "202410370110439";
                    String iptUM;
                    String iptPM;
                    System.out.println("Masukkan username:");
                    iptUM = ipt.nextLine();
                    System.out.println("Masukkan password:");
                    iptPM = ipt.nextLine();
                    if (iptUM.equals(userM) && iptPM.equals(passM)) {
                        System.out.println("Login Mahasiswa berhasil!");
                    } else {
                        System.out.println("Login gagal! Nama atau NIM salah.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
}