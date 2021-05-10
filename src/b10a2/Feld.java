package b10a2;

import java.util.Arrays;

public class Feld {
    public static int[] umkehren(int[] f){
        int[] erg = new int[f.length];
        for (int i = f.length-1, a=0; i >= 0; i--, a++) {//von hinten nach vorne
            erg[a] = f[i];
        }
        return erg;
    }

    public static int[] umkehren2(int[] f) { //von vorne nach hinten
        int[] umgekehrt = new int[f.length];
        for (int index = 0; f.length > index; index++) {
            umgekehrt[f.length-index-1] = f[index];
        }
        System.out.println("Umgekehrt: " + Arrays.toString(umgekehrt));
        System.out.println("Eingabe:   " + Arrays.toString(f));

        return umgekehrt;

    }

    public static int[] umkehrenRek(int[] f){
        return umkehrenRek(f, f.length-1, new int[f.length], 0);
    }

    private static int[] umkehrenRek(int[] f, int i/*letzte Pos.*/, int[] erg, int a/*erste Pos.*/){
        if (!( i >= 0)){
           return erg;
        }
        erg[a] = f[i];
        return umkehrenRek(f, i--, erg, a++);
    }


    public static int[] umkehrenInPlace2(int [] f){
        int tmp = 0; //temporär Zwischenspeicher
        for (int index = 0; f.length > (index + index); index++) {
            tmp = f[f.length - 1 - index];
            f[f.length - 1 - index] = f[index]; // auslöser des index-1 ist bei Möglichkeit 0
            f[index] = tmp;
            System.out.println(tmp);
        }
        return f;
    }
    public static void swap(int[] f, int a, int b) {
        int tmp = f[a];  //vordere Pos. wird temporär gespiechert
        f[a] = f[b];     //dann von der letzten ersetzt
        f[b] = tmp;      //und von der zuletzt ersten ersetzt
    }

    public static void umkehrenInPlace(int[] f) {
        for (int i = 0; i * 2 < f.length; i++) {
            swap(f, i, f.length - 1 - i);
        }
    }


    public static void main(String[] args) {
        int[] a = {3, 1, 8, 5};
        System.out.println(Arrays.toString(umkehren(a)));
    }
}
