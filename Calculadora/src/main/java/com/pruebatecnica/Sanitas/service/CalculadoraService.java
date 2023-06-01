package com.pruebatecnica.sanitas.service;

import com.pruebatecnica.sanitas.models.Operandos;
import com.pruebatecnica.sanitas.models.ResultOperandos;

import java.math.BigDecimal;

public interface CalculadoraService {

     ResultOperandos operate(Operandos operandos);
}
