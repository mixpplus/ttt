package com.ingin.webflux.mono;

import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

public class MonoDemo1 {
    public static void main(String[] args) {
        Mono<String> monoString = Mono.just("nihao");
        monoString.subscribe(System.out::print);

        Mono<String> stringMono = Mono.fromCallable(() -> "hello world");
        stringMono.subscribe(System.out::print);

        Mono<String> future = Mono.fromFuture(CompletableFuture.completedFuture("future"));
        future.subscribe(System.out::println);
    }
}
