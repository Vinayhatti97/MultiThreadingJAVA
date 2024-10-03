package org.example;

public class HybridApproach {
    public static void main(String[] args) {
        SomeThread t = new SomeThread();
        Thread t1 = new Thread(t);
        t1.start();
        System.out.println("main thread");
    }
}

class SomeThread extends Thread{
    public void run(){
        System.out.println("child thread");
    }
}
