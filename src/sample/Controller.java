package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private Label resultLabel;

    @FXML
    private Button buttonOne;

    @FXML
    private Button buttonTwo;

    @FXML
    private Button buttonThree;

    @FXML
    private Button buttonFour;

    @FXML
    private Button buttonFive;

    @FXML
    private Button buttonSix;

    @FXML
    private Button buttonSeven;

    @FXML
    private Button buttonEight;

    @FXML
    private Button buttonNine;

    @FXML
    private Button buttonZero;

    @FXML
    private Button decimalButton;

    @FXML
    private Button cancelButton;

    @FXML
    private Button addButton;

    @FXML
    private Button subButton;

    @FXML
    private Button divisionButton;

    @FXML
    private Button multButton;

    @FXML
    private Button resultButton;

    @FXML
    void cancelPressed(MouseEvent event) {
        pressedAnimation(cancelButton);
    }

    @FXML
    void cancelReleased(MouseEvent event) {
        releasedAnimation(cancelButton);
    }

    @FXML
    void dividePressed(MouseEvent event) {
        pressedAnimation(divisionButton);
    }

    @FXML
    void divideReleased(MouseEvent event) {
        releasedAnimation(divisionButton);
    }

    @FXML
    void eightPressed(MouseEvent event) {
        pressedAnimation(buttonEight);
    }

    @FXML
    void eightReleased(MouseEvent event) {
        releasedAnimation(buttonEight);
    }

    @FXML
    void equalPressed(MouseEvent event) {
        pressedAnimation(resultButton);
    }

    @FXML
    void equalReleased(MouseEvent event) {
        releasedAnimation(resultButton);
    }

    @FXML
    void fivePressed(MouseEvent event) {
        pressedAnimation(buttonFive);
    }

    @FXML
    void fiveReleased(MouseEvent event) {
        releasedAnimation(buttonFive);
    }

    @FXML
    void fourPressed(MouseEvent event) {
        pressedAnimation(buttonFour);
    }

    @FXML
    void fourReleased(MouseEvent event) {
        releasedAnimation(buttonFour);
    }

    @FXML
    void minusPressed(MouseEvent event) {
        pressedAnimation(subButton);
    }

    @FXML
    void minusReleased(MouseEvent event) {
        releasedAnimation(subButton);
    }

    @FXML
    void multiplyPressed(MouseEvent event) {
        pressedAnimation(multButton);
    }

    @FXML
    void multiplyReleased(MouseEvent event) {
        releasedAnimation(multButton);
    }

    @FXML
    void ninePressed(MouseEvent event) {
        pressedAnimation(buttonNine);
    }

    @FXML
    void nineReleased(MouseEvent event) {
        releasedAnimation(buttonNine);
    }

    @FXML
    void onePressed(MouseEvent event) {
        pressedAnimation(buttonOne);
    }

    @FXML
    void oneReleased(MouseEvent event) {
        releasedAnimation(buttonOne);
    }

    @FXML
    void plusPressed(MouseEvent event) {
        pressedAnimation(addButton);
    }

    @FXML
    void plusReleased(MouseEvent event) {
        releasedAnimation(addButton);
    }

    @FXML
    void pointPressed(MouseEvent event) {
        pressedAnimation(decimalButton);
    }

    @FXML
    void pointReleased(MouseEvent event) {
        releasedAnimation(decimalButton);
    }

    @FXML
    void sevenPressed(MouseEvent event) {
        pressedAnimation(buttonSeven);
    }

    @FXML
    void sevenReleased(MouseEvent event) {
        releasedAnimation(buttonSeven);
    }

    @FXML
    void sixPressed(MouseEvent event) {
        pressedAnimation(buttonSix);
    }

    @FXML
    void sixReleased(MouseEvent event) {
        releasedAnimation(buttonSix);
    }

    @FXML
    void threePressed(MouseEvent event) {
        pressedAnimation(buttonThree);
    }

    @FXML
    void threeReleased(MouseEvent event) {
        releasedAnimation(buttonThree);
    }

    @FXML
    void twoPressed(MouseEvent event) {
        pressedAnimation(buttonTwo);
    }

    @FXML
    void twoReleased(MouseEvent event) {
        releasedAnimation(buttonTwo);
    }

    @FXML
    void zeroPressed(MouseEvent event) {
        pressedAnimation(buttonZero);
    }

    @FXML
    void zeroReleased(MouseEvent event) {
        releasedAnimation(buttonZero);
    }

    private void pressedAnimation(Button currentButton){
        currentButton.setStyle("-fx-background-color: lightgrey");
    }

    private void releasedAnimation(Button currentButton){
        currentButton.setStyle("-fx-background-color: lightblue");
    }

}