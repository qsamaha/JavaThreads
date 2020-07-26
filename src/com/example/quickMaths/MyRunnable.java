package com.example.quickMaths;

import static com.example.quickMaths.ThreadColor.*;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from my runnable's implementation class");
    }
}
