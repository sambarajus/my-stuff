package com.ssk.examples.others.challenge;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ParseFile {

    public void getExeclusiveTimes(List<Function> functions) {
        Stack<Function> stack = new Stack<>();

        stack.push(functions.get(0));

        Map<String, Integer> resultMap = new HashMap<>();

        Function prevFunction = functions.get(0);
        for (int i = 1; i < functions.size(); i++) {
            if(functions.get(i).action.equals("Enter")){
                if(!stack.isEmpty()){
                    if(resultMap.get(functions.get(i).name)!=null ){
                        int time = resultMap.get(functions.get(i).name);

                    }else{
                        resultMap.put(functions.get(i).name, resultMap.get(functions.get(i).name)+1);
                    }

                }
            }
        }

    }
}

class Function {
    public String name;
    public String action;
    public Date timeStamp;
    public long processingTime;
    public long execlusiveTime;
    public List<Function> childFunctions;
}
