package de.fosbossw.textadventure;

public class Raum {
    private String raumbezeichnung;
    private String raumbeschreibung;

    Raum norden;
    Raum sueden;
    Raum westen;
    Raum osten;

    public Raum(String raumbezeichnung, String raumbeschreibung){
        this.raumbeschreibung = raumbeschreibung;
        this.raumbezeichnung = raumbezeichnung;
    }

    public String getRaumbezeichnung() {
        return raumbezeichnung;
    }

    public void setRaumbezeichnung(String raumbezeichnung) {
        this.raumbezeichnung = raumbezeichnung;
    }

    public String getRaumbeschreibung() {
        return raumbeschreibung;
    }

    public void setRaumbeschreibung(String raumbeschreibung) {
        this.raumbeschreibung = raumbeschreibung;
    }

    public Raum getNorden() {
        return norden;
    }

    public void setNorden(Raum norden) {
        this.norden = norden;
    }

    public Raum getSueden() {
        return sueden;
    }

    public void setSueden(Raum sueden) {
        this.sueden = sueden;
    }

    public Raum getWesten() {
        return westen;
    }

    public void setWesten(Raum westen) {
        this.westen = westen;
    }

    public Raum getOsten() {
        return osten;
    }

    public void setOsten(Raum osten) {
        this.osten = osten;
    }
}
