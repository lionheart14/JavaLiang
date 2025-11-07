package excercises.chapter_15.gemini;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise5_MouseFollower extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Circle circle = new Circle(20, Color.ORANGE); // Kreis mit Radius 20
        pane.getChildren().add(circle);

        // ######################################################
        // DEIN CODE HIER:
        // Registriere einen Handler für Mausbewegungen auf der 'Pane'.
        
        pane.setOnMouseMoved(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent arg0) {
                circle.setCenterX(arg0.getX());
                circle.setCenterY(arg0.getY());
            }
            
        });
        // ######################################################

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Übung 5: MouseFollower");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
