package com.ssk.examples;

/**
 * Created by 212561830 on 11/15/17.
 */
public class ReverseInteger  {
    public int getIntegerReversed(int number){
        //for negative case
        boolean isNegative= number<0 ;
        if(isNegative)
            number = 0-number;
        int reverseNumber = 0;
        while(number>0){
            int mod = number%10;
            number = number/10;
            if (reverseNumber != 0 && Integer.MAX_VALUE / reverseNumber < 10)
                return 0;
            reverseNumber = reverseNumber*10+mod;
        }
        return isNegative? 0-reverseNumber: reverseNumber;
    }
}
