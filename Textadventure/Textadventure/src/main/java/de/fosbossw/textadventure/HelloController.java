package de.fosbossw.textadventure;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    private Spiel meinSpiel;
    @FXML
    private Label labelRaumbezeichnung;
    @FXML
    private TextArea textAreaRaumbeschreibung;
    @FXML
    private TextField textFieldRichtung;
    @FXML
    private Button buttonGo;
    @FXML
    private Button buttonNorden;

    @FXML
    private Button buttonOsten;

    @FXML
    private Button buttonSüden;

    @FXML
    private Button buttonWesten;


    public void initialize(){
        meinSpiel = new Spiel();
       guiAktualisieren();
        textAreaRaumbeschreibung.setEditable(false);
    }

    private void guiAktualisieren(){
        labelRaumbezeichnung.setText(meinSpiel.getAktuellerRaum().getRaumbezeichnung());
        textAreaRaumbeschreibung.setText(meinSpiel.getAktuellerRaum().getRaumbeschreibung());
        textFieldRichtung.setText("");
    }
    @FXML
    void GoNorden(ActionEvent event) {
        meinSpiel.setAktuellerRaum(meinSpiel.getAktuellerRaum().getNorden());
        guiAktualisieren();
    }

    @FXML
    void GoOsten(ActionEvent event) {
        meinSpiel.setAktuellerRaum(meinSpiel.getAktuellerRaum().getOsten());
        guiAktualisieren();
    }

    @FXML
    void GoSüden(ActionEvent event) {
        meinSpiel.setAktuellerRaum(meinSpiel.getAktuellerRaum().getSueden());
        guiAktualisieren();
    }

    @FXML
    void GoWesten(ActionEvent event) {
        meinSpiel.setAktuellerRaum(meinSpiel.getAktuellerRaum().getWesten());
        guiAktualisieren();
    }
    @FXML
    public void onButtonGoClick(ActionEvent actionEvent) {
        String richtung="";
        richtung=textFieldRichtung.getText();
        switch(richtung){
            case "Norden":
                if(meinSpiel.getAktuellerRaum().getNorden()!=null){
                    meinSpiel.setAktuellerRaum(meinSpiel.getAktuellerRaum().getNorden());
                    }
                break;
            case "Süden":
                if(meinSpiel.getAktuellerRaum().getSueden()!=null){
                    meinSpiel.setAktuellerRaum(meinSpiel.getAktuellerRaum().getSueden());
                }
                break;
            case "Westen":
                if(meinSpiel.getAktuellerRaum().getWesten()!=null){
                    meinSpiel.setAktuellerRaum(meinSpiel.getAktuellerRaum().getWesten());
                }
                break;
            case "Osten":
                if(meinSpiel.getAktuellerRaum().getOsten()!=null){
                    meinSpiel.setAktuellerRaum(meinSpiel.getAktuellerRaum().getOsten());
                }
                break;
        }
        guiAktualisieren();
    }
}