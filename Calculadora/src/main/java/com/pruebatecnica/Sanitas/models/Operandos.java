package com.pruebatecnica.sanitas.models;

import com.pruebatecnica.sanitas.utils.enums.TipoOperacion;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Operandos {

    private TipoOperacion tipo;
    private List<BigDecimal> operandos;

}
