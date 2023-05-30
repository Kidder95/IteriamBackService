package com.pruebatecnica.Sanitas.controllers;

import com.pruebatecnica.Sanitas.service.CalculadoraService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraControllerTest {

    @Mock
    private CalculadoraService calculadoraService;

    @InjectMocks
    CalculadoraController calculadoraController;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSumar(){
        when(calculadoraService.sumar(any(), any())).thenReturn(new BigDecimal(10));

        BigDecimal result= calculadoraController.sumar(new BigDecimal(5), new BigDecimal( 5));

        assertEquals(new BigDecimal(10), result);

    }

    @Test
    public void testRestar(){
        when(calculadoraService.restar(any(), any())).thenReturn(new BigDecimal(0));

        BigDecimal result= calculadoraController.restar(new BigDecimal(5), new BigDecimal( 5));

        assertEquals(new BigDecimal(0), result);
    }

}