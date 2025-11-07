package excercises.chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise14_10 extends Application{
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        Pane pane = new Pane();
        pane.setPrefSize(1000, 1000);

        Ellipse ellipse1 = new Ellipse(500, 300, 300, 100);
        ellipse1.setFill(Color.WHITE);
        ellipse1.setStroke(Color.BLACK);
        
        Line line1 = new Line(200, 300, 200, 800);
        Line line2 = new Line(800, 300, 800, 800);

        Arc ellipse2_bottom = new Arc(500, 800, 300, 100, 180, 180);
        ellipse2_bottom.setFill(Color.WHITE);
        ellipse2_bottom.setStroke(Color.BLACK);

        Arc ellipse3_top = new Arc(500, 800, 300, 100, 180, -180);
        ellipse3_top.setFill(Color.WHITE);
        ellipse3_top.setStroke(Color.BLACK);
        ellipse3_top.getStrokeDashArray().addAll(6.0, 21.0);

        pane.getChildren().addAll(ellipse1, ellipse2_bottom, ellipse3_top, line1, line2);


        Scene scene = new Scene(pane);

        arg0.setTitle("14_10");
        arg0.setScene(scene);
        arg0.show();
    }
}
