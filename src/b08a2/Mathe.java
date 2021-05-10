package b08a2;

public class Mathe{
    public static int addRek(int a, int b){
        if(a < 0){
            a *= -1;
        }
        if(b < 0){
            b *= -1;
        }
        return addRek(a,b, 0);
    }

    private static int addRek(int a, int b, int c){
        if(!(b > 0)){
            return a;
        }
        ++a;
        --b;
        return addRek(a,b, c);
    }
    public static int addRekAlt(int a, int b){
        if(a < 0){
            a *= -1;
        }
        if(b < 0){
            b *= -1;
        }
        if(!(b > 0)){
            return a;
        }
        ++a;
        --b;
        return addRek(a,b);
    }

    public static int addRekMarcel(int a, int b){
        if(b > 0){
            return addRekMarcel(++a, --b);
        }else if(b < 0){
            return addRekMarcel(a, b);
        }
        return a;
    }

    public static int subRek(int a, int b){
        if(!(b > 0)){
            return a;
        }
        --a;
        --b;
        return subRek(a,b);
    }
    public static int mulRek(int a, int b){
        if(b == 0){
            return 0;
        }
        return addRek(a, mulRek(a, --b));
    }
    public static int divRek(int a, int b){
        if(b == 0){
            return 0;
        }
        return subRek(a, divRek(a, --b));
    }

    public static void main(String[] args) {
        System.out.println(addRekAlt(-50,-50));
        System.out.println(addRek(-50,-50));
        System.out.println(addRekMarcel(50,-50));
    }
}
