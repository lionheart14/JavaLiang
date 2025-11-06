package excercises.chapter_15.gemini;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class exercise1 extends Application{
    @Override
    public void start(Stage primaryStage) {
        // 1. Layout-Container erstellen
        HBox pane = new HBox(10); // HBox mit 10px Abstand
        pane.setAlignment(Pos.CENTER); // Zentriert die Elemente

        // 2. GUI-Elemente (Sources) erstellen
        Button btOK = new Button("OK");
        Button btCancel = new Button("Abbrechen");

        // ######################################################
        // DEIN CODE HIER:
        // Registriere die Event Handler für btOK und btCancel
        // Tipp: btOK.setOnAction( e -> { ... } );
        // ######################################################

        btOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                System.out.println("Ok gecklickt");
            }
            
        });
        
        btCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                System.out.println("Abbrechen gecklickt");
            }
            
        });


        // 3. Elemente zum Layout hinzufügen
        pane.getChildren().addAll(btOK, btCancel);

        // 4. Scene und Stage einrichten
        Scene scene = new Scene(pane, 250, 100);
        primaryStage.setTitle("Übung 1: BasicClick");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
