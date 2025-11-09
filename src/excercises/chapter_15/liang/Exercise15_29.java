package excercises.chapter_15.liang;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise15_29 extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        BorderPane root = new BorderPane();
        Pane carPane = new Pane();

        Rectangle carBody = new Rectangle(50, 10);
        carBody.setFill(Color.ROYALBLUE);

        Rectangle cabin = new Rectangle(10, 10);
        cabin.setFill(Color.LIGHTBLUE);

        Polygon triangleLeft = new Polygon(
            10.0, 0.0,
            10.0, 10.0,
            0.0, 10.0
        );
        triangleLeft.setFill(Color.AQUAMARINE);

        Polygon triangleRight = new Polygon(
            0.0, 0.0,
            10.0, 10.0,
            0.0, 10.0
        );
        triangleRight.setFill(Color.AQUAMARINE);

        Circle leftWheel = new Circle(5);
        Circle rightWheel = new Circle(5);
        
        carBody.setX(10);
        carBody.setY(100);

        cabin.setX(30);
        cabin.setY(90);

        triangleLeft.setLayoutX(20);
        triangleLeft.setLayoutY(90);

        triangleRight.setLayoutX(40);
        triangleRight.setLayoutY(90);

        leftWheel.setCenterX(25);
        leftWheel.setCenterY(115);

        rightWheel.setCenterX(45);
        rightWheel.setCenterY(115);

        carPane.getChildren().addAll(carBody, cabin, triangleLeft, triangleRight, leftWheel, rightWheel);

        //Event Handler Logik
        root.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case RIGHT:
                    carPane.setLayoutX(carPane.getLayoutX() + 20);
                    break;
                case LEFT:
                    carPane.setLayoutX(carPane.getLayoutX() - 20);
                    break;
                default:
                    break;
            }
            
            if(carPane.getLayoutX() > 500) {
                carPane.setLayoutX(0);
            } else if(carPane.getLayoutX() < 0) {
                carPane.setLayoutX(500);
            }
        });

        root.getChildren().add(carPane);

        Scene scene = new Scene(root, 500, 500);

        arg0.setTitle("15.29 (mit PANE)");
        arg0.setScene(scene);
        arg0.show();

        root.requestFocus();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}