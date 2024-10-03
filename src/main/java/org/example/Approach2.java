package org.example;

public class Approach2 {
    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread t1 = new Thread();
        Thread t2 = new Thread(r);
    }
}

class MyRunnable implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println("child Thread");
        }
    }
}
