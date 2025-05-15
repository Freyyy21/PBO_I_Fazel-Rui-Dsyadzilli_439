package Tugas.Tugas_PBO.Tugas5.main;
import Tugas.Tugas_PBO.Tugas5.data.Item;
import Tugas.Tugas_PBO.Tugas5.users.Admin;
import Tugas.Tugas_PBO.Tugas5.users.Mahasiswa;
import Tugas.Tugas_PBO.Tugas5.users.User;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginSystem  {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Item> reportedItems = new ArrayList<>();

    static {
        userList.add(new Admin("Admin439", "Password439"));
        userList.add(new Mahasiswa("Fazel Rui Dsyadzilli", "202410370110439"));
    }

    public static User login(String username, String password) {
        for (User user : userList) {
            if (user instanceof Admin admin && admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                return admin;
            } else if (user instanceof Mahasiswa mhs && mhs.getUsername().equals(username) && mhs.getPassword().equals(password)) {
                return mhs;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        boolean condition = true;
        while (condition) {
            try {
                while (condition) {
                    System.out.println("1. Login");
                    System.out.println("2. Keluar");
                    System.out.print("Masukkan pilihan: ");
                    int Earlyinput = input.nextInt();
                    input.nextLine();
                    if (Earlyinput == 1) {
                        System.out.println("Selamat datang.");
                        System.out.print("Masukkan username: ");
                        String user = input.nextLine();
                        System.out.print("Masukkan password: ");
                        String pass = input.nextLine();

                        User loginUser = login(user, pass);

                        if (loginUser != null) {
                            System.out.println("Login berhasil!");
                            if (loginUser instanceof Admin) {
                                System.out.println("Selamat datang Admin.");
                                Admin admin = (Admin) loginUser;
                                admin.displayAppMenu();
                                condition = false;
                            } else if (loginUser instanceof Mahasiswa) {
                                System.out.println("Selamat datang Mahasiswa.");
                                Mahasiswa mahasiswa = (Mahasiswa) loginUser;
                                mahasiswa.displayAppMenu();
                                //condition = false;
                            }
                        } else {
                            System.out.println("Login gagal: username atau password salah.");
                        }
                    } else if (Earlyinput == 2) {
                        condition = false;
                    } else {
                        System.out.println("Pilih menu yang ada!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid! " + e.getMessage());
            }

        }


        input.close();
    }
}






