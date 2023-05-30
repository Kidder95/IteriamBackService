package com.pruebatecnica.sanitas.controllers;

import com.pruebatecnica.sanitas.models.Operandos;
import com.pruebatecnica.sanitas.models.ResultOperandos;
import com.pruebatecnica.sanitas.service.CalculadoraService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraControllerTest {

    @Mock
    private CalculadoraService calculadoraService;

    @InjectMocks
    private CalculadoraController calculadoraController;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.openMocks(this);

    }

    @Test
    public void testSumar(){
        when(calculadoraService.sumar(any())).thenReturn(new ResultOperandos(new BigDecimal(10)));
        List<BigDecimal> listOperandos= new ArrayList<>();
        BigDecimal bigDecimal = new BigDecimal(5);
        listOperandos.add(bigDecimal);
        ResultOperandos result= calculadoraController.sumar(new Operandos(listOperandos));

        assertEquals(new ResultOperandos(new BigDecimal(10)), result);

    }

    @Test
    public void testRestar(){
        when(calculadoraService.restar(any())).thenReturn(new ResultOperandos(new BigDecimal(0)));
        List<BigDecimal> listOperandos= new ArrayList<>();
        BigDecimal bigDecimal = new BigDecimal(5);
        listOperandos.add(bigDecimal);
        ResultOperandos result= calculadoraController.restar(new Operandos(listOperandos));

        assertEquals(new ResultOperandos(new BigDecimal(0)), result);
    }

}