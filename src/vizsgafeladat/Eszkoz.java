package vizsgafeladat;

import java.io.Serializable;
import java.util.Comparator;

public class Eszkoz implements Serializable{
    private String nev;
    private int suly;

    public Eszkoz(String nev, int suly) {
        this.nev = nev;
        this.suly = suly;
    }

    public String getNev() {
        return nev;
    }

    public int getSuly() {
        return suly;
    }

    @Override
    public String toString() {
        return "\n\t\tEszkoz{" + "nev=" + nev + ", suly=" + suly + '}';
    }


 
    
}
