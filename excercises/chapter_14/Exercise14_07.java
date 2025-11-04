package excercises.chapter_14;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise14_07 extends Application{
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        GridPane pane = new GridPane();

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                String num = String.valueOf((int) (Math.random() * 2));
                TextField text = new TextField(num);
                text.setPrefWidth(30);
                text.setPrefHeight(30);
                text.setAlignment(Pos.CENTER);

                pane.add(text, i, j);
            }
        }

        Scene scene = new Scene(pane);

        arg0.setTitle("14.7");
        arg0.setScene(scene);
        arg0.show();
    }
}
