package b08a5;

public class Mathe {
    public static int addRek(int a, int b) {
        if (b > -1) {
            if (b == 0) {
                return a;
            } else {
                return (1 + addRek(a, b - 1));
            }
        } else {
            return subRek(a, (-1) * b);
        }
    }


    // sub considering negative nums
    public static int subRek(int a, int b) {
        if (b > -1) {
            if (b == 0) {
                return a;
            } else {
                return subRek((a - 1), (b - 1));
            }
        } else {
            return addRek(a, (-1) * b);
        }
    }

    // mult
    public static int mulRek(int a, int b) {
        if (b > -1) {
            if (a < b) {
                return mulRek(b, a);
            } else if (b != 0) {
                return (a + mulRek(a, b - 1));
            } else {
                return 0;
            }
        }
        else
            b = -b;
        return -(a + mulRek(a, b - 1));
    }


    // div
    public static int divRek(int a, int b) {
        boolean isNeg = false;
        if (a < 0 && b < 0) {
            a = -a;
            b = -b;
        } else if (a > 0 && b < 0) {
            b = -b;
            isNeg = true;
        } else if (a < 0 && b > 0) {
            a = -a;
            isNeg = true;
        }

        if (a < b) {
            return 0;
        }
        if (!isNeg) {
            return 1 + divRek(a - b, b);
        } else {
            return -(1 + divRek(a - b, b));
        }
    }

    // mod
    public static int modRek(int a, int b){
        int q = (int)divRek(a,b);
        int p = q * b;

        return a - p;
    }

    public static int powRek(int a, int b) {
        if (b == 1) {
            return a;
        } else if (b == 0) {
            return 1;
        } else if (a == 0) {
            if (b == 0) {
                return 1;
            }
        }
        b--;
        return mulRek(powRek(a, b), a);

    }

    public static int powRekFAST(int a, int b) {
        if (b == 1) {
            return a;
        } else if (b == 0) {
            return 1;
        }//A=0 wird nicht explizit behandelt, da 0x(ergebnis) = 0 und somit korrekt.
        if (b % 2 == 0) {
            return (powRekFAST(mulRek(a,a), b/2));//3 ^4 = (3x3)^(4/2)
        }else{
            //return mulRek(powRekFAST(mulRek(a,a), (b-1)/2), a);//3 ^5 == 3 ^4 x 3
        }
        return mulRek(powRekFAST(mulRek(a,a), (b-1)/2), a);//3 ^5 == 3 ^4 x 3
    }//JAVA: 5/2 == 4/2


}
