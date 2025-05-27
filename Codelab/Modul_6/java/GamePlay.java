package Codelab.Modul_6.java;

import java.util.concurrent.ThreadLocalRandom;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;

public class GamePlay {
    private int target;
    private final Display display;
    private int count;

    public int getCount() {
        return count;
    }

    public GamePlay(Display display) {
        this.display = display;
    }

    public void resetGame() {
        int min = 1;
        int max = 100;
        this.target = ThreadLocalRandom.current().nextInt(min, max + 1);
        this.count = 0;
        display.getTryCountLabel().setText("Jumlah percobaan: 0");
        display.getUserInput().clear();
        display.getRangeLabel().setText("Masukkan tebakanmu!");
        display.replaceButton(display.getGameButton());
    }

    public Button getIfTrue() {
        Button newButton = new Button("Main Lagi");
        newButton.setGraphic(display.getRefreshImage());
        newButton.setContentDisplay(ContentDisplay.LEFT);
        newButton.setStyle("-fx-background-color: #2095F2; -fx-text-fill: white;");
        newButton.setPrefWidth(160);
        newButton.setPrefHeight(45);
        newButton.setOnAction(e -> resetGame());
        return newButton;
    }

    public void buttonOnClick() {
        try {
            System.out.println(target);
            String inputText = display.getUserInput().getText();
            int input = Integer.parseInt(inputText);

            count++;
            display.getTryCountLabel().setText("Jumlah percobaan: " + count);

            if (input == target) {
                display.getRangeLabel().setText("Tebakan benar!");
                Button newButton = getIfTrue();
                display.replaceButton(newButton);
            } else if (input < target) {
                display.getRangeLabel().setText("Terlalu kecil!");
            } else {
                display.getRangeLabel().setText("Terlalu besar!");
            }

        } catch (NumberFormatException e) {
            display.getRangeLabel().setText("Masukkan angka valid!");
        }
    }
}
