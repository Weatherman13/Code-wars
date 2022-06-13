package com.ThreadLessons;

import lombok.SneakyThrows;

public class ThreadLessons3 {
    private int counter;

    public static void main(String[] args) {
        ThreadLessons3 test = new ThreadLessons3();
        test.doWork();

    }

    @SneakyThrows
    public void doWork(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++){
                    increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++){
                    increment();
                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(counter);
    }

    public synchronized void increment(){
        counter++;
    }
}
