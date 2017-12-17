package com.ssk.examples.cci.array;

public class Palindrome {

    public boolean isPalindrome(String s) {
        if(s==null)
            return false;
        if(s.length()<2)
            return true;
        char[] charArray = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            while(i<s.length()-1 && !isValidChar(charArray[i]) ){
                i++;
            }
            while(j>0 && !isValidChar(charArray[j])){
                j--;
            }
            if(i >= j)
                break;
            if(Character.toLowerCase(charArray[i])!= Character.toLowerCase(charArray[j])){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean isValidChar(char ch){
        if((ch>='a'&& ch<='z') || (ch>='A'&& ch<='Z')
                || (ch>='0' && ch<='9')){
            return true;
        }
        return false;
    }


    public boolean isValidPandrome(String s){
        if(s==null)
            return false;
        if(s.length()<2)
            return true;
        char[] charArray = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            while(i<s.length()-1 && !isValidChar(charArray[i]) ){
                i++;
            }
            while(j>0 && !isValidChar(charArray[j])){
                j--;
            }
            if(i >= j)
                break;
            int c = 0;

            if(Character.toLowerCase(charArray[i])!= Character.toLowerCase(charArray[j])){
                if(Character.toLowerCase(charArray[i+1])== Character.toLowerCase(charArray[j])){
                    System.out.println("You could delete the character "+charArray[i+1]);
                    return true;
                }else if(Character.toLowerCase(charArray[i])!= Character.toLowerCase(charArray[j-1])){
                    //Pal
                    System.out.println("You could delete the character "+charArray[j-1]);
                    return true;
                }
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


}
