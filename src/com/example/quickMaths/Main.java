package com.example.quickMaths;

import static com.example.quickMaths.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("====Another thread====");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnablethread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class' implementation of run");
                try{
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED + "Another thread terminated, or timed out, so I am running again");
                }catch(InterruptedException e){
                    System.out.println(ANSI_RED + " I couldn't wait after all, I was interrupted");
                }
            }
        });
        myRunnablethread.start();


        System.out.println(ANSI_PURPLE + "Hello again from the main thread");


    }
}
