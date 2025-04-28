package Codelab.Modul_3;

public class Main {
    public static void main(String[] args) {
        Pahlawan pahlawan1 = new Pahlawan("Brimstone", 150);
        Musuh musuh1 = new Musuh("Viper", 200);

        pahlawan1.displayInfo();
        musuh1.displayInfo();

        pahlawan1.serang(musuh1);
        musuh1.serang(pahlawan1);
    }
}
