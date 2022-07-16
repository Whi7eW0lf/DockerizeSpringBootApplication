package com.docker.controller;

import com.docker.dtos.ResponseMessageDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public ResponseEntity<ResponseMessageDto> helloDocker() {
        return ResponseEntity.ok(new ResponseMessageDto("Hello im docker container! :)"));
    }

}
