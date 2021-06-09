package com.umanizales.apibatallanaval.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

//comentario
@Getter
@Setter
@AllArgsConstructor
public class CoordenadaDTO implements Serializable {
    private int fila;
    private int col;
    private boolean estado;
}



