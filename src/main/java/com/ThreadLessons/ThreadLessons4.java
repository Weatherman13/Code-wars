package com.ThreadLessons;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadLessons4 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.main();
    }
}

class Worker {
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();
    Object lock1 = new Object();
    Object lock2 = new Object();
    Random random = new Random();

    @SneakyThrows
    public void addToList1() {
        synchronized (lock1) {
            Thread.sleep(1);
            list1.add(random.nextInt(100));
        }
    }

    @SneakyThrows
    public void addToList2() {
        synchronized (list2) {
            Thread.sleep(1);
            list2.add(random.nextInt(100));
        }
    }

    public void work() {
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }

    @SneakyThrows
    public void main() {
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        long after = System.currentTimeMillis();
        System.out.println("Program took " + (after - before) + " ms to run");
        System.out.println("List1 : " + list1.size());
        System.out.println("List2 : " + list2.size());
    }
}