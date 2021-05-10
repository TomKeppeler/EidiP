package b10a1;

import java.util.Arrays;

public class Feld {
    public static boolean istHomogen(int[] f) throws NullPointerException{
        if(f == null){
            throw new NullPointerException("Feld ist null");
        }
        if(f.length == 0){
            return true;
        }
        int p = f[0];
        for (int i = 0; i < f.length; i++) {
            if(p != f[i]){ //der erste durchlauf ist nicht nötig
                return false;
            }
            p = f[i];
        }
        return true;
    }
    public static boolean istSortiert(int[] f){
        if(f == null){
            throw new NullPointerException("Feld ist null");
        }
        if(f.length == 0){
            return true;
        }
        for (int i = 0; i < f.length-1; i++) {
            if(!(f[i] <= f[i+1])){
                return false;
            }
        }
        return true;
    }

    public static int maxPos(int[] f) throws NullPointerException, IllegalArgumentException{
        if(f == null){
            throw new NullPointerException("Feld ist null");
        }
        if(f.length == 0){
            throw new IllegalArgumentException("Feld ist leer");
        }
        int max = f[0], pos = 0;
        for (int i = 0; i < f.length; i++) {
            if(f[i] > max){
                max = f[i];
                pos = i;
            }
        }
        return pos;
    }
    public static int maxElement(int[] f) throws NullPointerException, IllegalArgumentException{
            return f[maxPos(f)];
    }
    public static int[] max(int[] f1, int[] f2)  throws NullPointerException, IllegalArgumentException{
        if(f1 == null | f2 == null){
            throw new NullPointerException("Feld ist null");
        }
        if(f1.length != f2.length){
            throw new IllegalArgumentException("Falsche Laenge!");
        }
        int[] erg = new int[f1.length];
        for (int i = 0; i < erg.length; i++) {
            if(f1[i] > f2[i]){
                erg[i] = f1[i];
            }else {
                erg[i] = f2[i];
            }
        }
        return erg;
    }
    public static void main(String[] args) {
       // System.out.println(maxPos(new int[]{0, 1, 1, 1, -1 ,4}));
       int[] a = {-3, -1, -8, -4, -1 ,-4};
       int[] b = {1,2,3,4,1};
       System.out.println(istSortiert(b));
    }
}
