package Codelab.Modul_5;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ManajemenStok {
    public static Scanner input = new Scanner(System.in);

    public  static void tambahBarang(ArrayList<Barang> daftarBarang){
        boolean condition = true;
        while (condition) {
            try {
                System.out.print("Masukkan nama barang: ");
                String nama = input.nextLine();
                System.out.print("Masukkan stok barang: ");
                int stok = input.nextInt();
                input.nextLine();
                System.out.print("Masukkan harga: ");
                int harga = input.nextInt();
                input.nextLine();
                daftarBarang.add(new Barang(nama, stok, harga));
                System.out.println("Barang berhasil ditambahkan.");
                condition = false;
            } catch (InputMismatchException e) {
                System.out.println("Terdapat input tidak valid!" + e.getMessage());
                input.nextLine();
            }
        }
    }

    public static void tampilkanBarang(ArrayList<Barang> daftarBarang){
        if (daftarBarang.isEmpty()) {
            System.out.println("Stok barang kosong.");
        } else {
            System.out.println("Daftar Barang:");
            System.out.printf("%-20s %-10s %-10s\n", "Nama Barang", "Stok", "Harga");
            for (int i = 0; i < daftarBarang.size(); i++) {
                System.out.printf("%-20s %-10d %-10d\n",
                        daftarBarang.get(i).getNama(),
                        daftarBarang.get(i).getStok(),
                        daftarBarang.get(i).getHarga());
            }
        }
    }

    public static void kurangiStok(ArrayList<Barang> daftarBarang){
        for (int i = 0; i < daftarBarang.size(); i++){
            System.out.println(i + ". " + daftarBarang.get(i).getNama() );
        }
        boolean condition = true;
        while (condition) {
            int index = 0;
            try {
                System.out.print("Masukkan barang nomor berapa untuk dikurangi: ");
                index = input.nextInt();
                input.nextLine();
                try{
                    daftarBarang.get(index).getNama();
                }catch (IndexOutOfBoundsException e){
                    System.out.println("Input nomor barang yang tersedia" + e.getMessage());
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid!" + e.getMessage());
                input.nextLine();
            }
            System.out.print("Dikurangi sebanyak: ");
            int min = input.nextInt();
            input.nextLine();
            try{
                if (min > daftarBarang.get(index).getStok()){
                   throw new StokTidakCukupException("Gagal mengurangi! " + "Stok untuk " + daftarBarang.get(index).getNama() + " hanya tersisa " + daftarBarang.get(index).getStok());
                }else{
                    int newStok = daftarBarang.get(index).getStok() - min;
                    daftarBarang.get(index).setStok(newStok);
                    System.out.println("Stok berhasil dikurangi");
                    condition = false;
                }
            }catch (StokTidakCukupException e){
                System.out.println(e.getMessage());
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        daftarBarang.add(new Barang("Pulpen", 12, 2500));
        daftarBarang.add(new Barang("Buku", 5, 3000));
        daftarBarang.add(new Barang("Penggaris", 40, 1000));
        daftarBarang.add(new Barang("penghapus", 20, 3000));
        daftarBarang.add(new Barang("Spidol", 1, 2000));

        boolean condition = true;
        while (condition){
            try{
                System.out.println(" ===== Menu Manajemen Stok ===== ");
                System.out.println("1. Tambah barang baru");
                System.out.println("2. Tampilkan semua barang");
                System.out.println("3. Kurangi stok barang");
                System.out.println("4. Keluar");
                System.out.print("Pilih opsi (1-4): ");
                int inputOption = input.nextInt();
                input.nextLine();
                switch (inputOption){
                    case 1:
                    tambahBarang(daftarBarang);
                        break;
                    case 2:
                    tampilkanBarang(daftarBarang);
                        break;
                    case 3:
                    kurangiStok(daftarBarang);
                        break;
                    case 4:
                        System.out.println("Terima kasih.");
                        input.close();
                        condition = false;
                        break;
                    default:
                        System.out.println("Pilih menu yang ada!");
                }
            }catch (InputMismatchException e){
                System.out.println("\nMasukkan input yang valid!" + e.getMessage());
                input.nextLine();
            }
        }

    }


}
