package com.ingin.webflux.flux;

import cn.hutool.core.thread.ThreadUtil;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class FluxDemo1 {
    public static void main(String[] args) {
        Flux<String> fluxString = Flux.just("chang", "hao");
        List<String> stringList = Arrays.asList("ni", "hao", "a");
        Flux<String> stringFlux = Flux.fromIterable(stringList);
        Flux<Long> longFlux = Flux.interval(Duration.ofMillis(1000));
        longFlux.subscribe(System.out::println);
        fluxString.subscribe(System.out::println);
        stringFlux.subscribe(System.out::println);

        ThreadUtil.sleep(10000);
    }
}

