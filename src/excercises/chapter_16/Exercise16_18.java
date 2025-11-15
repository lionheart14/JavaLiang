package excercises.chapter_16;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise16_18 extends Application{
    int rotationSpeed = 1;

    @Override
    public void start(Stage arg0) throws Exception {
        VBox root = new VBox();
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.setFillWidth(false);
        root.setSpacing(10); // Füge etwas Abstand hinzu

        // 1. Definiere eine Größe für die Pane
        Pane circlePane = new Pane();
        double paneSize = 300; // Lass uns 300x300 als Größe festlegen
        circlePane.setPrefSize(paneSize, paneSize);

        // 2. Definiere den Mittelpunkt RELATIV ZUR PANE
        double centerX = paneSize / 2; // = 150
        double centerY = paneSize / 2; // = 150

        // 3. Baue den Ventilator um den neuen Mittelpunkt
        Circle circle = new Circle(100);
        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.BLACK);
        circle.setCenterX(centerX);
        circle.setCenterY(centerY);

        int startingPosition = 0;
        for(int i = 0; i < 6; i++) {
            // Benutze centerX/Y für die Arcs
            Arc arc = new Arc(centerX, centerY, 90, 90, startingPosition, 30);
            arc.setType(ArcType.ROUND);
            circlePane.getChildren().add(arc);
            startingPosition += 60;
        }

        Slider slider = new Slider(0, 10, 1); // Max 10, Start 1
        slider.setPrefWidth(100);
        
        // 4. BINDE die Rate an den Slider (Das ist 16.18)
        Timeline animation = new Timeline();
        // animation.rateProperty().bind(slider.valueProperty()); // <-- DAS IST DER BINDING-TEIL

        // 5. Baue die Rotation um den neuen Mittelpunkt
        Rotate pivotRotate = new Rotate(0, centerX, centerY);
        circlePane.getTransforms().add(pivotRotate);

        KeyFrame frame = new KeyFrame(
            Duration.millis(16), 
            event -> {
                double currentAngle = pivotRotate.getAngle();
                // Verwende nicht 'rotationSpeed', binde direkt an den Slider
                pivotRotate.setAngle(currentAngle + slider.getValue());
            }
        );
        
        // ... (Restlicher Code für Animation)
        animation.getKeyFrames().add(frame);
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        // Key-Events (Fokus auf die Szene setzen, nicht die Pane)
        
        circlePane.getChildren().addAll(circle);
        root.getChildren().addAll(circlePane, slider);
        Scene scene = new Scene(root, 500, 500); // Szene bleibt 500x500

        // 6. KeyEvents auf die Szene legen (stabiler)
        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case P: animation.pause(); break;
                case R: animation.play(); break;
                // 'B' (Backwards) wird jetzt vom Slider gesteuert
                // z.B. slider.setValue(slider.getValue() * -1);
            }
        });

        arg0.setTitle("16.18");
        arg0.setScene(scene);
        arg0.show();

        // (RequestFocus ist nicht mehr nötig, da der Event auf der Szene liegt)
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}

