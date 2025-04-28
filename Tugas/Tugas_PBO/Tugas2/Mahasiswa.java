package Tugas.Tugas_PBO;

public class Mahasiswa {
    String nama = "Fazel Rui Dsyadzilli";
    String nim = "202410370110439";
    String inputNama;
    String inputNIM;

    void loginMahasiswa(){
        while(true){
            System.out.print("Masukkan nama: ");
            inputNama = LoginSystem.ipt.nextLine();
            System.out.print("Masukkan NIM: ");
            inputNIM = LoginSystem.ipt.nextLine();
            if (nama.equals(inputNama) && nim.equals(inputNIM)){
                System.out.println("\nLogin mahasiswa berhasil.");
                break;
            }else{
                System.out.println("Login mahasiswa gagal! Nama atau NIM salah.");
            }
        }
    }

    void displayInfo(){
        System.out.printf("Nama = %s\n", nama);
        System.out.printf("NIM = %s", nim);
    }

}
