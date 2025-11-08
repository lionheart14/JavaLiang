package excercises.chapter_15.liang;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise15_17 extends Application{
//     (Change color using a mouse) Write a program that displays the color of a circle
// as red when the mouse button is pressed and as blue when the mouse button
// is released.
    @Override
    public void start(Stage arg0) throws Exception {
        Pane pane = new Pane();

        Circle circle = new Circle(50, Color.BLUE);
        circle.setCenterX(250);
        circle.setCenterY(250);
        pane.getChildren().add(circle);

        pane.setOnMousePressed(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent arg0) {
                circle.setCenterX(arg0.getX());
                circle.setCenterY(arg0.getY());
                circle.setFill(Color.RED);
            }
            
        });

        pane.setOnMouseReleased(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent arg0) {
                circle.setFill(Color.BLUE);
            }
            
        });

        pane.setOnMouseDragged(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent arg0) {
                circle.setCenterX(arg0.getX());
                circle.setCenterY(arg0.getY());
                circle.setFill(Color.RED);
            }
            
        });

        Scene scene = new Scene(pane, 500, 500);

        arg0.setTitle("15.17");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
