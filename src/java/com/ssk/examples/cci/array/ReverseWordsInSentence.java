package com.ssk.examples.cci.array;

public class ReverseWordsInSentence {

    public String reverseWords(String str){
        //Pre-conditions
        if(str==null) {
            return new String();
        }
        int start = 0;
        int end = str.length()-1;
        char[] s = str.toCharArray();

        //remove leading/training spaces
        while(start<=end && s[start]==' '){
            start++;
        }

        while(end>=0 && s[end]==' '){
            end--;
        }
        if(start>end)
            return new String("");

        //reverse each word
        int i = start;

        while(i<end){
            if(s[i]!=' '){ //if character is not space, run an inner loop to identify next space i.e end position of current word
                int j = i+1; // end position of current word.
                while(j<=end && s[j]!=' '){
                    j++; //increment until next space char is found.
                }
                reverseWord(s, i, j-1); // reverse current word excluding any spaces.
                i = j;
            }else{
                if(s[ i- 1]==' '){
                    int j = i;
                    while(j<=end-1){
                        s[j] = s[j + 1]; // shift left by 1 character in cases previous character is a space.
                        j++;
                    }
                    end--;
                }else
                    i++;
            }
        }

        reverseWord(s, start, end);
        return new String(s, start, end - start + 1);

    }

    private void reverseWord(char[] str, int start, int end){
        while(start<end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    public void reverseWordsCharArray(char[] s){

        int start = 0;
        int end = s.length-1;

        //remove leading/training spaces
        while(start<=end && s[start]==' '){
            start++;
        }

        while(end>=0 && s[end]==' '){
            end--;
        }
        if(start>end){
            s = new char[0];
        }
        //reverse each word
        int i = start;

        while(i<end){
            if(s[i]!=' '){ //if character is not space, run an inner loop to identify next space i.e end position of current word
                int j = i+1; // end position of current word.
                while(j<=end && s[j]!=' '){
                    j++; //increment until next space char is found.
                }
                reverseWord(s, i, j-1); // reverse current word excluding any spaces.
                i = j;
            }else{
                if(s[ i- 1]==' '){
                    int j = i;
                    while(j<=end-1){
                        s[j] = s[j + 1]; // shift left by 1 character in cases previous character is a space.
                        j++;
                    }
                    end--;
                }else
                    i++;
            }
        }

        reverseWord(s, start, end);
    }
}
