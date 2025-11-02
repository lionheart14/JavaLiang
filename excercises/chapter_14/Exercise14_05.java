package excercises.chapter_14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_05 extends Application{
    @Override
    public void start(Stage arg0) throws Exception {
        String s = "Learning JavaFX";

        Pane pane = new Pane();
        pane.setPadding(new Insets(30));
        pane.getChildren().add(new Text(s));

        Scene scene = new Scene(pane);

        arg0.setTitle("14.5");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
