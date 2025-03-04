import java.util.Scanner;

public class TugasPBOClass1 {
    public static void main(String[] args){
        System.out.println("Pilih login sebagai:");
        System.out.println("1. Admin:");
        System.out.println("2. Mahasiswa:");
        Scanner scan = new Scanner(System.in);
        int option;
        option = scan.nextInt();
        scan.nextLine();

        while(true) {
            if (option == 1) {
                String userA = "Fazel439";
                String passwordA = "Fazel123";
                String adminUsername;
                String adminPassword;
                System.out.println("Masukkan username:");
                adminUsername = scan.nextLine();
                System.out.println("Masukkan password:");
                adminPassword = scan.nextLine();
                if (adminUsername.equals(userA) && adminPassword.equals(passwordA)) {
                    System.out.println("Login Admin berhasil!");
                    break;
                } else {
                    System.out.println("Login gagal! username atau password salah.");
                }
            } else if (option == 2) {
                String userM = "Fazel439";
                String passwordM = "Fazel123";
                String mahaUsername;
                String mahaPassword;
                System.out.println("Masukkan username:");
                mahaUsername = scan.nextLine();
                System.out.println("Masukkan password:");
                mahaPassword = scan.nextLine();
                if (mahaUsername.equals(userM) && mahaPassword.equals(passwordM)) {
                    System.out.println("Login Admin berhasil!");
                    break;
                } else {
                    System.out.println("Login gagal! username atau password salah.");
                }
            } else {
                System.out.println("Pilihan tidak valid!");
                break;
            }
        }
    }
}
