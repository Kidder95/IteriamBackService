package com.pruebatecnica.sanitas.service.impl;

import com.pruebatecnica.sanitas.exception.OperationInvalidException;
import com.pruebatecnica.sanitas.exception.TypeOperationInvalidException;
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
    public ResultOperandos operate(Operandos operandos) {
        BigDecimal result;

        if(operandos.getOperandos().isEmpty()){
            throw new OperationInvalidException("los operandos no pueden estar vacios");
        }
        switch (operandos.getTipo()){
            case SUMA :
                result= operandos.getOperandos().stream().reduce(BigDecimal.ZERO, BigDecimal::add);
                return new ResultOperandos(result);
            case RESTA:
                result= operandos.getOperandos().stream().reduce(BigDecimal.ZERO, BigDecimal::subtract);
                return new ResultOperandos(result);
            default:
                throw new TypeOperationInvalidException("El tipo de operador no es valido");
        }
    }
}
