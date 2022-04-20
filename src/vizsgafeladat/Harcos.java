package vizsgafeladat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

class EszkozComparator implements Comparator<Eszkoz> {

    @Override
    public int compare(Eszkoz o1, Eszkoz o2) {
        return o1.getNev().compareTo(o2.getNev());
    }

}

class EroComparator implements Comparator<Harcos> {

    @Override
    public int compare(Harcos o1, Harcos o2) {
        if (o1.getEro() < o2.getEro()) {
            return -1;
        } else {
            return 0;
        }
    }

}

class UgyessegComparator implements Comparator<Harcos> {

    @Override
    public int compare(Harcos o1, Harcos o2) {
        if (o1.getUgyesseg() < o2.getUgyesseg()) {
            return -1;
        } else {
            return 0;
        }
    }

}

public class Harcos extends Karakter implements Serializable{
    private int ero, ugyesseg;
    private ArrayList<Eszkoz> eszkozok;

    public Harcos(int ero, int ugyesseg, String nev, String faj) {
        super(nev, faj);
        this.ero = ero;
        this.ugyesseg = ugyesseg;   
        eszkozok = new ArrayList<>();
    }
    
    public Harcos(int ero, int ugyesseg, String nev) {
        super(nev, "ember");
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
    
    public static EroComparator EroRendezo() {
        return new EroComparator();
    }
    
    public static UgyessegComparator UgyessegRendezo() {
        return new UgyessegComparator();
    }

    @Override
    public String toString() {
        return "\nHarcos{" + "ero=" + ero + ", ugyesseg=" + ugyesseg + ", név=" + nev + ", faj=" + faj + ", \n\teszkozok=" + eszkozok + '}';
    }
    
    public void kiir2(String utvonal) {
        try {
            FileOutputStream fajlKi = new FileOutputStream(utvonal);
            ObjectOutputStream objKi = new ObjectOutputStream(fajlKi);
            objKi.writeObject(this);
            objKi.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static Object beolvas(String fajlNev) {
        Object harcos = null;
        try {
            FileInputStream fajlBe = new FileInputStream(fajlNev);
            ObjectInputStream objBe = new ObjectInputStream(fajlBe);
            harcos = (Harcos)objBe.readObject();
//            System.out.println((Harcos)objBe.readObject());
            
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return harcos;
    }
}
