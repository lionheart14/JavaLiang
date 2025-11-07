package excercises.chapter_15.gemini;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos; // Wichtig für Alignment
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField; // Spezielles Feld für Passwörter
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise6_LayoutPuzzle extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        // 1. Der Haupt-Container
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10)); // Etwas Luft

        // ######################################################
        // DEIN CODE HIER: TEIL 1 - Das GridPane (Zentrum)
        // ######################################################
        
        // 1. Erstelle das GridPane
        GridPane grid = new GridPane();
        grid.setHgap(10); // Horizontaler Abstand zwischen Spalten
        grid.setVgap(10); // Vertikaler Abstand zwischen Zeilen

        // 2. Erstelle die GUI-Elemente für das Grid
        Label userLabel = new Label("Benutzername:");
        TextField userField = new TextField();
        Label passLabel = new Label("Passwort:");
        PasswordField passField = new PasswordField();
        
        // 3. Füge die Elemente dem Grid hinzu
        //    (Wie fügt man Elemente an bestimmten Gitter-Positionen hinzu?)
        //    Tipp: grid.add(node, spalte, zeile);
        
        
        
        // ######################################################
        // DEIN CODE HIER: TEIL 2 - Die HBox (Unten)
        // ######################################################

        // 1. Erstelle die HBox
        HBox buttonPane = new HBox(10); // 10px Abstand
        // (Wie richtest du den *Inhalt* der HBox rechtsbündig aus?)
        
        // 2. Erstelle die Buttons
        Button btSave = new Button("Speichern");
        Button btCancel = new Button("Abbrechen");
        
        // 3. Füge die Buttons der HBox hinzu
        
        

        // ######################################################
        // DEIN CODE HIER: TEIL 3 - Alles zusammenfügen
        // ######################################################
        
        // 1. Setze das 'grid' in den Zentrum-Bereich der 'root' (BorderPane)
        
        // 2. Setze die 'buttonPane' in den Bottom-Bereich der 'root' (BorderPane)


        // 4. Scene und Stage
        Scene scene = new Scene(root, 400, 150);
        primaryStage.setTitle("Übung 6: Layout-Puzzle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
