package excercises.chapter_15.gemini;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode; // Wichtig!
import javafx.scene.input.KeyEvent;

public class exercise3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Circle circle = new Circle(150, 100, 50, Color.BLUE);
        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 300, 200);

        // ######################################################
        // DEIN CODE HIER:
        // Registriere einen Handler für KeyEvents.
        // WICHTIG: KeyEvents werden oft auf der 'Scene' registriert,
        // da diese immer den Fokus hat, wenn das Fenster aktiv ist.
        
        // scene.setOnKeyPressed( e -> {
        //    // Prüfe, welche Taste gedrückt wurde:
        //    if (e.getCode() == KeyCode.LEFT) {
        //        // Kreis nach links bewegen
        //    } else if (e.getCode() == KeyCode.RIGHT) {
        //        // ...
        //    }
        //    // ... (für UP und DOWN)
        // });
        // ######################################################

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent arg0) {
                if(arg0.getCode() == KeyCode.LEFT) {
                    circle.setCenterX(circle.getCenterX() - 10);
                } else if(arg0.getCode() == KeyCode.RIGHT) {
                    circle.setCenterX(circle.getCenterX() + 10);
                }
            } 
        });


        primaryStage.setTitle("Übung 3: KeyEvents");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        // Fordere den Fokus für das Pane an, damit es Tasten empfängt
        // (Alternativ zur Scene)
        pane.requestFocus(); 
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
