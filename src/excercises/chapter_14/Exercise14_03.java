package excercises.chapter_14;

import java.util.ArrayList;
import java.util.Collections;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Exercise14_03 extends Application{
    @Override
    public void start(Stage arg0) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 32; i++) {
            list.add(i);
        }

        Collections.shuffle(list);

        //PANE LOGIK
        HBox pane = new HBox();

        for(int i = 0; i < 3; i++) {
            int number = list.get(i);
            Image bild = new Image("file:C:\\DevVSC\\JavaLiang\\excercises\\chapter_14\\resources\\n" + //
                                "o.png");
            ImageView bildDarstellung = new ImageView(bild);
            bildDarstellung.setFitHeight(100);
            bildDarstellung.setFitWidth(100);
            pane.getChildren().add(bildDarstellung);
        }

        //SCENE LOGIK
        Scene scene = new Scene(pane);

        arg0.setTitle("14.3");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
