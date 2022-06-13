package com.ThreadLessons;

import lombok.SneakyThrows;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadLesson8 {
    @SneakyThrows
    public static void main(String[] args) {
    ProducerAndConsumer pc = new ProducerAndConsumer();
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            pc.produce();
        }
    });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                pc.consume();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

class ProducerAndConsumer{
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    private Object lock = new Object();



    @SneakyThrows
    public void produce(){
        int value = 0;
        while (true){
            synchronized (lock){
                while (queue.size() == LIMIT){
                    lock.wait();
                }
                queue.offer(value++);
                lock.notify();
            }
        }
    }

    @SneakyThrows
    public void consume(){
        while (true){
            synchronized (lock){
                while (queue.size() == 0){
                    lock.wait();

                }
                int value = queue.poll();
                System.out.println(value);
                System.out.println("Queue size is " + queue.size());
                lock.notify();
            }
            Thread.sleep(1000);
        }
    }
}
