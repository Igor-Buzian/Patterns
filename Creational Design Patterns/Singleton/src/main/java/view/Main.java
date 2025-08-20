package view;


import singleton.ConfigManager;
import singleton.ConnectionPool;
import singleton.Logger;

import java.lang.reflect.Executable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Runnable task = () -> {
            Logger logger = Logger.getInstance();
            logger.log("Thread " + Thread.currentThread().getName() + " is starting connection");
            ConfigManager manager = ConfigManager.getInstance("jdbc:mysql://localhost:3306/mydb");
            logger.log("manager was created! for Thread: " + Thread.currentThread().getName());
            ConnectionPool pool = ConnectionPool.getInstance(manager.getDbUrl());
            logger.log("pool was created! for Thread: " + Thread.currentThread().getName());
            pool.connection();
            logger.log("done Thread: "+Thread.currentThread().getName());
        };

        Thread thread1 = new Thread(task, "T1");
        Thread thread2 = new Thread(task, "T2");
        Thread thread3 = new Thread(task, "T3");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Logger.getInstance().log("All threads have finished their work. Main thread is exiting.");

    }
}
