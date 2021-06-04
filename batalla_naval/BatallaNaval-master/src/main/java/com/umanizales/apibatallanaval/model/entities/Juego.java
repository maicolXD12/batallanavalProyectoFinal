package com.umanizales.apibatallanaval.model.entities;

import java.security.PrivilegedAction;

public class Juego
{

    private  int id;
    private  Tablero tableroJugador1;
    private  Tablero tableroJugador2;
    private int numeroBarcos;
    private  byte turno;
    private  int aciertosJug1;
    private  int aciertosJug2;



    public void juego(Usuario jugaror1, Usuario jugador2, int numeroBarcos)
    {
        crearTableros();


        this.numeroBarcos = numeroBarcos;


    }

    public String validarDisparo(int x, int y, Usuario jugador)
    {
        return "test";

    }

    private void crearTableros()
    {
        if (numeroBarcos <= 9)
        {
            Tablero table = new Tablero();
            Tablero table2 = new Tablero();
            table.tablero(10,10);
            this.tableroJugador1 = table;
            this.tableroJugador2 = table2;
        }
        if (numeroBarcos > 10 && numeroBarcos <= 20 )
        {
            Tablero table = new Tablero();
            Tablero table2 = new Tablero();
            table.tablero(20,20);
            this.tableroJugador1 = table;
            this.tableroJugador2 = table2;
        }
        if (numeroBarcos > 20)
        {
            Tablero table = new Tablero();
            Tablero table2 = new Tablero();
            table.tablero(30,30);
            this.tableroJugador1 = table;
            this.tableroJugador2 = table2;
        }


    }

    //private Usuario validarGanador()
    //{
        //Usuario ganador;
        //return ganador;
    //}
}
