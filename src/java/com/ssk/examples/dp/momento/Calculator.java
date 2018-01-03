package com.ssk.examples.dp.momento;

/**
 * Originator class which
 */
public class Calculator {
    private int firstValue;
    private int secondValue;
    private String operationType;

    public CalculatorMemento save(){
        return new CalculatorMemento(firstValue, secondValue, operationType);
    }
    public void restore(CalculatorMemento memento){
        this.firstValue = memento.getFirstValue();
        this.secondValue = memento.getSecondValue();
        this.operationType = memento.getOperationType();
    }

    public int getCalculationResult(int firstValue, int secondValue, String operationType){
        this.operationType = operationType;
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        int result = 0;
        switch (operationType){
            case "add" :
                result = firstValue+secondValue;
                break;
            case "sub" :
                result = firstValue - secondValue;
                break;
            case "mul" :
                result = firstValue*secondValue;
                break;
            case "div" :
                result = firstValue/secondValue;
                break;
        }

        return result;
    }

    public int getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;

    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "firstValue=" + firstValue +
                ", secondValue=" + secondValue +
                ", operationType='" + operationType + '\'' +
                '}';
    }
}
