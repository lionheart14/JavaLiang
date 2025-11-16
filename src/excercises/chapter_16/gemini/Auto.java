package excercises.chapter_16.gemini;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Auto extends Application {
    /**
     * Lage: Du hast eine leere App. Du brauchst ein Animations-Spielfeld und ein Kontrollzentrum.

    Auftrag:

    Globale Steuerung: Baue "Start All"- und "Pause All"-Knöpfe. Diese müssen sofort und zuverlässig alle Animationen auf dem Spielfeld steuern.

    Wagen 1 (Speed): Implementiere eine stufenlose, kontinuierliche Geschwindigkeits-Steuerung für Wagen 1. Der Benutzer muss die Geschwindigkeit jederzeit anpassen können.
    Wagen 2 (Farbe): Implementiere eine Farbauswahl (Rot, Grün, Blau) für Wagen 2. Es darf immer nur eine dieser drei Farben gleichzeitig ausgewählt und angezeigt werden.
    Wagen 2 (Sichtbarkeit): Implementiere einen einzelnen "Schalter", der Wagen 2 sofort sichtbar oder unsichtbar macht.
     */
    double moveSpeed = 0.5;
    @Override
    public void start(Stage arg0) throws Exception {
        Pane root = new Pane();
        Pane carOnePane = new Pane();
        Pane carTwoPane = new Pane();

        //Aufbau Auto 1
        Circle carOneFrontWheel = new Circle(100, 100, 15, Color.BLACK);
        Circle carOneRearWheel = new Circle(180, 100, 15, Color.BLACK);
        Rectangle carOneBody = new Rectangle(60, 55, 160, 30);
        Rectangle carOneRoof = new Rectangle(90, 25, 100, 30);
        
        carOnePane.getChildren().addAll(carOneFrontWheel, carOneRearWheel, carOneBody, carOneRoof);

        //Aufbau Auto 2
        Circle carTwoFrontWheel = new Circle(100, 100, 15, Color.BLACK);
        Circle carTwoRearWheel = new Circle(180, 100, 15, Color.BLACK);
        Rectangle carTwoBody = new Rectangle(60, 55, 160, 30);
        Rectangle carTwoRoof = new Rectangle(90, 25, 100, 30);

        carTwoPane.getChildren().addAll(carTwoFrontWheel, carTwoRearWheel, carTwoBody, carTwoRoof);

        //Kontrollsystem Auto 1 und Animation
        Timeline timeline = new Timeline();

        KeyFrame frame = new KeyFrame(
            Duration.millis(16),
            event -> {
                for(int i = 0; i < carOnePane.getChildren().size(); i++) {
                    carOnePane.setLayoutX(carOnePane.getLayoutX() + moveSpeed);
                }

                if(carOnePane.getLayoutX() >= root.getWidth()) {
                    carOnePane.setLayoutX(-200);
                }
            }

        );

        timeline.getKeyFrames().add(frame);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        Label sliderLabel = new Label("Speed");
        Slider slider = new Slider(0, 10, 0.5);

        ChangeListener<Number> e = (obs, old, newVal) -> {
            moveSpeed = slider.getValue();
        };

        slider.valueProperty().addListener(e);
        
        //Kontrollsystem Auto 2
        HBox controlPaneCarTwo = new HBox();
        controlPaneCarTwo.setSpacing(10);

        ToggleGroup carTwoColorGroup = new ToggleGroup();
        RadioButton red = new RadioButton("Red");
        RadioButton green = new RadioButton("Green");
        RadioButton blue = new RadioButton("Blue");

        CheckBox opacity = new CheckBox("Opacity");

        red.toggleGroupProperty().set(carTwoColorGroup);
        green.toggleGroupProperty().set(carTwoColorGroup);
        blue.toggleGroupProperty().set(carTwoColorGroup);

        carTwoColorGroup.selectedToggleProperty().addListener((oberservable, old, newToggle) -> {
            RadioButton selectedButton = (RadioButton) newToggle;
            switch (selectedButton.getText()) {
                case "Red":
                    for(int i = 0; i < carTwoPane.getChildren().size(); i++) {
                        Shape shape = (Shape) carTwoPane.getChildren().get(i);
                        shape.setFill(Color.RED);
                    }
                    break;
                case "Green":
                    for(int i = 0; i < carTwoPane.getChildren().size(); i++) {
                        Shape shape = (Shape) carTwoPane.getChildren().get(i);
                        shape.setFill(Color.GREEN);
                    }
                    break;
                case "Blue":
                    for(int i = 0; i < carTwoPane.getChildren().size(); i++) {
                        Shape shape = (Shape) carTwoPane.getChildren().get(i);
                        shape.setFill(Color.BLUE);
                    }
                    break;
                default:
                    break;
            }
        });

        opacity.setOnAction(ev -> {
            int opacityValue = 1;

            if(opacity.isSelected()) {
                opacityValue = 0;
            }

            for(int i = 0; i < carTwoPane.getChildren().size(); i++) {
                Shape shape = (Shape) carTwoPane.getChildren().get(i);
                shape.setOpacity(opacityValue);
            }
        });

        controlPaneCarTwo.getChildren().addAll(red, green, blue, opacity);

        root.getChildren().addAll(carOnePane, slider, sliderLabel, carTwoPane, controlPaneCarTwo);

        carOnePane.setLayoutX(100);
        carOnePane.setLayoutY(100); // Auto 1 ist in Zeile 100

        slider.setLayoutX(170);
        slider.setLayoutY(250);

        sliderLabel.setLayoutX(225);
        sliderLabel.setLayoutY(270);

        carTwoPane.setLayoutX(100);
        carTwoPane.setLayoutY(300);

        controlPaneCarTwo.setLayoutX(130);
        controlPaneCarTwo.setLayoutY(450);

        Scene scene = new Scene(root, 500, 500);

        arg0.setTitle("Auto");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
