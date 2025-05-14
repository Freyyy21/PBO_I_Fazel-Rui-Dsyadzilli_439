package Latihan;
import java.util.Scanner;

public class FaktorialRekursif {
    static Scanner input = new Scanner(System.in);

    public static int recursiveFunction(int n){
        if (n == 1 || n == 0){
            return 1;
        }else {
            return recursiveFunction(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan angka: ");
        int number = input.nextInt();
        int result = recursiveFunction(number);
        System.out.println("faktorial dari " + number + " adalah = " + result);
    }


}
