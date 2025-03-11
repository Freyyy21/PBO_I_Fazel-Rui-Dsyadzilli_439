package Codelab.Modul_1;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Modul1CL1 {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String name = ipt.nextLine();

        String gender = "";
        while (true){
            System.out.print("Masukkan jenis kelamin (P/L): ");
            String iptGender = ipt.nextLine();
            if (iptGender.length() == 1) {
                char genderChar = iptGender.charAt(0);
                char male = 'l';
                char female = 'p';
                if (Character.toLowerCase(genderChar) == male || Character.toLowerCase(genderChar) == female) {
                    if (Character.toLowerCase(genderChar) == male) {
                        gender = "Laki-Laki";
                    } else {
                        gender = "Perempuan";
                    }
                    break;
                }
            } else {
                System.out.println("Input tidak valid! Silahkan coba lagi");
            }
        }

        int birth = 0;
        while (true) {
            System.out.print("Masukkan tahun lahir: ");
            try {
                birth = ipt.nextInt();
                ipt.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid! Coba lagi.");
                ipt.nextLine();
            }
        }

        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int birthYear = currentYear - birth;

        System.out.println("\nData diri:");
        System.out.println("Nama: " + name);
        System.out.println("Jenis kelamin: " + gender);
        System.out.println("Umur: " + birthYear);

        ipt.close();
    }
}