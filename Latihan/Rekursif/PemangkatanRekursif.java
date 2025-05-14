package Latihan;

public class PemangkatanRekursif {
    public static int recursiveFunction(int x, int y){
        if (y == 0){
            return 1;
        }else {
            return x * recursiveFunction(x, y-1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan angka: ");
        int number = FaktorialRekursif.input.nextInt();
        System.out.print("Masukkan pangkat: ");
        int exponent = FaktorialRekursif.input.nextInt();
        int result = recursiveFunction(2,3);
        System.out.println("Hasil dari " + number + " pangkat " + exponent + " adalah " + result );
    }
}
