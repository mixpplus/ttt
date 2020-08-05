package com.ingin.webflux.controller;

import org.springframework.http.MediaType;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.UUID;

@RestController
public class FluxController {


    @GetMapping(value = "demo", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> demo() {
        return Flux.interval(Duration.ofSeconds(1)).map(v -> "hello" + v);

    }

    @GetMapping(value = "sse", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<ServerSentEvent<String>> sse() {
        Flux<Long> interval = Flux.interval(Duration.ofSeconds(1));
        return interval.map(v ->
                ServerSentEvent.<String>builder().
                        data("hello:"+v ).
                        id(UUID.randomUUID().toString()).
                        event("ing_event").build());
    }
}
