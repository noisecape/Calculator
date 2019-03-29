package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Controller {

    private Map<String, BiFunction<Integer,Integer,Integer>> operation = new HashMap<>();
    private String expression;
    private String accumulator;
    private BiFunction<Integer,Integer,Integer> operator;

    public Controller(){
        this.operation.put("+",(x1,x2) -> x1 + x2);
        this.operation.put("-", (x1,x2) -> x1 - x2);
        this.operation.put("/", (x1,x2) -> x1 / x2);
        this.operation.put("X", (x1,x2) -> x1 * x2);
        this.expression = "";
        this.accumulator = "";
    }

    @FXML
    public Label resultLabel;

    @FXML
    void pressedAnimation(MouseEvent event) {
        Button currentButton = (Button) event.getSource();
        pressedAnimation(currentButton);
        composeAcorrectExpression(currentButton.getText());
    }

    private void composeAcorrectExpression(String digit){
        if (operation.containsKey(digit)){
            addAnOperation(digit);
        }else if(digit.equals("=")){
            evaluateExpression();
        }else if(digit.equals("C")){
            eraseExpression();
        }else{
            addAdigit(digit);
        }
    }

    private void addAnOperation(String digit){
        operator = operation.get(digit);
        accumulator = expression;
        expression = "";
        resultLabel.setText("0");
    }

    private void evaluateExpression(){
        resultLabel.setText(new Model(accumulator,expression,operator).evaluateExpression());
        expression = "";
        accumulator = "";
        operator = null;
    }

    private void eraseExpression(){
        resultLabel.setText("0");
        accumulator = "";
        expression = "";
        operator = null;
    }

    private void addAdigit(String digit){
        expression += digit;
        resultLabel.setText(expression);
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