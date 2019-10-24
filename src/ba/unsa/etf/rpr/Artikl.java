package ba.unsa.etf.rpr;

public class Artikl {
    String naziv, kod;
    int cijena;

    public Artikl() {}
    public Artikl(String naziv, int cijena, String kod){
        this.naziv=naziv;
        this.cijena=cijena;
        this.kod=kod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }
}
