package modell;


public class Konfiguracio {
    
    
    /* ADATTAGOK */
    private String nev;
    private int szakIndex;
    private boolean hirlevel;
    
    /* GENERÁLHATÓ */
    /* TAGFÜGGVÉNYEK */

    public Konfiguracio(String nev, int szakIndex, boolean hirlevel) {
        this.nev = nev;
        this.szakIndex = szakIndex;
        this.hirlevel = hirlevel;
    }

    public String getNev() {
        return this.nev;
    }

    public int getSzakIndex() {
        return this.szakIndex;
    }

    public boolean isHirlevel() {
        return this.hirlevel;
    }

    
     /* Ez az objektum szöveges reprezentációja */
    @Override
    public String toString() {
        return "Konfiguracio{" + "nev=" + nev + ", szakIndex=" + szakIndex + ", hirlevel=" + hirlevel + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
