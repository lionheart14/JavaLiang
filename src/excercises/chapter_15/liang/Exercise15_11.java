package excercises.chapter_15.liang;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise15_11 extends Application {
//     Move a circle using keys) Write a program that moves a circle up, down, left,
// or right using the arrow keys.

    @Override
    public void start(Stage arg0) throws Exception {
        Pane root = new Pane();

        Circle circle = new Circle(250, 250, 50, Color.GREEN);
        root.getChildren().add(circle);

        root.setOnKeyPressed(event ->{
            switch (event.getCode()) {
                case UP:
                    circle.setCenterY(circle.getCenterY() - 10);
                    break;
                case DOWN:
                    circle.setCenterY(circle.getCenterY() + 10);
                    break;
                case LEFT:
                    circle.setCenterX(circle.getCenterX() - 10);
                    break;
                case RIGHT:
                    circle.setCenterX(circle.getCenterX() + 10);
                    break;
                default:
                    break;
            }
        });


        Scene scene = new Scene(root, 500, 500);

        arg0.setTitle("15.11");
        arg0.setScene(scene);
        arg0.show();

        root.requestFocus();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
