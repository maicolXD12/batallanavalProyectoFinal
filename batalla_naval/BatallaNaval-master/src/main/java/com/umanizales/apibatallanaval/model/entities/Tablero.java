package com.umanizales.apibatallanaval.model.entities;

import com.umanizales.apibatallanaval.model.ListaDE;
import com.umanizales.apibatallanaval.model.dto.CoordenadaDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Tablero
{
    private int id;
    private int columna;
    private  int filas;
    private  Usuario usuario;
    private ListaDE listaBarco;
    private  boolean estadoTablero;
    private  CoordenadaDTO[] disparosRecibidos;


    public void setId(int id) {
        this.id = id;
    }

    @Id
    public int getId() {
        return id;
    }

    public void tablero(int filas, int columna)//, Usuario jugador, ListaDE listaBarco)
    {
        this.columna = columna;
        this.filas = filas;
        //this.usuario = jugador;
        this.estadoTablero = true;

    }

    public String validarDisparo(int x, int y)
    {

        return "test";
    }


}
