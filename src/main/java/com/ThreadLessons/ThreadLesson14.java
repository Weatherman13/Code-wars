package com.ThreadLessons;

import lombok.SneakyThrows;

import java.util.Random;
import java.util.concurrent.*;

public class ThreadLesson14 {

    @SneakyThrows
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Starting");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished");
            Random random = new Random();
            return random.nextInt(10);
        });

        executorService.shutdown();
        int result = future.get(); // get ожидает пока поток не завершится
        System.out.println(result);
    }
}
