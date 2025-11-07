package excercises.chapter_15.gemini;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox; // Vertical Box
import javafx.stage.Stage;

public class Exercise4_HandleInput extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // 1. Layout-Container
        VBox pane = new VBox(10);
        pane.setAlignment(Pos.CENTER_LEFT);
        pane.setPadding(new Insets(10));

        // 2. GUI-Elemente
        Label nameLabel = new Label("Dein Name:");
        TextField nameField = new TextField(); // Das Eingabefeld
        Button btConfirm = new Button("Bestätigen");
        Label resultLabel = new Label(); // Das leere Ergebnis-Label

        // 3. Elemente zum Layout hinzufügen
        pane.getChildren().addAll(nameLabel, nameField, btConfirm, resultLabel);

        // ######################################################
        // DEIN CODE HIER:
        // Registriere einen Handler für btConfirm
        
        btConfirm.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                String name = nameField.getText();
                resultLabel.setText("Hallo " + name);
            }

        });

        // 4. Scene und Stage
        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setTitle("Übung 4: HandleInput");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
