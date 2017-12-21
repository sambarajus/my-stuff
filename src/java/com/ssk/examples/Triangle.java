package com.ssk.examples;

public class Triangle {

    public static void printTriangle(int n){
        for(int i=0; i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            for(int k=n-1-i;k<n;k++){
                System.out.print("#");
            }
            System.out.println();
        }
        for (int i = 0; i <n ; i++) {
            System.out.print("#");
        }
    }

    public static void main(String[] args){
        printTriangle(6);
    }
}
