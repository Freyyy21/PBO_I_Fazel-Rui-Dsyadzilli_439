package Tugas.Tugas_PBO.Tugas5.users;

import Tugas.Tugas_PBO.Tugas5.actions.AdminActions;
import Tugas.Tugas_PBO.Tugas5.data.Item;
import Tugas.Tugas_PBO.Tugas5.main.LoginSystem;
import java.util.InputMismatchException;

import static Tugas.Tugas_PBO.Tugas5.main.LoginSystem.*;


public class Admin extends User implements AdminActions {

    public Admin(String username, String password){
        super(username, password);
    }

    @Override
    public void manageItems() {
        boolean condition = true;
        while (condition) {
            try {
                System.out.println("0. Back");
                System.out.println("1. Lihat semua laporan");
                System.out.println("2. Tandai barang telah diambil (Claimed)");
                System.out.print("Masukkan pilihan menu: ");
                int inputManageItem = input.nextInt();
                input.nextLine();
                if (inputManageItem == 1) {
                    System.out.println("+-----------------+---------------------------+-----------------+------------+");
                    System.out.println("| Name            | Description               | Location        | Status     |");
                    System.out.println("+-----------------+---------------------------+-----------------+------------+");

                    for (Item item : reportedItems) {
                        System.out.println(item);
                    }
                    System.out.println("+-----------------+---------------------------+-----------------+------------+");
                } else if (inputManageItem == 2) {
                    for (int i = 0; i < reportedItems.size(); i++) {
                        System.out.println(i + ". " + reportedItems.get(i).getName() + " Status: " + reportedItems.get(i).getStatus());
                    }
                    try {
                        System.out.print("Masukkan nomor barang yang ingin ditandai: ");
                        int index = input.nextInt();
                        input.nextLine();
                        if (index >= 0 && index <= reportedItems.size()) {
                            reportedItems.get(index).setStatus("Claimed");
                            System.out.println("Status barang berhasil diperbarui.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Input tidak valid!");
                        input.nextLine();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Index diluar batas!");
                        input.nextLine();
                    }
                } else if (inputManageItem == 0) {
                    condition = false;
                } else {
                    System.out.println("Pilih menu yang ada!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid!");
                input.nextLine();
            }
        }

    }

    @Override
    public void manageUsers() {
        boolean condition = true;
        while(condition) {
            try {
                System.out.println("Menu kelola data mahasiswa:");
                System.out.println("0. Back");
                System.out.println("1. Tambah mahasiswa");
                System.out.println("2. Hapus mahasiswa");
                System.out.print("Masukkan pilihan: ");
                int inputManageUser = input.nextInt();
                input.nextLine();
                if (inputManageUser == 1){
                    while (condition) {
                        System.out.print("Masukkan nama: ");
                        String addNama = input.nextLine();
                        System.out.print("Masukkan NIM: ");
                        String NIM = input.nextLine();
                        userList.add(new Mahasiswa(addNama,NIM));
                        System.out.println("Mahasiswa telah ditambahkan.");
                    }
                } else if (inputManageUser == 2) {
                    System.out.print("Masukkan NIM: ");
                    String remove = input.nextLine();
                    for (int i = 0; i < userList.size(); i++) {
                        User user = userList.get(i);
                        if (user instanceof Mahasiswa) {
                            Mahasiswa mhs = (Mahasiswa) user;
                            if (mhs.getPassword().equals(remove)) {
                                userList.remove(i);
                                System.out.println("Berhasil menghapus mahasiswa.");
                            }
                        }
                    }
                } else if (inputManageUser == 0) {
                    condition = false;
                } else {
                    System.out.println("Mahasiswa tidak ditemukan.");
                }
            }catch (InputMismatchException e){
                System.out.println("Input tidak valid!");
                input.nextLine();
            }
        }
    }

    @Override
    public void displayAppMenu(){
        boolean condition = true;
        while (condition) {
            try {
                while (condition) {
                    System.out.println("Admin Menu: ");
                    System.out.println("0. LogOut");
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
                input.nextLine();
            }
        }

    }

}
