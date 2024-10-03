package org.example;

public class Approach1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        System.out.println("main method");
        t.start();
    }
}

class MyThread extends Thread{
    @Override
    public void start() {
        super.start();
        System.out.println("start method");
    }

    @Override
    public void run() {
        System.out.println("run method");
    }
}