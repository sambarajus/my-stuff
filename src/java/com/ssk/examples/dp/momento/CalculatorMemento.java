package com.ssk.examples.dp.momento;

public class CalculatorMemento {
    int firstValue;
    int secondValue;
    String operationType;

    public CalculatorMemento(int firstValue, int secondValue, String operationType){
        this.firstValue = firstValue;
        this.secondValue =  secondValue;
        this.operationType = operationType;
    }
    public int getFirstValue() {
        return firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }

    public String getOperationType() {
        return operationType;
    }
}
