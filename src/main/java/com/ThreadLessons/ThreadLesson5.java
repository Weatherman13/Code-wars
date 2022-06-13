package com.ThreadLessons;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLesson5 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i=0; i < 5; i++){
            executorService.submit(new Worker2(i));
        }
        executorService.shutdown();
    }
}

class Worker2 implements Runnable {
    private int id;

    public Worker2(int id) {
        this.id = id;
    }

    @SneakyThrows
    @Override
    public void run() {
        Thread.sleep(5000);
        System.out.println("work " + id + " was completed");
    }
}
