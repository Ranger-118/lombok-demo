package indi.henry.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import indi.henry.demo.service.DefaultService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DefaultController {
    
    private final DefaultService defaultService;

    @GetMapping
    public String get() {
        return defaultService.getStr();
    }
}
