package com.ssk.examples.dp.momento;

public class CalculatorDemo {
    Calculator calculator  = new Calculator();
    CalculatorCareTaker careTaker = new CalculatorCareTaker();
    public int performOperation(int firstVal, int secondVal, String operation){
        int result = calculator.getCalculationResult(firstVal,secondVal, operation);
        careTaker.save(calculator);
        return result;
    }

    public Calculator undoOperation() {
        careTaker.undo(calculator);
        return  calculator;
    }
}
