package excercises.chapter_16.gemini;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Auto extends Application {
    /**
     * Lage: Du hast eine leere App. Du brauchst ein Animations-Spielfeld und ein Kontrollzentrum.

    Auftrag:

    Globale Steuerung: Baue "Start All"- und "Pause All"-Knöpfe. Diese müssen sofort und zuverlässig alle Animationen auf dem Spielfeld steuern.

    Wagen 1 (Speed): Implementiere eine stufenlose, kontinuierliche Geschwindigkeits-Steuerung für Wagen 1. Der Benutzer muss die Geschwindigkeit jederzeit anpassen können.
    Wagen 2 (Farbe): Implementiere eine Farbauswahl (Rot, Grün, Blau) für Wagen 2. Es darf immer nur eine dieser drei Farben gleichzeitig ausgewählt und angezeigt werden.
    Wagen 2 (Sichtbarkeit): Implementiere einen einzelnen "Schalter", der Wagen 2 sofort sichtbar oder unsichtbar macht.
     */

    @Override
    public void start(Stage arg0) throws Exception {
        Pane root = new Pane();
        Pane carOnePane = new Pane();
        Pane carTwoPane = new Pane();

        //Aufbau Auto 1
        Circle carOneFrontWheel = new Circle(100, 100, 15, Color.BLACK);
        Circle carOneRearWheel = new Circle(180, 100, 15, Color.BLACK);
        Rectangle carOneBody = new Rectangle(60, 55, 160, 30);

        carOnePane.getChildren().addAll(carOneFrontWheel, carOneRearWheel, carOneBody);

        //Aufbau Auto 2

        root.getChildren().addAll(carOnePane, carTwoPane);

        Scene scene = new Scene(root, 500, 500);

        arg0.setTitle("Auto");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
