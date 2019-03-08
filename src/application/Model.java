package application;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Model {

    private String calculatorDisplay;
    private Map<String,Integer> numbers;
    public Model(){
        calculatorDisplay = "0";
        numbers = new HashMap<>(){{
            put("0",0);
            put("1",1);
            put("2",2);
            put("3",3);
            put("4",4);
            put("5",5);
            put("6",6);
            put("7",7);
            put("8",8);
            put("9",9);
        }};

    }

    public void setCalculatorDisplay(String newElement){
        if(calculatorDisplay == "0")
            calculatorDisplay = newElement;
        else
            calculatorDisplay += newElement;
    }

    public String getCalculatorDisplay(){
        return calculatorDisplay;
    }

    public void evaluate(){
        System.out.println("EVALUATE EXPRESSION");
    }

    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }

    public int mult(int a, int b){
        return a*b;
    }

    public  int div(int a, int b){
        if (b > 0)
            return a/b;
        else
            System.out.println("ERROR: Cannot divide by 0");
            return 0;
    }

}
