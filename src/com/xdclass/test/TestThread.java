package com.xdclass.test;

import com.xdclass.test.wiggin.Test;

public class TestThread implements Runnable {


    @Override
    public void run() {

        while(true){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println( Thread.currentThread().getName() + " TestThread" );
            new Test().say();
        }

    }
}
