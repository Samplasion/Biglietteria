package com.teatro.biglietteria;

import java.util.Date;

public class Prenotazione {
    final String cliente;
    final Date data;
    final Replica replica;

    private Posto posto;
    private boolean perPostoDisabile;

    public Prenotazione(String cliente, Date data, Replica replica) {
        this.cliente = cliente;
        this.data = data;
        this.replica = replica;
    }

    public Prenotazione setPosto(Posto posto) {
        this.posto = posto;
        this.perPostoDisabile = posto instanceof PostoDisabili;
        return this;
    }

    public Posto getPosto() {
        return posto;
    }

    public boolean perPostoDisabile() {
        return perPostoDisabile;
    }
}
