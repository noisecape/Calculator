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
        if (currentButton.getText().equals("=")){
            resultLabel.setText(new Model(accumulator,expression,operator).evaluateExpression());
            expression = "";
            accumulator = "";
            operator = null;
        }else if(operation.containsKey(currentButton.getText())){
            operator = operation.get(currentButton.getText());
            accumulator = expression;
            expression = "";
            resultLabel.setText("0");
        }else {
            expression += currentButton.getText();
            resultLabel.setText(expression);
        }
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