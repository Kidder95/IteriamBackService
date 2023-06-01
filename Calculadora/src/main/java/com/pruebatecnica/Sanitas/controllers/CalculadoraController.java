package com.pruebatecnica.sanitas.controllers;


import com.pruebatecnica.sanitas.models.Operandos;
import com.pruebatecnica.sanitas.models.ResultOperandos;
import com.pruebatecnica.sanitas.service.CalculadoraService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/calculate")
public class CalculadoraController {

    @Autowired
    private final CalculadoraService calculadoraService;

    @PostMapping("/operate")
    public ResultOperandos operate(@RequestBody Operandos operandos){
        return calculadoraService.operate(operandos);
    }
}
