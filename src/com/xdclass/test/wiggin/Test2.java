package com.xdclass.test.wiggin;

import java.util.concurrent.locks.ReentrantLock;

public class Test2 implements Qua {


    @Override
    public void sayBye() {

    }

    public Worker getWorker(User user){
        Worker worker = new Worker();
        worker.setName(user.getName());
        return worker;

    }

    public static final String msg = "123";

    public static void main(String[] args) {
        System.out.println("inne");

        User user = new User();
        user.setName("");
        user.setAge("");

        ReentrantLock rt = new ReentrantLock();
        rt.lock();





    }
}
