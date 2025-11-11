package excercises.chapter_16;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise16_03 extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
        VBox root = new VBox();
        Pane trafficPane = new Pane();
        
        Rectangle rectangle = new Rectangle(0, 0, 200, 60);
        rectangle.setFill(Color.TRANSPARENT);
        rectangle.setStroke(Color.BLACK);

        Circle redCircle = new Circle(30, 30, 25);
        redCircle.setFill(Color.TRANSPARENT);
        redCircle.setStroke(Color.BLACK);
        Circle yellowCircle = new Circle(100, 30, 25);
        yellowCircle.setFill(Color.TRANSPARENT);
        yellowCircle.setStroke(Color.BLACK);
        Circle greenCircle = new Circle(170, 30, 25);
        greenCircle.setFill(Color.TRANSPARENT);
        greenCircle.setStroke(Color.BLACK);

        trafficPane.getChildren().addAll(redCircle, yellowCircle, greenCircle, rectangle);
        trafficPane.setMaxSize(javafx.scene.layout.Region.USE_PREF_SIZE, 
                      javafx.scene.layout.Region.USE_PREF_SIZE);

        HBox checkboxPane = new HBox();
        checkboxPane.setPadding(new Insets(20));
        checkboxPane.setSpacing(20);

        ToggleGroup trafficGroup = new ToggleGroup();
        RadioButton redBox = new RadioButton("Red");
        RadioButton yellowBox = new RadioButton("Yellow");
        RadioButton greenBox = new RadioButton("Green");

        redBox.setToggleGroup(trafficGroup);
        yellowBox.setToggleGroup(trafficGroup);
        greenBox.setToggleGroup(trafficGroup);
        checkboxPane.getChildren().addAll(redBox, yellowBox, greenBox);

        trafficGroup.selectedToggleProperty().addListener((observable, oldToggle, newToggle) -> {
            redCircle.setFill(Color.TRANSPARENT);
            yellowCircle.setFill(Color.TRANSPARENT);
            greenCircle.setFill(Color.TRANSPARENT);
            if(newToggle != null) {
                RadioButton selectedButton = (RadioButton) newToggle;
                switch (selectedButton.getText()) {
                    case "Red":
                    redCircle.setFill(Color.RED);
                    break;
                    case "Yellow":
                    yellowCircle.setFill(Color.YELLOW);
                    break;
                    case "Green":
                    greenCircle.setFill(Color.GREEN);
                    break;
                    default:
                    break;
                }
            }
        });
        
        checkboxPane.setAlignment(Pos.CENTER);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(trafficPane, checkboxPane);

        Scene scene = new Scene(root, 500, 500);

        arg0.setTitle("16.03");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}