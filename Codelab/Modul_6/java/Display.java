package Codelab.Modul_6.java;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;

public class Display {

    private TextField userInput = new TextField();
    private Label range = new Label();
    private Label tryCount = new Label();
    private GamePlay gamePlay;
    private Button gameButton = new Button();
    private ImageView refreshImage = new ImageView();
    private HBox hbox; // sekarang akan aman karena dibuat sebelum digunakan

    public void setGamePlay(GamePlay gamePlay) {
        this.gamePlay = gamePlay;
    }

    public TextField getUserInput() {
        return userInput;
    }

    public Label getRangeLabel() {
        return range;
    }

    public Label getTryCountLabel() {
        return tryCount;
    }

    public Button getGameButton() {
        return gameButton;
    }

    public ImageView getRefreshImage() {
        return refreshImage;
    }

    public void replaceButton(Button newButton) {
        if (hbox != null && hbox.getChildren().size() >= 2) {
            hbox.getChildren().set(1, newButton); // Ganti tombol ke-2
        }
    }

    public Scene getScene() {
        userInput.setPromptText("Masukkan angka di sini");
        userInput.setPrefWidth(200);
        userInput.setPrefHeight(35);
        userInput.setStyle("-fx-font-size: 14px;");

        Image dice = new Image("file:C:/Semester II/OOP/OOP/src/Codelab/Modul_6/resources/assets/images/dice.png");
        ImageView diceImage = new ImageView(dice);
        diceImage.setFitWidth(30);
        diceImage.setFitHeight(30);

        Image refresh = new Image("file:C:/Semester II/OOP/OOP/src/Codelab/Modul_6/resources/assets/images/refresh.png");
        refreshImage.setImage(refresh);
        refreshImage.setFitWidth(35);
        refreshImage.setFitHeight(35);

        gameButton.setText("Coba Tebak!");
        gameButton.setGraphic(diceImage);
        gameButton.setStyle("-fx-background-color: #46AD4A; -fx-text-fill: white; -fx-font-size: 12px;");
        gameButton.setContentDisplay(ContentDisplay.LEFT);
        gameButton.setGraphicTextGap(5);
        gameButton.setPrefWidth(160);
        gameButton.setPrefHeight(45);
        gameButton.setOnAction(e -> gamePlay.buttonOnClick());

        tryCount.setText("Jumlah percobaan: 0");
        tryCount.setStyle("-fx-font-size: 16px;");

        Image bow = new Image("file:C:/Semester II/OOP/OOP/src/Codelab/Modul_6/resources/assets/images/bow.png");
        ImageView bowImage = new ImageView(bow);
        bowImage.setFitWidth(60);
        bowImage.setFitHeight(60);

        Label title = new Label("Tebak Angka 1-100", bowImage);
        title.setStyle("-fx-text-fill: #000089; -fx-font-size: 20px; -fx-font-weight: bold;");

        range.setText("Masukkan tebakanmu!");
        range.setStyle("-fx-font-size: 18px;");

        hbox = new HBox(userInput, gameButton);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(15);

        VBox display = new VBox(title, range, hbox, tryCount);
        display.setAlignment(Pos.CENTER);
        display.setSpacing(20);
        display.setPadding(new Insets(40));
        display.setStyle("-fx-background-color: #EFF7FE;");

        Scene scene = new Scene(display, 500, 400);
        Platform.runLater(() -> display.requestFocus());

        return scene;
    }
}
