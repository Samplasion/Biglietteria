package com.teatro.biglietteria;

import java.util.List;

public class Posto {
    String fila;
    int numero;
    TipologiaPosto diTipo;

    public Posto(String fila, int numero, TipologiaPosto diTipo) {
        this.fila = fila;
        this.numero = numero;
        this.diTipo = diTipo;
    }
}
