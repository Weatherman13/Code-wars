package com.ThreadLessons;

import lombok.SneakyThrows;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLesson9_1 {
    @SneakyThrows
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0 ; i < 3 ; i++) executorService.submit(new Processor(countDownLatch));

        executorService.shutdown();
        countDownLatch.await();
        System.out.println("Latch has been opened, main thread id proceeding!");

    }
}

class Processor implements Runnable{
    private CountDownLatch countDownLatch;

    public Processor(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @SneakyThrows
    @Override
    public void run() {
        Thread.sleep(3000);
        countDownLatch.countDown();
    }
}
