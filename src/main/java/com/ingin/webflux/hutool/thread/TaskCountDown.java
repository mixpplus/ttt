package com.ingin.webflux.hutool.thread;

import cn.hutool.core.lang.Console;
import cn.hutool.log.dialect.console.ConsoleLog;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class TaskCountDown implements Runnable{
    private CountDownLatch countDownLatch;

    public TaskCountDown(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Console.log("execute ...");
            sleep(2);
            Console.log("finished ...");
        } finally {
            countDownLatch.countDown();
            Console.log("count: " + countDownLatch.getCount());
        }

    }

    public void sleep(long time) {
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
