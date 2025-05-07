package Tugas.Tugas_PBO.Tugas4.users;

import Tugas.Tugas_PBO.Tugas4.actions.MahasiswaActions;
import Tugas.Tugas_PBO.Tugas4.main.LoginSystem;

public class Mahasiswa extends User implements MahasiswaActions {
    @Override
    public void reportItem() {
        System.out.print("Masukkan nama barang: ");
        String inputItems = LoginSystem.input.nextLine();
        System.out.print("Masukkan deskripsi barang: ");
        String inputDescription = LoginSystem.input.nextLine();
        System.out.print("Masukkan lokasi terakhir: ");
        String inputLocation = LoginSystem.input.nextLine();
        System.out.println("Data telah disimpan.");
    }
    @Override
    public void viewReportedItems(){
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }

    @Override
    public void displayAppMenu() {


        boolean condition = true;
        while (condition) {
            try {
                while (condition) {
                    System.out.println("User Menu:");
                    System.out.println("0. Logout");
                    System.out.println("1. Laporkan Barang Temuan/Hilang");
                    System.out.println("2. Lihat Daftar Laporan");
                    System.out.println("Masukkan pilihan: ");
                    int optionMhs = LoginSystem.input.nextInt();
                    LoginSystem.input.nextLine();
                        if (optionMhs == 0) {
                            condition = false;
                        } else if (optionMhs == 1) {
                            reportItem();
                        } else if (optionMhs == 2){
                            viewReportedItems();
                        }else{
                            System.out.println("Input tidak valid! Pilih menu yang ada.");
                        }
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid!");
            }
        }

    }

    public static void login() {
        boolean conditon = true;
        while (conditon) {
            String username = ("Fazel Rui Dsyadzilli");
            String password = ("202410370110439");
            System.out.print("Masukkan username: ");
            String inputUsername = LoginSystem.input.nextLine();
            System.out.print("Masukkan password: ");
            String inputPassword = LoginSystem.input.nextLine();
            if (username.equals(inputUsername) && password.equals(inputPassword)){
                User mahasiswa1= new Mahasiswa();
                mahasiswa1.displayAppMenu();
                conditon = false;
            }else {
                System.out.println("Username atau Password salah!");
            }
        }
    }



}
