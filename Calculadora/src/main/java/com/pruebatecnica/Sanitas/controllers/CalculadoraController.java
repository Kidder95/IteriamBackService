package com.pruebatecnica.sanitas.controllers;


import com.pruebatecnica.sanitas.models.Operandos;
import com.pruebatecnica.sanitas.models.ResultOperandos;
import com.pruebatecnica.sanitas.service.CalculadoraService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/calculate")
@Api(value = "Calculadora API")
public class CalculadoraController {

    @Autowired
    private final CalculadoraService calculadoraService;

    @PostMapping("/operate")
    @ApiOperation(value = "Realiza la operacion de numeros en funcion del tipo de operador", notes = "Devuelve el resultado de los numeros proporcionados")
    public ResultOperandos operate(@RequestBody Operandos operandos){
        return calculadoraService.operate(operandos);
    }
}
