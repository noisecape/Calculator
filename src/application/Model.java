package application;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class Model {

    private String firstOperand;
    private String secondOperand;
    private BiFunction<Integer,Integer,Integer> operation;

    public Model(String firstOperand,String secondOperand, BiFunction<Integer,Integer,Integer> operation){
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operation = operation;
        this.evaluateExpression();
    }

    String evaluateExpression(){
        Integer x1 = Integer.parseInt(firstOperand);
        Integer x2 = Integer.parseInt(secondOperand);
        return Integer.toString(operation.apply(x1,x2));
    }

}
