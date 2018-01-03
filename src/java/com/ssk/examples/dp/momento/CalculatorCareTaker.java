package com.ssk.examples.dp.momento;

import java.util.LinkedList;
import java.util.Stack;

public class CalculatorCareTaker {
    private Stack<CalculatorMemento> states = new Stack<>();
    public void save(Calculator calculator){
        CalculatorMemento memento = calculator.save();
        states.push(memento);
    }
    public void undo(Calculator calculator){
        if(!states.isEmpty()){
            CalculatorMemento memento = states.pop();
            calculator.restore(memento);
        }else {
            System.out.println("All states are restored.");
        }
    }
}
