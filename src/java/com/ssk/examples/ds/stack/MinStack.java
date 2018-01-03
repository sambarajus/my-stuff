package com.ssk.examples.ds.stack;

import java.util.Stack;

public class MinStack {

    int min;
    Stack<Integer> st;

    public MinStack(){
        st = new Stack<>();
    }

    public void push(int v){
        if(st.isEmpty()){
            st.push(0);
            min = v;
        }else{
            st.push(v-min);
            if(v<min)
                min = v;
        }
    }

    public void pop(){

        int v = st.pop();
        if(v<0)
            min = min - v;
    }

    public int top(){
        int v = st.peek();
        if(v>0)
            return v+min;
        else{
            return min;
        }
    }

    public int getMin(){
        return min;
    }

}
