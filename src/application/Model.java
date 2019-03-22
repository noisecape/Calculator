package application;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class Model {

    private ArrayList<String> expression;
    private Map<String,Integer> numbers;

    public Model(){
        expression = new ArrayList<>();
        expression.add("0");
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

    public void setCalculatorDisplay(String digit){
        expression.add(digit);
        //if is zero, just add it once, the user can't add more than one zero as a first digit
        //if is not a zero thus is a digit, add the digit
        //if is an operand, check which operand it is and do the right operation
        //display then the result on the screen
    }

    public String getCalculatorDisplay(){
        Function<ArrayList<String>,String> printElementsToDisplay = (list) -> {
            Iterator<String> listIterator = list.iterator();
            String expression = "";
            while(listIterator.hasNext()){
                expression += listIterator.next();
            }
            return expression;
        };
        return printElementsToDisplay.apply(expression);
    }

    private void evaluate(){
        System.out.println("EVALUATE EXPRESSION");
    }

    private int add(int a, int b){
        return a+b;
    }

    private int sub(int a, int b){
        return a-b;
    }

    private int mult(int a, int b){
        return a*b;
    }

    private  int div(int a, int b){
        if (b > 0)
            return a/b;
        else
            System.out.println("ERROR: Cannot divide by 0");
            return 0;
    }

}
