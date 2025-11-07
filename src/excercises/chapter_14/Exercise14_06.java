package excercises.chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise14_06 extends Application{
    @Override
    public void start(Stage arg0) throws Exception {
        GridPane pane = new GridPane();
        
        for(int i = 0; i < 10; i++) {
            Color nextColor = Color.AQUA;
            for(int j = 0; j < 10; j++) {
                Rectangle rec = new Rectangle(50, 50);

                if(j == 0) {
                    if(i % 2 == 0) {
                        rec.setFill(Color.WHITE);
                    } else {
                        rec.setFill(Color.BLACK);
                    }
                } else {
                    rec.setFill(nextColor);
                }
                
                pane.add(rec, i, j);

                if(rec.getFill().equals(Color.BLACK)) {
                    nextColor = Color.WHITE;
                } else {
                    nextColor = Color.BLACK;
                }
            }
        }

        Scene scene = new Scene(pane);

        arg0.setTitle("14.6");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
