package excercises.chapter_14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_04 extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        HBox pane = new HBox();
        pane.setPadding(new Insets(20));

        String word = "TEST";

        for(int i = 0; i < 5; i++) {
            Text text = new Text(word);
            text.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 24));
            text.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
            text.setRotate(90);
            pane.getChildren().add(text);
        }

        Scene scene = new Scene(pane);

        arg0.setTitle("14.4");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
