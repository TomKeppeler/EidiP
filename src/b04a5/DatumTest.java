package b04a5;
public class DatumTest {
    public static boolean datumCheck(int j, boolean erw){
        boolean erg =Datum.istSchaltjahr2(j);
        boolean istKo = (erg == erw);
        if(!istKo){
            System.out.println("FEHLER: istSchaltjahr(" + j + ")==" + erg + " statt " + erw);
        }
        return istKo;
    }
    public static boolean testDatum(){
        return datumCheck(2016, true) &
                datumCheck(1580, true) &
                datumCheck(1300, true) &
                datumCheck(1600, true) &
                datumCheck(1900, false) &
                datumCheck(2000, true) &
                datumCheck(2300, false) &
                datumCheck(2304, true) &
                datumCheck(2018, false);

    }
    public static boolean test(){
        return testDatum();
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}
