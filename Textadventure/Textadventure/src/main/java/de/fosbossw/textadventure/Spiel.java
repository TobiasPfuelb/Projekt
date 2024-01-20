package de.fosbossw.textadventure;

public class Spiel {
    private Raum hof;
    private Raum eingang;
    private Raum chillout;
    private Raum pausenhalle;
    private Raum treppenhaus;

    private Raum aktuellerRaum;

    public Spiel() {
        raeumeErstellen();
        raeumeVerbinden();
        aktuellerRaum = hof;

    }

    private void raeumeVerbinden() {
        hof.setNorden(eingang);
        eingang.setNorden(treppenhaus);
        eingang.setWesten(chillout);
        eingang.setOsten(pausenhalle);
        eingang.setSueden(hof);
        chillout.setOsten(eingang);
        pausenhalle.setWesten(eingang);
        treppenhaus.setSueden(eingang);
    }


    private void raeumeErstellen() {
        hof = new Raum("Hof", "Du befindest dich im Hof.");
        eingang = new Raum("Eingangsbereich", "Du befindest dich im Eingangsbereich.");
        chillout = new Raum("Chilloutraum", "Du befindest dich im Chilloutraum.");
        pausenhalle = new Raum("Pausenhall", "Du befindest dich in der Pausenhalle.");
        treppenhaus = new Raum("Treppenhaus", "Du befindest dich im Treppenhaus.");
    }

    public Raum getAktuellerRaum() {
        return aktuellerRaum;
    }

    public void setAktuellerRaum(Raum aktuellerRaum) {
        this.aktuellerRaum = aktuellerRaum;
    }
}
