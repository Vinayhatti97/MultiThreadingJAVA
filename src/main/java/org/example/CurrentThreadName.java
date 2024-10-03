package org.example;

import javax.swing.plaf.TableHeaderUI;

public class CurrentThreadName {

    public static void main(String[] args) {
        NameThread thread = new NameThread();
        thread.start();
        System.out.println("main method executed by Thread: "
                + Thread.currentThread().getName());

    }
}

class NameThread extends Thread{
    @Override
    public void run() {
        System.out.println("run method executed by Thread: "
                + Thread.currentThread().getName());
    }
}
