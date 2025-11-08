package excercises.chapter_15.liang;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise15_15 extends Application{
//     (Geometry: add and remove points) Write a program that lets the user click on
// a pane to dynamically create and remove points (see Figure 15.30a). When the
// user left-clicks the mouse (primary button), a point is created and displayed
// at the mouse point. The user can remove a point by pointing to it and right-
// clicking the mouse (secondary button)
    @Override
    public void start(Stage arg0) throws Exception {
        Pane mainPane = new Pane();

        mainPane.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent arg0) {
                if(arg0.getButton() == MouseButton.PRIMARY) {
                    double x = arg0.getX();
                    double y = arg0.getY();
    
                    Circle circle = new Circle(x, y, 10, Color.BLACK);
    
                    mainPane.getChildren().add(circle);
                } else if(arg0.getButton() == MouseButton.SECONDARY) {
                    double x = arg0.getX();
                    double y = arg0.getY();

                    for(int i = 0; i < mainPane.getChildren().size(); i++) {
                        if(mainPane.getChildren().get(i).contains(x, y)) {
                            mainPane.getChildren().remove(i);
                        }
                    }
                }
            }            
        });

        mainPane.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent arg0) {
                double x = arg0.getX();
                double y = arg0.getY();

                Circle circle = new Circle(x, y, 1, Color.BLACK);

                mainPane.getChildren().add(circle);
            }
            
        });

        Scene scene = new Scene(mainPane, 500, 500);

        arg0.setTitle("15_15");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    
}
