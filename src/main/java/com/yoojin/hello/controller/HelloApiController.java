package com.yoojin.hello.controller;

import com.yoojin.hello.domain.Hello;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yj
 * @version 0.1.0
 * @since 2020/12/04
 */
@RestController
public class HelloApiController {

    @GetMapping("/")
    public ResponseEntity<Hello> hello() {
        return ResponseEntity.ok(new Hello("Hello World!"));
    }
}
