package b08a3;

public class Mathe {
    public static boolean istPrimLoop(int p) {
        if (p > 1) {
            for (int n = 2; n < p; n++) {
                if (p % n == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static boolean istPrimRek(int p) {
        if (p > 1) {
            return istPrimRek(p, 2);
        }
        return false;
    }
    private static boolean istPrimRek(int p, int n) {
        if (n < p) {
            //es reicht aus es bis wurzel von p zu überprüfen
            if (p % n == 0) {
                return false;
            }
            n++;
            return istPrimRek(p, n);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(istPrimRek(961748941));
    }
}
