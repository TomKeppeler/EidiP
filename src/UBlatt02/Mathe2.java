package UBlatt02;
/*
 * @author tkeppe2s
 */
public class Mathe2 { //2a
    public static int abs(int n){
        int out=n;
        if (n < 0){
            out= n * -1;
        }
        return out;
    }
    public static int max3(int a, int b, int c){//2b
        if (a > c && a > b){
            return a;
        }else if(b > c){
            return b;
        }else{
            return c;
        }
    }
    public static int max3alt(int a, int b, int c){
        if(a>b){
            if(a>c){
                return a;
            }else{
                return c;
            }
        }else{
            if(c>b){
                return c;
            }else{
                return b;
            }
        }

    }
}
