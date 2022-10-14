package com.dio.webapiswagger.controller;

import com.dio.webapiswagger.services.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @GetMapping
    public String welcome() {
        return homeService.welcome();
    }
}
