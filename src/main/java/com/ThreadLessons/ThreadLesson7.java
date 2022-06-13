package com.ThreadLessons;

import lombok.SneakyThrows;

import java.util.Scanner;

public class ThreadLesson7 {
    @SneakyThrows
    public static void main(String[] args) {
        WaitAndNotify wn = new WaitAndNotify();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                wn.produce();

            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                wn.consume();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

}

class WaitAndNotify{
    @SneakyThrows
    public void produce(){
        synchronized (this){
            System.out.println("Producer thread started...");
            wait();
            System.out.println("Producer thread resumed...");
        }
    }

    @SneakyThrows
    public void consume(){
        Thread.sleep(5000);
        Scanner scanner = new Scanner(System.in);
        synchronized (this){
            System.out.println("Waiting for return key pressed...");
            scanner.nextLine();
            notify();

            Thread.sleep(2000);
        }

    }
}
