package vizsgafeladat;

import java.util.Collections;

public class Vizsgafeladat {

    public static void main(String[] args) {

        Harcos harcos1 = new Harcos(5, 6, "Zsuga", "ork");
        harcos1.felvesz(new Eszkoz("kapa", 5));
        harcos1.felvesz(new Eszkoz("kasza", 6));
        harcos1.felvesz(new Eszkoz("kalapács", 10));
        harcos1.felvesz(new Eszkoz("balta", 4));
        harcos1.eldob(0);
        
        Collections.sort(harcos1.getEszkozok(), Harcos.EszkozRendezo());
        System.out.println(harcos1);
    }
    
}
