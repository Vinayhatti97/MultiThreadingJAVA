package org.example;

public class ThreadRename {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread t = new MyThread();
        System.out.println(t.getName());
        Thread.currentThread().setName("Vinay Hatti");
        System.out.println(Thread.currentThread().getName());
        System.out.println(10 / 0);
    }
}
