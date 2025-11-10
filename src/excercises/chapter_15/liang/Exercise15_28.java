package excercises.chapter_15.liang;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise15_28 extends Application{
    int rotationSpeed = 1;

    @Override
    public void start(Stage arg0) throws Exception {
        Pane pane = new Pane();

        Circle circle = new Circle(100);
        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.BLACK);
        circle.setCenterX(250);
        circle.setCenterY(250);

        int startingPosition = 0;
        for(int i = 0; i < 6; i++) {
            Arc arc = new Arc(250, 250, 90, 90, startingPosition, 30);
            arc.setType(ArcType.ROUND);
            pane.getChildren().add(arc);
            startingPosition += 60;
        }

        Timeline animation = new Timeline();

        double pivotX = 250.0;
        double pivotY = 250.0;
        Rotate pivotRotate = new Rotate(0, pivotX, pivotY);
        pane.getTransforms().add(pivotRotate);

        KeyFrame frame = new KeyFrame(
            Duration.millis(16), 
            event -> {
                double currentAngle = pivotRotate.getAngle();
                pivotRotate.setAngle(currentAngle += rotationSpeed);
            }
        );

        animation.getKeyFrames().add(frame);
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        pane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case P:
                    animation.pause();
                    break;
                case R:
                    animation.play();
                    break;
                case B: 
                    rotationSpeed *= -1;
                default:
                    break;
            }
        });

        pane.getChildren().addAll(circle);
        Scene scene = new Scene(pane, 500, 500);

        arg0.setTitle("15.28");
        arg0.setScene(scene);
        arg0.show();

        pane.requestFocus();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
