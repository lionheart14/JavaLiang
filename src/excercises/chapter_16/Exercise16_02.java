package excercises.chapter_16;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class Exercise16_02 extends Application{
    Shape currentShape;

    @Override
    public void start(Stage arg0) throws Exception {
        StackPane pane = new StackPane();
        HBox buttonPane = new HBox();
        buttonPane.setPadding(new Insets(10));
        buttonPane.setSpacing(10);

        //Buttons
        ToggleGroup buttonGroup = new ToggleGroup();
        RadioButton ellipseButton = new RadioButton("Ellipse");
        RadioButton squareButton = new RadioButton("Square");
        RadioButton circleButton = new RadioButton("Circle");

        CheckBox fillButton = new CheckBox("Fill");

        ellipseButton.setToggleGroup(buttonGroup);
        squareButton.setToggleGroup(buttonGroup);
        circleButton.setToggleGroup(buttonGroup);

        buttonPane.getChildren().addAll(circleButton, squareButton, ellipseButton, fillButton);
        //Event Handler
        buttonGroup.selectedToggleProperty().addListener((observable, oldToggle, newToggle) -> {
            RadioButton selectedButton = (RadioButton) newToggle;
            pane.getChildren().remove(currentShape);
            switch(selectedButton.getText()) {
                case "Ellipse":
                    Ellipse ellipse = new Ellipse(250, 250, 80, 30);
                    
                    if(fillButton.isSelected()) {
                        ellipse.setFill(Color.BLACK);
                    } else {
                        ellipse.setFill(Color.TRANSPARENT);
                    }

                    pane.getChildren().add(ellipse);
                    currentShape = ellipse;
                    break;
                case "Square": 
                    Rectangle square = new Rectangle(250, 250);

                    if(fillButton.isSelected()) {
                        square.setFill(Color.BLACK);
                    } else {
                        square.setFill(Color.TRANSPARENT);
                    }

                    square.setStroke(Color.BLACK); 
                    pane.getChildren().add(square);
                    currentShape = square;
                    break;
                case "Circle":
                    Circle circle = new Circle(250, 250, 50);

                    if(fillButton.isSelected()) {
                        circle.setFill(Color.BLACK);
                    } else {
                        circle.setFill(Color.TRANSPARENT);
                    }

                    circle.setStroke(Color.BLACK); 
                    pane.getChildren().add(circle);
                    currentShape = circle;
                    break;
                default: break;
            }
        });

        fillButton.setOnAction(e -> {
            if(fillButton.isSelected()) {
                currentShape.setFill(Color.BLACK);
                currentShape.setStroke(Color.BLACK); 
            } else {
                currentShape.setFill(Color.TRANSPARENT);
                currentShape.setStroke(Color.BLACK); 
            }
        });


        //Anordnen in Pane
        buttonPane.setAlignment(Pos.BOTTOM_CENTER);
        pane.getChildren().add(buttonPane, 500, 500);
        Scene scene = new Scene(pane);

        arg0.setTitle("16.02");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
