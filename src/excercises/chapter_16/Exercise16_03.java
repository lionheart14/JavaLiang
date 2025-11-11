package excercises.chapter_16;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise16_03 extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
        BorderPane root = new BorderPane();
        Pane trafficPane = new Pane();
        
        Rectangle rectangle = new Rectangle(0, 0, 200, 60);
        rectangle.setFill(Color.TRANSPARENT);
        rectangle.setStroke(Color.BLACK);

        Circle redCircle = new Circle(30, 30, 25);
        Circle yellowCircle = new Circle(100, 30, 25);
        Circle greenCircle = new Circle(170, 30, 25);

        trafficPane.getChildren().addAll(redCircle, yellowCircle, greenCircle, rectangle);
        trafficPane.setMaxSize(javafx.scene.layout.Region.USE_PREF_SIZE, 
                      javafx.scene.layout.Region.USE_PREF_SIZE);

        root.setCenter(trafficPane);

        Scene scene = new Scene(root, 500, 500);

        arg0.setTitle("16.03");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}