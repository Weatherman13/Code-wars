package com.ThreadLessons;

import lombok.SneakyThrows;

import java.util.Scanner;

public class ThreadLesson2 {
    public static void main(String[] args) {
        ThreadTest1 threadTest1 = new ThreadTest1();
        threadTest1.start();


        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        threadTest1.shotdown();
    }
}

class ThreadTest1 extends Thread{
    private volatile boolean a = true;

    @SneakyThrows
    @Override
    public void run() {
        int  b = 0;
        while (a){
            Thread.sleep(1000);
            System.out.println(b++);
        }
    }

    public void shotdown(){
        this.a = false;
    }
}
