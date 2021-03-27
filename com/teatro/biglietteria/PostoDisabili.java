package com.teatro.biglietteria;

public class PostoDisabili extends Posto {
    boolean perDisabili = true;

    public PostoDisabili(String fila, int numero, TipologiaPosto diTipo) {
        super(fila, numero, diTipo);
    }
}
