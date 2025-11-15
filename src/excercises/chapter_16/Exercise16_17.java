package excercises.chapter_16;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Exercise16_17 extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
        VBox root = new VBox();
        root.setAlignment(Pos.TOP_CENTER);
        root.setFillWidth(false);
        root.setSpacing(10);

        Label text = new Label("Show Colors");

        HBox redRow = new HBox();
        redRow.setSpacing(10);
        Label redText = new Label("Red");
        redText.setMinWidth(50);
        ScrollBar scrollBarRed = new ScrollBar();
        scrollBarRed.setMax(255);
        scrollBarRed.setMin(0);
        scrollBarRed.setPrefWidth(100);
        redRow.getChildren().addAll(redText, scrollBarRed);

        HBox greenRow = new HBox();
        greenRow.setSpacing(10);
        Label greenText = new Label("Green");
        greenText.setMinWidth(50);
        ScrollBar scrollBarGreen = new ScrollBar();
        scrollBarGreen.setMax(255);
        scrollBarGreen.setMin(0);
        scrollBarGreen.setPrefWidth(100);
        greenRow.getChildren().addAll(greenText, scrollBarGreen);

        HBox blueRow = new HBox();
        blueRow.setSpacing(10);
        Label blueText = new Label("Blue");
        blueText.setMinWidth(50);
        ScrollBar scrollBarBlue = new ScrollBar();
        scrollBarBlue.setMax(255);
        scrollBarBlue.setMin(0);
        scrollBarBlue.setPrefWidth(100);
        blueRow.getChildren().addAll(blueText, scrollBarBlue);

        HBox opacityRow = new HBox();
        opacityRow.setSpacing(10);
        Label opacityText = new Label("Opacity");
        opacityText.setMinWidth(50);
        ScrollBar scrollBarOpacity = new ScrollBar();
        scrollBarOpacity.setMax(1);
        scrollBarOpacity.setMin(0);
        scrollBarOpacity.setValue(1);
        scrollBarOpacity.setPrefWidth(100);
        opacityRow.getChildren().addAll(opacityText, scrollBarOpacity);

        ChangeListener<Number> listener = (obs, old, newVal) -> {
            Color c = Color.rgb(
                (int) scrollBarRed.getValue(),
                (int) scrollBarGreen.getValue(),
                (int) scrollBarBlue.getValue(),
                (int) scrollBarOpacity.getValue()
            );

            text.setTextFill(c);
        };

        scrollBarRed.valueProperty().addListener(listener);
        scrollBarGreen.valueProperty().addListener(listener);
        scrollBarBlue.valueProperty().addListener(listener);
        scrollBarOpacity.valueProperty().addListener(listener);

        root.getChildren().addAll(text, redRow, greenRow, blueRow, opacityRow);

        Scene scene = new Scene(root, 300, 300);

        arg0.setTitle("16.17");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
