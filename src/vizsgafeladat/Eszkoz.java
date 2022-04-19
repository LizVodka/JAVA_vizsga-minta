package vizsgafeladat;

public class Eszkoz {
    private String nev;
    private int suly;

    public Eszkoz(String nev, int suly) {
        this.nev = nev;
        this.suly = suly;
    }

    @Override
    public String toString() {
        return "Eszkoz{" + "nev=" + nev + ", suly=" + suly + '}';
    }
    
    
}
