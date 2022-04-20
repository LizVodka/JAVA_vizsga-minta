package vizsgafeladat;

import java.util.ArrayList;
import java.util.Collections;

public class Vizsgafeladat {

    public static void main(String[] args) {
        
        ArrayList<Harcos> harcosok = new ArrayList<Harcos>();

        Harcos harcos1 = new Harcos(5, 6, "Zs", "ork");
        harcos1.felvesz(new Eszkoz("kapa", 5));
        harcos1.felvesz(new Eszkoz("kasza", 6));
        harcos1.felvesz(new Eszkoz("kalapács", 10));
        harcos1.felvesz(new Eszkoz("balta", 4));
        harcos1.eldob(0);
        harcosok.add(harcos1);
        
        Harcos harcos2 = new Harcos(3, 7, "Zsugabubus");
        harcos2.felvesz(new Eszkoz("ék", 2));
        harcos2.felvesz(new Eszkoz("ásó", 6));
        harcos2.felvesz(new Eszkoz("balta", 4));
        harcosok.add(harcos2);
        
        Harcos harcos3 = new Harcos(10, 10, "Masni", "elf");
        harcos3.felvesz(new Eszkoz("kard", 10));
        harcos3.felvesz(new Eszkoz("ásó", 6));
        harcos3.felvesz(new Eszkoz("kristály", 1));
        harcosok.add(harcos3);
        
        Harcos harcos4 = new Harcos(2, 10, "Tapsi", "varázsló");
        harcos4.felvesz(new Eszkoz("pálca", 1));
        harcos4.felvesz(new Eszkoz("bot", 5));
        harcos4.felvesz(new Eszkoz("kristály", 1));
        harcos4.felvesz(new Eszkoz("könyv", 6));
        harcosok.add(harcos4);
        
        Collections.sort(harcos1.getEszkozok(), Harcos.EszkozRendezo());
//        System.out.println(harcos1);
        
//        System.out.println("Erő szerinti rendezés: ");
        Collections.sort(harcosok, Harcos.EroRendezo());
//        System.out.println(harcosok);
        
//        System.out.println("Ügyesség szerinti rendezés: ");
        Collections.sort(harcosok, Harcos.UgyessegRendezo());
//        System.out.println(harcosok);
        
        harcos1.kiir2("src/res/harcos.txt");
        harcosok.remove(harcos1);
//        System.out.println("\n Harcosok az első törlése után: ");
//        System.out.println(harcosok);
        Object harcos;
        harcos = Harcos.beolvas("src/res/harcos.txt");
        System.out.println("\n Első harcos beolvasás után: ");
        System.out.println(harcos);
    }
    
}
