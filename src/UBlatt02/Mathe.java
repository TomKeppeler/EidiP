package UBlatt02;
/*
 * @author tkeppe2s
*/

public class Mathe {

    public static void quadOutRueck(int n) {//3a
        while (n >= 1){
            System.out.println(n*n);
            --n;
        }
    }
    public static long fak(int n){//3b
        long f=1;
        while (n > 1){
            f *= n--;
        }
        return f;
    }
    public static long fakalt(int n){
        if(n<=1) {
            return 1;
        }else {
            return fakalt(n - 1) * n;
        }
    }
    public static long fak2(int n){
        long fak=1;
        while (1 <= n){
            fak = fak *n;
            --n;
        }
        return fak;
    }
}
