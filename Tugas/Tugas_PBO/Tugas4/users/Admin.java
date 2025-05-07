package Tugas.Tugas_PBO.Tugas4.users;

import Tugas.Tugas_PBO.Tugas4.actions.AdminActions;
import Tugas.Tugas_PBO.Tugas4.main.LoginSystem;

import java.util.InputMismatchException;


public class Admin extends User implements AdminActions {

    @Override
    public void manageItems() {
        System.out.println(">> Fitur kelola Barang Belum Tersedia <<");
    }

    @Override
    public void manageUsers() {
        System.out.println(">> Fitur Kelola Mahasiswa Belum Tersedia <<");
    }

    @Override
    public void displayAppMenu(){
        boolean condition = true;
        while (condition) {
            try {
                while (condition) {
                    System.out.println("Admin Menu: ");
                    System.out.println("0. Logout");
                    System.out.println("1. Kelola Laporan Barang");
                    System.out.println("2. Kelola Data Mahasiswa");
                    System.out.print("Masukkan pilihan (0-2) : ");
                    int optionAdm = LoginSystem.input.nextInt();
                    LoginSystem.input.nextLine();
                        if (optionAdm == 0) {
                            condition = false;
                        } else if (optionAdm == 1) {
                            manageItems();
                        } else if(optionAdm == 2){
                            manageUsers();
                        }else {
                            System.out.println("Input tidak valid! Pilih menu yang ada.");
                        }
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid!");
            }
        }

    }

    public static void login() {
        boolean condition = true;
        while (condition) {
            String username = ("Admin439");
            String password = ("Password439");
            System.out.print("Masukkan username: ");
            String inputUsername = LoginSystem.input.nextLine();
            System.out.print("Masukkan password: ");
            String inputPassword = LoginSystem.input.nextLine();
            if (username.equals(inputUsername) && password.equals(inputPassword)){
                User admin1= new Admin();
                admin1.displayAppMenu();
                condition = false;
            }else {
                System.out.println("Username atau Password salah!");
            }
        }
    }
}
