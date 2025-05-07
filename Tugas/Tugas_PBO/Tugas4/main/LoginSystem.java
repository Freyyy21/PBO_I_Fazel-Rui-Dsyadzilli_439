package Tugas.Tugas_PBO.Tugas4.main;
import Tugas.Tugas_PBO.Tugas4.users.Admin;
import Tugas.Tugas_PBO.Tugas4.users.Mahasiswa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginSystem {
    static public Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean conditon = true;
        while(conditon){
            System.out.println("Menu");
            System.out.println("Masuk sebagai: ");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. keluar");
            System.out.print("Masukkan pilihan (1-3) : ");
            try{
                int role = input.nextInt();
                input.nextLine();
                if (role == 1){
                    Admin.login();
                } else if (role == 2) {
                    Mahasiswa.login();
                }else if(role == 3){
                    conditon = false;
                }else{
                    System.out.println("Pilih menu yang disediakan!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid! ");
                input.nextLine();
            }

        }
    }
}
