package com.ingin.webflux.hutool;

import cn.hutool.cache.CacheUtil;
import cn.hutool.cache.impl.CacheObj;
import cn.hutool.cache.impl.TimedCache;
import cn.hutool.core.thread.ThreadUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
        TimedCache<String, String> timedCache = CacheUtil.newTimedCache(1000);
        timedCache.put("hello1","value1");
        ThreadUtil.sleep(1000);
        timedCache.put("hello2","value2");
        timedCache.put("hello3","value3");
        timedCache.put("hello3","value4");
//        timedCache.put("hello1","value4");

        List<String> list = new ArrayList<>();
        Iterator<CacheObj<String, String>> cacheObjIterator = timedCache.cacheObjIterator();
        while (cacheObjIterator.hasNext()) {
            list.add(cacheObjIterator.next().getKey());
        }
        System.out.println(list);
    }
}
