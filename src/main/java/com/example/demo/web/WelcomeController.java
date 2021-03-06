package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class WelcomeController {

  @GetMapping("/")
  public Mono<String> index() {
    return Mono.just("webflux works");
  }

}
