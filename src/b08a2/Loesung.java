package b08a2;

public class Loesung {/**
 */


    // add considering negative nums
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

    // pow
    public static int powRek(int b, int e){
        if (e != 0)
            return (b * powRek(b, e - 1));
        else
            return 1;
    }
}


