package com.pruebatecnica.Sanitas.controllers;


import com.pruebatecnica.Sanitas.service.CalculadoraService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/calculate")
public class CalculadoraController {

    @Autowired
    private final CalculadoraService calculadoraService;

    @PostMapping("/sumar")
    public BigDecimal sumar(@PathVariable BigDecimal numero1, @PathVariable BigDecimal numero2){
        return calculadoraService.sumar(numero1, numero2);
    }

    @PostMapping("/restar")
    public BigDecimal restar(@PathVariable BigDecimal numero1, @PathVariable BigDecimal numero2){
        return calculadoraService.restar(numero1, numero2);
    }
}
