package ba.unsa.etf.rs.tut5;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisniciModel {
    private ObservableList<Korisnik>Korisnici;
    private SimpleObjectProperty<Korisnik>trenutniKorisnik;
    public KorisniciModel(ObservableList<Korisnik> korisnici) {
        this.Korisnici = FXCollections.observableArrayList();
        this.trenutniKorisnik=new SimpleObjectProperty<>();
    }
}