package com.ingin.webflux.hutool.bitmap;

import cn.hutool.bloomfilter.BitMapBloomFilter;

public class BloomTest {
    public static void main(String[] args) {
        BitMapBloomFilter filter = new BitMapBloomFilter(5);
        filter.add("he");
        filter.add("df");
        filter.add("ninhao");
        boolean dfd = filter.contains("dfd");
        System.out.println(dfd);

    }
}
