package Tugas.Tugas_PBO;
import java.util.Scanner;

public class LoginSystem {
    static Scanner ipt = new Scanner(System.in);

    public static void main(String[] Args){
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();
        int option;

        while(true) {
            System.out.println("Pilih login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.print("Masukkan pilihan: ");
            option = ipt.nextInt();
            ipt.nextLine();
            if (option == 1 || option ==2){
                break;
            }else{
                System.out.println("Pilihan tidak valid!");
            }
        }

        if (option == 1){
            admin.loginAdmin();
        }else{
            mahasiswa.loginMahasiswa();
            mahasiswa.displayInfo();
        }




    }
}
