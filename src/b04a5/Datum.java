package b04a5;

public class Datum {

    public static boolean istSchaltjahr(int jahr) {
        boolean ist = false;
        if (jahr % 4 == 0 & jahr < 1583) {
            ist = true;
        }
        if ((jahr >= 1583 & jahr % 4 == 0 & jahr % 100 != 0) | (jahr % 400 == 0 & jahr >= 1583)) {
            ist = true;
        }
        return ist;
    }
    public static boolean istSchaltjahr2(int jahr) {
        return (jahr % 4 == 0 && jahr < 1583) | ((jahr >= 1583 && jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0 && jahr >= 1583));
    }
    public static void main(String[] args) {
        int j = 1500;


        while (j < 2200) {
            if (istSchaltjahr(j)) {
                System.out.println(j + " :ist Schaltjahr!");
            }
            ++j;
        }
    }
}
