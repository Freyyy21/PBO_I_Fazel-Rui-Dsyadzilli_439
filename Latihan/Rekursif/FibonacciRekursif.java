package Latihan;

public class FibonacciRekursif {
    public static int recursiveFunction(int n){
        if (n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return  recursiveFunction(n-1) + recursiveFunction(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan angka: ");
        int number = FaktorialRekursif.input.nextInt();
        int result = recursiveFunction(number);
        System.out.println("Fibonacci dari " + number + " adalah: " + result);

    }

}
