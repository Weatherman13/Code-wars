package com.ThreadLessons;

import lombok.SneakyThrows;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadLesson6 {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                produce();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                consumer();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }

    @SneakyThrows
    private static void produce(){
        Random random = new Random();

        while (true){
            queue.put(random.nextInt(100));
        }
    }

    @SneakyThrows
    private static void consumer(){
        while (true){
            Thread.sleep(100);
            System.out.println(queue.take());
            System.out.println("Queue size is " + queue.size());
        }
    }
}
