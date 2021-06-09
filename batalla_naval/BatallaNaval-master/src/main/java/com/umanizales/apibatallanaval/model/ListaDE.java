package com.umanizales.apibatallanaval.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter

public class ListaDE implements Serializable {
    private NodoDE cabeza;
    private int cont;

    public ListaDE() {
        this.cont = 0;
    }

    public NodoDE getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoDE cabeza) {
        this.cabeza = cabeza;
    }


    public void adicionarNodo(Object dato) {
        if (cabeza == null) {
            cabeza = new NodoDE(dato);
            cont++;
        } else {
            NodoDE temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            // En el ultimo
            temp.setSiguiente(new NodoDE(dato));
            cont++;
        }
    }

    public void adicionarNodoAlInicio(Object dato) {
        if (cabeza == null) {
            cabeza = new NodoDE(dato);
            cont++;
        } else {
            NodoDE temp = new NodoDE(dato);
            temp.setSiguiente(cabeza);
            cabeza = temp;
            cont++;
        }
    }

    public String listadoNodos() {
        String listado = "";
        NodoDE temp = cabeza;
        while (temp != null) {
            listado = listado + temp.getDato();
            temp = temp.getSiguiente();
        }

        return listado;
    }

    public int getCont() {
        return cont;
    }

    public Object encontrarDatoxid(String id) {
        if (cabeza != null) {
            NodoDE temp = cabeza;
            while (temp != null) {
                if (temp.getDato().equals(id)) {
                    return temp.getDato();
                }
                temp = temp.getSiguiente();
            }
        }
        return null;
    }
}