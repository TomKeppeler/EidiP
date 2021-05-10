package b10a3;

import java.io.IOException;

public class DynFeldVonInt{
    private int[] feld;
    public DynFeldVonInt(int laenge) throws IllegalArgumentException{
        if (laenge < 0){
            throw new IllegalArgumentException("kleiner als 0: laenge = " + laenge);
        }
        feld = new int[laenge];
    }

    public int length(){
        return feld.length;
    }

    public int get(int i) throws IllegalArgumentException{
        if(i <= 0){
            throw new IllegalArgumentException("Der index darft nicht kleiner als 0 sein!");
        }
        return feld[i];
    }
    public void set(int i, int v) throws IllegalArgumentException{
        if(i <= 0){
            throw new IllegalArgumentException("Der index darft nicht kleiner als 0 sein!");
        }
        feld[i] = v;
    }
    public void insert(int i, int k) throws IllegalArgumentException{
        if (k < 0) {
            throw new IllegalArgumentException("kleiner als 0: k = " + k);
        }
        if(i <= 0){
            throw new IllegalArgumentException("Der index darft nicht kleiner als 0 sein!");
        }
        int[] f = new int[feld.length+k];
        for (int j = 0; j < i; j++) {           //alles vor i wird in f eingefühgt
            f[j] = feld[j];
        }
        for (int j = i+k; j < f.length; j++) {
            f[j] = feld[j-k];                   //dann ab i+k werden die übrigen Werte eingefühgt
        }                                       //zwischen i und i+k sind 0 durch new int[länge]
        feld = f;
    }
    public void remove(int i, int k) throws IllegalArgumentException{
        if (k < 0 | k > feld.length) {
            throw new IllegalArgumentException("kleiner als 0: k = " + k);
        }
        if(i <= 0){
            throw new IllegalArgumentException("Der index darft nicht kleiner als 0 sein!");
        }
        int[] f = new int[feld.length-k];
        for (int j = 0; j < i; j++) {           //alles vor i wird in f eingefühgt
            f[j] = feld[j];
        }
        for(int j = i+k; j < feld.length; j++){ //es werden die Werte zwischen i und k übersprungen
            f[j-k] = feld[j];                   //auf pos. i wird nun die felder von i+k eingesetzt
        }
        feld = f;
    }
    public boolean equals(DynFeldVonInt f) {
        return java.util.Arrays.equals(f.feld, feld);
      /*  for (int i = 0; i < feld.length; i++) {
            if(f.feld[i] != feld[i]){
                return false;
            }
        }
        return true; */
    }
    public String toString(){
        if(feld.length == 0){
            return "[]";
        }
        String out = "[" + feld[0];
        for (int i = 1; i < feld.length; i++){
            out += "," + feld[i];
        }
        return out + "]";
    }

    public static void main(String[] args){
        DynFeldVonInt f = new DynFeldVonInt(20);
        for (int i = 0; i < f.length(); i++) {
            f.set(i, i);
        }
        f.insert(5, 5);
        for (int i = 0; i < f.length(); i++) {
            System.out.println(f.get(i));
        }
        System.out.println(f.toString());

    }


}
