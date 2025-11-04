package excercises.chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Exercise14_11 extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
        Pane pane = new Pane();
        pane.setPrefSize(1000, 1000);

        Circle face = new Circle(500, 500, 300);
        face.setFill(Color.WHITE);
        face.setStroke(Color.BLACK);

        Ellipse eye1 = new Ellipse(700, 700, 50, 100);
        eye1.setFill(Color.WHITE);
        eye1.setStroke(Color.BLACK);


        pane.getChildren().addAll(face, eye1);


        Scene scene = new Scene(pane);

        arg0.setTitle("14_10");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
