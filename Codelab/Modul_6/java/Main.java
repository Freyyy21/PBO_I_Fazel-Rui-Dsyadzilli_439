package Codelab.Modul_6.java;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Display display = new Display();
        stage.setScene(display.getScene());

        GamePlay gamePlay = new GamePlay(display);
        display.setGamePlay(gamePlay);

        gamePlay.resetGame();

        stage.setTitle("Tebak Angka Advance");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
