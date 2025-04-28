package Tugas.Tugas_PBO;

public class Admin {
    String username = "Admin439";
    String password = "Password439";
    String inputPassword;
    String inputUsername;

    void loginAdmin(){
        while (true) {
            System.out.print("Masukkan username: ");
            inputUsername = LoginSystem.ipt.nextLine();
            System.out.print("Masukkan password: ");
            inputPassword = LoginSystem.ipt.nextLine();
            if (username.equals(inputUsername) && password.equals(inputPassword)) {
                System.out.println("Login admin berhasil.");
                break;
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        }
    }


}
