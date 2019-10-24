package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] niz;
    final int BROJ_ARTIKALA=50;
    private int brEl=0;
    public Korpa(){
        niz=new Artikl[BROJ_ARTIKALA];
    }
    public boolean dodajArtikl(Artikl art){
        if(brEl==BROJ_ARTIKALA) return  false;
        this.niz[brEl]=new Artikl(art.naziv, art.cijena, art.kod);
        brEl++;
        return true;
    }
    public Artikl[] getArtikli(){
        return niz;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl izbaceni=null;
        for(int i=0;i<this.brEl;i++){
            if(this.niz[i].kod.equals(kod)){
                izbaceni=this.niz[i];
                this.niz[i]=this.niz[brEl-1];
                this.niz[brEl-1]=null;
                this.brEl--;
                break;
            }
        }
        return izbaceni;
    }
    public int dajUkupnuCijenuArtikala(){
        int suma=0;
        for(int i=0;i<this.brEl;i++){
            suma=suma+this.niz[i].cijena;
        }
        return suma;
    }

}
