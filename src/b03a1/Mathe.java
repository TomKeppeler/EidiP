package b03a1;

public class Mathe {
    public static int ggTAdd(int a, int b) { //a
        if (a == 0) {
            return b;
        }

        while (a > 0 && b != 0) {
            if (a > b) {
                a -= b;
            } else {
                if (b >= a) {
                    b -= a;
                }
            }
        }
        return a;
    }

    public static int ggTAddOut(int a, int b) { // c
        if (a == 0) {
            System.out.println(a + " " + b);
            return 0;
        }
        int count = 0;
        while (a > 0 && b != 0) {
            System.out.println(a + " " + b);
            if (a > b) {
                a -= b;
            } else {
                if (b >= a) {
                    b -= a;
                }
            }
            ++count;
        }
        System.out.println(a + " " + b);
        return count;
    }

    public static int ggTMul(int a, int b) { //b
        int t;
        while (b > 0) {
            t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static int ggTMulOut(int a, int b) { //d
        int count = 0;
        int t;
        System.out.println(a + " " + b);
        while (b > 0) {
            t = a % b;
            a = b;
            b = t;
            ++count;
            System.out.println(a + " " + t);
        }
        return count;
    }

    public static int ggT(int a, int b) { //e
        if (a < 0) {
            a *= -1;
        }
        if (b < 0) {
            b *= -1;
        }
        return ggTMul(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Auf. a:\n" + ggTAdd(10, 25));
        System.out.println("Auf. b:\n" + ggTMul(10, 25));
        System.out.println("Auf. c:");
        System.out.println("Wdh.: " + ggTAddOut(10, 25));
        System.out.println("Auf. d:");
        System.out.println("Wdh.: " + ggTMulOut(24, 78));
        System.out.println("Auf. e:\n" + ggT(-10, 25));
    }
}
