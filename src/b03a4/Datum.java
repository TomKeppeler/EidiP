package b03a4;

public class Datum {

    public static boolean istSchaltjahr(int jahr) {
        boolean ist = false;
        if (jahr % 4 == 0 && jahr < 1583) {
            ist = true;
        }
        if ((jahr >= 1583 && jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0 && jahr >= 1583)) {
            ist = true;
        }
        return ist;
    }
    public static boolean istSchaltjahr2(int jahr) { //kürzer
        return (jahr % 4 == 0 && jahr < 1583) | ((jahr >= 1583 && jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0 && jahr >= 1583));
    }
}
