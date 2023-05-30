package com.pruebatecnica.sanitas.service.impl;

import com.pruebatecnica.sanitas.models.Operandos;
import com.pruebatecnica.sanitas.models.ResultOperandos;
import com.pruebatecnica.sanitas.service.CalculadoraService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Log4j2
public class CalculadoraServiceImpl implements CalculadoraService {


    @Override
    public ResultOperandos sumar(Operandos operandos) {
        BigDecimal result= operandos.getOperandos().stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        return new ResultOperandos(result);
    }

    @Override
    public ResultOperandos restar(Operandos operandos) {
        BigDecimal result= operandos.getOperandos().stream().reduce(BigDecimal.ZERO, BigDecimal::subtract);
        return new ResultOperandos(result);
    }
}
