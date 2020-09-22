package com.ingin.webflux.hutool;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.cron.CronUtil;
import com.ingin.webflux.hutool.task.Task1;

public class Test2 {
    public static void main(String[] args) {
        CronUtil.schedule("*/2 * * * * *", new Task1());
        CronUtil.setMatchSecond(true);
        CronUtil.start(true);
        ThreadUtil.sleep(10000);
        CronUtil.stop();
    }
}
