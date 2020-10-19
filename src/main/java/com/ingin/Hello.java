package com.ingin;

import cn.hutool.core.util.StrUtil;

import java.util.ArrayList;
import java.util.List;

public class Hello {

    public static void main(String[] args) {
        if (StrUtil.isEmpty("he")) {
            System.out.println("hello");
        }

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello2");
        String collect = String.join("-", list);
        System.out.println(collect);
        String format = String.format("%s-%s", "ni", "hao");
        System.out.println(format);


        if (StrUtil.isEmpty("he")) {
            System.out.println("hello");
        }

        List<String> list1 = new ArrayList<>();
        list.add("hello");
        list.add("hello2");
        String collect1 = String.join("-", list);
        System.out.println(collect);
        String format1 = String.format("%s-%s", "ni", "hao");
        System.out.println(format);



        if (StrUtil.isEmpty("he")) {
            System.out.println("hello");
        }

        List<String> list2 = new ArrayList<>();
        list.add("hello");
        list.add("hello2");
        String collect2 = String.join("-", list);
        System.out.println(collect);
        String format2 = String.format("%s-%s", "ni", "hao");
        System.out.println(format);

        System.out.println("hello world");



        System.out.println("222");

    }


}
