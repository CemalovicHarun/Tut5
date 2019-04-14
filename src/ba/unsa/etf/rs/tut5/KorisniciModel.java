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

    public ObservableList<Korisnik> getKorisnici() {
        return Korisnici;
    }

    public void setKorisnici(ObservableList<Korisnik> korisnici) {
        Korisnici = korisnici;
    }

    public Korisnik getTrenutniKorisnik() {
        return trenutniKorisnik.get();
    }

    public SimpleObjectProperty<Korisnik> trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    public void setTrenutniKorisnik(Korisnik trenutniKorisnik) {
        this.trenutniKorisnik.set(trenutniKorisnik);
    }
    public void napuni(){
        String ime;
        korisnici.add(new Korisnik(ime:"Šemsudin"))
    }
}

