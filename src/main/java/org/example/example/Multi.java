package org.example.example;

import org.slf4j.LoggerFactory;



public class Multi
{
    private static org.slf4j.Logger Logger = LoggerFactory.getLogger(Multi.class);
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++)
        {
            new Thread(() ->
            {
                Logger.debug("Thread {} is running", Thread.currentThread().getName());
                Logger.info("Thread {} is running", Thread.currentThread().getName());
                Logger.warn("Thread {} is running", Thread.currentThread().getName());
                Logger.error("Thread {} is running", Thread.currentThread().getName());
            }).start();
        }
    }
}
