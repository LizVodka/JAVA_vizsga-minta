package vizsgafeladat;

import java.util.ArrayList;
import java.util.Comparator;

class EszkozComparator implements Comparator<Eszkoz> {

    @Override
    public int compare(Eszkoz o1, Eszkoz o2) {
        return o1.getNev().compareTo(o2.getNev());
    }

}

public class Harcos extends Karakter{
    private int ero, ugyesseg;
    private ArrayList<Eszkoz> eszkozok;

    public Harcos(int ero, int ugyesseg, String nev, String faj) {
        super(nev, faj);
        this.ero = ero;
        this.ugyesseg = ugyesseg;   
        eszkozok = new ArrayList<>();
    }
  
    public void felvesz(Eszkoz eszkoz) {
        eszkozok.add(eszkoz);
    }
    
    public void eldob(int index) {
        eszkozok.remove(index);
    }

    public int getEro() {
        return ero;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    public ArrayList<Eszkoz> getEszkozok() {
        return eszkozok;
    }
    
    public static EszkozComparator EszkozRendezo() {
        return new EszkozComparator();
    }

    @Override
    public String toString() {
        return "Harcos{" + "ero=" + ero + ", ugyesseg=" + ugyesseg + ", név=" + nev + ", faj=" + faj + ", \n\teszkozok=" + eszkozok + '}';
    }
    
    
}
