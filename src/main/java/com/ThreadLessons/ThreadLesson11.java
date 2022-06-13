package com.ThreadLessons;

import lombok.SneakyThrows;

import java.util.concurrent.*;

public class ThreadLesson11 {
    @SneakyThrows
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(200);

        Connection connection = Connection.getConnection();

        for (int i = 0; i < 200; i++) {
            es.submit(new Runnable() {
                @Override
                public void run() {
                    connection.work();
                }
            });
        }
        es.shutdown();
        es.awaitTermination(1, TimeUnit.DAYS);
    }
}

//Singleton
class Connection {
    private static Connection connection = new Connection();
    private int connectionsCount;
    private Semaphore semaphore = new Semaphore(10);

    private Connection() {

    }

    public static Connection getConnection() {
        return connection;
    }

    @SneakyThrows
    public void work() {
        semaphore.acquire();
        try {
            doWork();
        } finally {
            semaphore.release();
        }
    }

    @SneakyThrows
    public void doWork() {
        synchronized (this) {
            connectionsCount++;
            System.out.println(connectionsCount);
        }
        Thread.sleep(5000);

        synchronized (this) {
            connectionsCount--;
        }
    }
}
