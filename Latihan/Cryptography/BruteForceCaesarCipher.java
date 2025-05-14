import java.util.Scanner;

public class BruteForceCaesarCipher {

    // Metode untuk mengenkripsi/dekripsi teks dengan shift tertentu
    public static String caesarShift(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isUpperCase(ch)) {
                char shiftedChar = (char) ((ch - 'A' + shift) % 26 + 'A');
                result.append(shiftedChar);
            } else if (Character.isLowerCase(ch)) {
                char shiftedChar = (char) ((ch - 'a' + shift) % 26 + 'a');
                result.append(shiftedChar);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    // Metode brute force mencoba semua kemungkinan shift dari 1 sampai maxShift
    public static void bruteForceDecrypt(String encryptedText, int maxShift) {
        System.out.println("Melakukan brute force untuk shift dari 1 sampai " + maxShift + "...");

        for (int shift = 1; shift <= maxShift; shift++) {
            // Untuk dekripsi, geser ke kiri (negatif), bisa juga gunakan (26 - shift)
            String decrypted = caesarShift(encryptedText, 26 - shift);
            System.out.println("Shift " + shift + ": " + decrypted);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan teks terenkripsi: ");
        String encryptedText = scanner.nextLine();

        System.out.print("Masukkan jumlah percobaan brute force (nilai shift maksimum): ");
        int maxShift = scanner.nextInt();

        if (maxShift <= 0 || maxShift > 26) {
            System.out.println("Jumlah percobaan harus antara 1 sampai 26. Program dihentikan.");
        } else {
            bruteForceDecrypt(encryptedText, maxShift);
        }

        scanner.close();
    }
}
