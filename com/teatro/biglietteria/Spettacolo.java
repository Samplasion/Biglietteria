package com.teatro.biglietteria;

import java.util.*;

public class Spettacolo {
    String titolo;
    String regista;
    List<String> cast;

    List<Replica> repliche;

    public Spettacolo(String titolo, String regista) {
        this.titolo = titolo;
        this.regista = regista;
        this.cast = new ArrayList<>();
        this.repliche = new ArrayList<>();
    }

    public Spettacolo addCast(String cast) {
        this.cast.add(cast);
        return this;
    }

    public Spettacolo addReplica(Replica replica) {
        this.repliche.add(replica);
        return this;
    }
}
