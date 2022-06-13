package com.ThreadLessons;

import lombok.SneakyThrows;

public class ThreadLesson1 {

    @SneakyThrows
    public static void main(String[] args) {
//        Test1 stream1 = new Test1();
//        Test1 stream2 = new Test1();
//        stream2.start();
//        Thread.sleep(1000);
//        stream1.start();

        Thread thread1 = new Thread(new Test2());
        thread1.start();
        Thread thread2 = new Thread(new Test2());
        thread2.start();
    }
}


class Test1 extends Thread {
    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Thread.sleep(1000);
            System.out.println("Test1: " + i);
        }
    }
}class Test2 implements Runnable {
    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Thread.sleep(1000);
            System.out.println("Test1: " + i);
        }
    }
}




