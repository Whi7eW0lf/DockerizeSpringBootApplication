package com.docker.controller;

import com.docker.dtos.ResponseMessageDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    public static final String HELLO_MESSAGE = "Hello im docker container! :)";

    @GetMapping
    public ResponseEntity<ResponseMessageDto> helloDocker() {
        return ResponseEntity.ok(new ResponseMessageDto(HELLO_MESSAGE));
    }
}
