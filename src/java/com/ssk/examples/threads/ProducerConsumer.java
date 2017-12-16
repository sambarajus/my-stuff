package com.ssk.examples.threads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class ProducerConsumer {
    public static void main(String[] args) {
        Producer producer = new Producer();
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(new Consumer(producer));
        t1.start();
        t2.start();
    }

}

class Producer implements Runnable {
    private Vector messages = new Vector();
    int MAX = 10;

    public synchronized void putMessage(String message) {
        System.out.println("put message");
        while (messages.size() == MAX) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        messages.addElement(message);
        notify();
    }

    public synchronized String getMessages() {
        notify();
        while (messages.size() == 0) {
            try {
                wait();//By executing wait() from a synchronized block, a thread gives up its hold on the lock and goes to sleep.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String message = (String) messages.firstElement();
        messages.removeElement(message);
        return message;
    }

    @Override
    public void run() {
        int j = 0;
        while (j < 20) {
            putMessage(new Date().toString());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            j++;
        }
    }
}

class Consumer implements Runnable {
    Producer p;

    public Consumer(Producer p) {
        this.p = p;
    }

    public void consume() {
        String s = p.getMessages();
        System.out.println(s);
    }

    @Override
    public void run() {
        while (true) {
            consume();
            System.out.println("getMessage");
        }
    }
}
