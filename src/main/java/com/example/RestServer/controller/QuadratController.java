package com.example.RestServer.controller;


import com.example.RestServer.service.QuadratService;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuadratController {

    private final QuadratService quaService;

    public QuadratController(QuadratService quaService) {
        this.quaService = quaService;
    }


    @GetMapping("/ergebnis")
    Long getQua() {
        return quaService.getQuadrat();
    }

    @GetMapping("/ergebnis/{number}")
    Long quadrat(@PathVariable Long number) {
        quaService.quadratberechnen(number);
        return quaService.getQuadrat();
    }


}