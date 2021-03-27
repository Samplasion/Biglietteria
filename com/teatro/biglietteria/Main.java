package com.teatro.biglietteria;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Spettacolo spettacolo = new Spettacolo("Il lago dei cigni", "Pëtr Il'ič Čajkovskij")
                .addCast("Mario Rossi")
                .addCast("Maria Bianchi")
                .addReplica(new Replica(new Date(), 10))
                .addReplica(new Replica(new Date(), 11))
                .addReplica(new Replica(new Date(), 12));

        StringBuilder castString = new StringBuilder();
        for (String cast : spettacolo.cast) {
            castString.append(" - ").append(cast).append("\n");
        }

        System.out.println(String.format(
                "======\nSpettacolo: %s\nCast:\n%s======\n",
                spettacolo.titolo,
                castString.toString()
        ));

        Replica replicaDelle11 = spettacolo.repliche.get(1);

        System.out.println(String.format(
                "Replica del %d/%d/%d alle %d.\n",
                replicaDelle11.data.getDate(),
                replicaDelle11.data.getMonth(),
                replicaDelle11.data.getYear() + 1900,
                replicaDelle11.ora
        ));

        Posto posto = new Posto("F", 21, new TipologiaPosto("Posto centrale"));
        Prenotazione prenotazione = new Prenotazione("Giuseppe Verdi", new Date(), replicaDelle11)
                .setPosto(posto);

        Posto postoDisabili = new PostoDisabili("A", 4, new TipologiaPosto("Posto laterale"));
        Prenotazione prenotazioneDisabili = new Prenotazione("Marta Gialli", new Date(), replicaDelle11)
                .setPosto(postoDisabili);
        
        System.out.println(String.format(
                "Il posto %s%d è per disabili: %b\nIl posto %s%d è per disabili: %b",
                prenotazione.getPosto().fila,
                prenotazione.getPosto().numero,
                prenotazione.perPostoDisabile(),
                prenotazioneDisabili.getPosto().fila,
                prenotazioneDisabili.getPosto().numero,
                prenotazioneDisabili.perPostoDisabile()
        ));
    }
}
