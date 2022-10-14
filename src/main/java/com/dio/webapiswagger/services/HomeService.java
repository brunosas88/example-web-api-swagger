package com.dio.webapiswagger.services;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String welcome() {
        return "Bem vindo ao Exemplo de Spring Boot com Swagger";
    }

}
