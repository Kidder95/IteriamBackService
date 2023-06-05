package com.pruebatecnica.sanitas.utils;

import io.corp.calculator.TracerAPI;
import org.springframework.stereotype.Component;

@Component
public class Tracer implements TracerAPI {

    @Override
    public <T> void trace(T t) {
        System.out.println("esto es la implmentacion de TRACERAPI y muestro el siguiente mensaje: " + t);
    }
}
