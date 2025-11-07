package excercises.chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise14_01 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        TilePane pane = new TilePane();
        pane.setPrefColumns(3);

        Image imageNo = new Image("file:C:\\DevVSC\\JavaLiang\\excercises\\chapter_14\\resources\\no.png");
        Image imageYes = new Image("file:C:\\DevVSC\\JavaLiang\\excercises\\chapter_14\\resources\\yes.png");

        for(int i = 0; i < 9; i++) {
            int num = (int) (Math.random() * 3);
            ImageView view;
            switch (num) {
                case 1:
                    view = new ImageView(imageNo);
                    break;
                case 2:
                    view = new ImageView(imageYes);
                    break;
                case 3:
                    view = new ImageView();
                    break;
                default: view = new ImageView();
            }

            view.setFitWidth(100);
            view.setFitHeight(100);

            pane.getChildren().add(view);
        }

        Scene scene = new Scene(pane, 305, 305);

        primaryStage.setTitle("Exercise14_02");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
