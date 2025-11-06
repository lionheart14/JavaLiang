package excercises.chapter_15.gemini;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class exercise2 extends Application {
    
    // Den Kreis als Instanzvariable deklarieren, 
    // damit der Handler darauf zugreifen kann
    private Circle circle = new Circle(50); 
    
    @Override
    public void start(Stage primaryStage) {
        // 1. Layout-Container
        BorderPane mainPane = new BorderPane();
        Pane circlePane = new Pane(); // Ein Pane, damit der Kreis frei positionierbar ist
        HBox buttonPane = new HBox(10);
        buttonPane.setAlignment(Pos.CENTER);
        
        // 2. GUI-Elemente (Sources)
        circle.setCenterX(150);
        circle.setCenterY(100);
        circle.setFill(Color.BLUE);
        circlePane.getChildren().add(circle);
        
        Button btLeft = new Button("Links");
        Button btRight = new Button("Rechts");
        buttonPane.getChildren().addAll(btLeft, btRight);
        
        // 3. Layout zusammenbauen
        mainPane.setCenter(circlePane);
        mainPane.setBottom(buttonPane);

        // ######################################################
        // DEIN CODE HIER:
        // Registriere Handler für btLeft und btRight
        // ######################################################

        btLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                circle.setCenterX(circle.getCenterX() - 30);
                circlePane.getChildren().clear();
                circlePane.getChildren().add(circle);
            }
            
        });

        btRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                circle.setCenterX(circle.getCenterX() + 30);
                circlePane.getChildren().clear();
                circlePane.getChildren().add(circle);
            }
            
        });

        // 4. Scene und Stage
        Scene scene = new Scene(mainPane, 300, 200);
        primaryStage.setTitle("Übung 2: MoveCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
