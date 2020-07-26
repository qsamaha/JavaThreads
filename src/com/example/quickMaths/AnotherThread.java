package com.example.quickMaths;

import static com.example.quickMaths.ThreadColor.*;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());
        try {
            Thread.sleep(5000);
            System.out.println(ANSI_BLUE + "Three seconds have passed and I'm awake");
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another thread wake me up");
            return;
        }

    }
}
