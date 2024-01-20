module de.fosbossw.textadventure {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.fosbossw.textadventure to javafx.fxml;
    exports de.fosbossw.textadventure;
}