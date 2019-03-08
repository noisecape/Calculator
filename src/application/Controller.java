package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {

    private Model calculatorBrain = new Model();

    @FXML
    public Label resultLabel;

    @FXML
    void pressedAnimation(MouseEvent event) {
        Button currentButton = (Button) event.getSource();
        pressedAnimation(currentButton);
        calculatorBrain.setCalculatorDisplay(currentButton.getText());
        resultLabel.setText(calculatorBrain.getCalculatorDisplay());
    }

    @FXML
    void relasedAnimation(MouseEvent event) {
        Button currentButton = (Button) event.getSource();
        releasedAnimation(currentButton);
    }

    private void pressedAnimation(Button currentButton){
        currentButton.setStyle("-fx-background-color: lightgrey");
    }

    private void releasedAnimation(Button currentButton){
        currentButton.setStyle("-fx-background-color: lightblue");
    }

}