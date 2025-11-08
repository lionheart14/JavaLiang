package excercises.chapter_15.liang;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise15_05 extends Application{
//     (Calculate final velocity) Write a program that prompts the users to enter
// initial velocity, acceleration, and time to compute final velocity, as shown in
// Figure 15.27b. (vf = v0 + acceleration * time.)
    @Override
    public void start(Stage arg0) throws Exception {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        Label velocityLabel = new Label("Velocity: ");
        TextField velocityField = new TextField();

        Label accLabel = new Label("Acceleration: ");
        TextField accField = new TextField();

        Label timeLabel = new Label("Time: ");
        TextField timeField = new TextField();

        Label finVelLabel = new Label("Final Velocity: ");

        pane.add(velocityLabel, 1, 1);
        pane.add(velocityField, 1, 2);
        pane.add(accLabel, 2, 1);
        pane.add(accField, 2, 2);
        pane.add(timeLabel, 3, 1);
        pane.add(timeField, 3, 2);
        pane.add(finVelLabel, 1, 3);

        HBox buttonPane = new HBox();
        Button compute = new Button("Compute");
        buttonPane.getChildren().add(compute);
        buttonPane.setAlignment(Pos.CENTER_RIGHT);

        compute.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                Double value = Double.parseDouble(velocityField.getText()) + Double.parseDouble(accField.getText()) * Double.parseDouble(timeField.getText());
                Label finalVelocity = new Label(String.valueOf(value));
                pane.add(finalVelocity, 2, 3);
            }

        });



        pane.add(buttonPane, 3, 4);

        Scene scene = new Scene(pane);

        arg0.setTitle("15_05");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
