package com.ssk.examples.threads;


public class AlternatePrint {
    public boolean isZero = true;

    synchronized void printZero(int digit){

        while(isZero==true){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("ZERO");
        isZero = true;
        notifyAll();

    }
    synchronized public void printOne(int digit){

        while(isZero==false){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("ONE");
        isZero=false;
        notifyAll();

    }
    public static void main(String[] args) {
        AlternatePrint alternatePrint = new AlternatePrint();
        Thread t1 = new Thread(new CounterThread(1, alternatePrint));
        Thread t2 = new Thread(new CounterThread(0, alternatePrint));
        t1.start();
        t2.start();

    }
}

class CounterThread implements Runnable {

    int digit;
    AlternatePrint printer;
    public CounterThread(int digit, AlternatePrint printer) {
        this.digit = digit;
        this.printer = printer;
    }

    @Override
    public void run() {
int c = 0;
        while (c<=10) {
            if(digit==0){
                printer.printZero(0);
            }else{
                printer.printOne(1);
            }
c++;
        }

    }
}
