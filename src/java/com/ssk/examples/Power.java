package com.ssk.examples;

/**
 * Created by 212561830 on 12/1/17.
 */
public class Power {

    public double raiseToPower(int num, int pow) {
        boolean isInverse = false;

        if(num==0)
            return 0;

        if (pow == 0)
            return 1;

        if (pow == 1)
            return num;

        if (pow < 0) {
            isInverse = true;
            pow = 0 - pow;
        }

        double result = raiseToPower(num, pow - 1) * num;

        if (isInverse)
            result = 1 / result;
        return result;
    }

    public double raise(int num, int pow) {
        boolean isInverse = false;
        double result = 0;
        if(num==0)
            return 0;

        if (pow == 0)
            return 1;

        if (pow == 1)
            return num;

        if (pow < 0) {
            isInverse = true;
            pow = 0 - pow;
        }
        if(pow%2==0){
            result = raise(num, pow/2)*raise(num, pow/2);
        }else{
            result = raise(num, pow-1 )*num;
        }

        if (isInverse)
            result = 1 / result;
        return result;
    }


}
