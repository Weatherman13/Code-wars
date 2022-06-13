package com.ThreadLessons;

import lombok.SneakyThrows;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLesson9_2 {
    @SneakyThrows
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0 ; i < 3 ; i++) executorService.submit(new Processor2(i, countDownLatch));
        executorService.shutdown();
        for (int i = 0; i<3; i++){
            System.out.println(i);
            Thread.sleep(1000);
            countDownLatch.countDown();
        }


    }
}

class Processor2 implements Runnable{
    private int id;
    private CountDownLatch countDownLatch;

    public Processor2(int id, CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch = countDownLatch;
    }

    @SneakyThrows
    @Override
    public void run() {
        Thread.sleep(3000);
        countDownLatch.await();
        System.out.println("Thread with id " + id + " proceeded.");
    }
}
