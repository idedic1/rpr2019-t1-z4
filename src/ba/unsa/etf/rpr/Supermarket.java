package ba.unsa.etf.rpr;

public class Supermarket {

    final int BROJ_ARTIKALA=1000;
    private Artikl[] nizArtikala=null;
    private  int brEl=0;



    public Supermarket(){
        this.nizArtikala=new Artikl[BROJ_ARTIKALA];
    }

    public Artikl[] getArtikli() {
        return  this.nizArtikala;
    }


    public boolean dodajArtikl(Artikl art) {
        if (this.brEl == this.BROJ_ARTIKALA) return false;
        this.nizArtikala[brEl] = new Artikl(art.naziv, art.cijena, art.kod);
        this.brEl++;
        return true;

    }

    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl izbaceni=null;
        for(int i=0;i<this.brEl;i++){
            if(this.nizArtikala[i].kod.equals(kod)){
                izbaceni=this.nizArtikala[i];
                this.nizArtikala[i]=this.nizArtikala[brEl-1];
                this.nizArtikala[brEl-1]=null;
                this.brEl--;
                break;
            }
        }
        return  izbaceni;
    }

}
