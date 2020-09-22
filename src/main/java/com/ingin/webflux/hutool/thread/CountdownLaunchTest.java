package com.ingin.webflux.hutool.thread;

import cn.hutool.core.lang.Console;
import cn.hutool.core.thread.ThreadUtil;

import java.util.concurrent.CountDownLatch;

public class CountdownLaunchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = ThreadUtil.newCountDownLatch(2);

        for (int i = 0; i < 2; i++) {
            ThreadUtil.newThread(new TaskCountDown(countDownLatch),i+ "").start();
        }
        Console.log("main thread running ....");
        countDownLatch.await();

        Console.log("main thread finished ....");
    }
}
