package Tugas.Tugas_PBO.Tugas5.users;

import Tugas.Tugas_PBO.Tugas5.actions.MahasiswaActions;
import Tugas.Tugas_PBO.Tugas5.data.Item;
import Tugas.Tugas_PBO.Tugas5.main.LoginSystem;
import java.util.InputMismatchException;

import static Tugas.Tugas_PBO.Tugas5.main.LoginSystem.input;
import static Tugas.Tugas_PBO.Tugas5.main.LoginSystem.reportedItems;


public class Mahasiswa extends User implements MahasiswaActions {
    public Mahasiswa(String username, String password) {
        super(username, password);
    }

    public Mahasiswa() {
        super("", "");
    }

    @Override
    public void reportItem() {
        String inputItems = null;
        String inputDescription = null;
        String inputLocation = null;
        boolean condition = true;
        while (condition) {
            try {
                System.out.print("Masukkan nama barang: ");
                inputItems = LoginSystem.input.nextLine();
                System.out.print("Masukkan deskripsi barang: ");
                inputDescription = LoginSystem.input.nextLine();
                System.out.print("Masukkan lokasi terakhir: ");
                inputLocation = LoginSystem.input.nextLine();
                System.out.println("Data telah disimpan.");
                condition = false;
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid!" + e.getMessage());
            }
        }
        String status = "Reported";
        reportedItems.add(new Item(inputItems, inputDescription, inputLocation, status));
    }

    @Override
    public void viewReportedItems() {
        if (reportedItems.isEmpty()) {
            System.out.println("Belum ada laporan barang.");
        } else {
            System.out.println("+-----------------+---------------------------+-----------------+------------+");
            System.out.println("| Name            | Description               | Location        | Status     |");
            System.out.println("+-----------------+---------------------------+-----------------+------------+");

            for (Item item : reportedItems) {
                System.out.println(item);
            }
            System.out.println("+-----------------+---------------------------+-----------------+------------+");

        }
    }


    @Override
    public void displayAppMenu() {
        boolean condition = true;
        while (condition) {
            try {
                while (condition) {
                    System.out.println("Mahasiswa Menu:");
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
                    } else if (optionMhs == 2) {
                        viewReportedItems();
                    } else {
                        System.out.println("Input tidak valid! Pilih menu yang ada.");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid!");
                input.nextLine();
            }
        }

    }
}






