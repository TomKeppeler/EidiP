package b10a5;

import java.io.IOException;
import java.util.Locale;

public class SWIFT {
    public static String iban(String landeskuerzel, int blz, int kontonummer){
        return landeskuerzel(landeskuerzel) + pruefung(landeskuerzel(landeskuerzel), bban(Integer.parseInt(bankleitzahl(blz)), Integer.parseInt(kontonummer(kontonummer))))
                + bankleitzahl(blz) + kontonummer(kontonummer);
    }
    public static String landeskuerzel(String lk){
        if (lk.length() != 2){
            throw new IllegalArgumentException("Landeskuerzel hat mehr oder weniger zeichen als 2!");
        }
        return lk.toUpperCase();
    }
    public static String bankleitzahl(int b) {
        String blz = String.valueOf(b);
        if (blz.length() == 8 & blz.charAt(0) != '0'){
            return blz;
        }
        throw new IllegalArgumentException("blz muss 8 stellen haben!");
    }
    public static String kontonummer(int k){
        String kontn = String.valueOf(k);
        int l = kontn.length();
        if(kontn.length() != 10){
            for (int i = 0; i < 10-l; i++) {
                kontn = "0" + kontn;
            }
        }
        if(kontn.equals("0000000000")){
            throw new IllegalArgumentException("Die Kontonummer darf nicht nur aus 0 bestehen!");
        }
        return kontn;
    }
    public static String bban(int blz, int kontonummer){
        return bankleitzahl(blz) + kontonummer(kontonummer);
    }
    public static int zahlFuerUpper(char z){
        if ((Character.toUpperCase(z) - 'A') < 0 | (Character.toUpperCase(z) - 'A') > 25) {
            throw new IllegalArgumentException("Kein gueltiger Buchstabe!");
        }
        return Character.toUpperCase(z) - 'A' + 10;
    }
    public static String bbanErgaenzung(String lk){
        if (lk.length() != 2){
            throw new IllegalArgumentException("Landeskuerzel hat mehr oder weniger zeichen als 2!");
        }
        return zahlFuerUpper(lk.charAt(0)) + "" + zahlFuerUpper(lk.charAt(1)) + "00";
    }
    public static int zahlAlsStringMod97(String s) {
        int r = 0;
        for (int i = 0; i < 4; ++i) {
            r = zahlAlsStringMod97Hilfe(r, s.substring(i * 6, (i + 1) * 6));
        }
        return r;
    }
    private static int zahlAlsStringMod97Hilfe(int i, String s) {
        return Integer.parseInt("" + i + s) % 97;
    }

    public static String pruefung(String lk, String bban){
        String erg = String.valueOf(98 - zahlAlsStringMod97(bban + bbanErgaenzung(landeskuerzel(lk))));
        if(erg.length() == 1){
            erg = "0" + erg;
        }
        return erg;
    }
    public static void main(String[] args) {
        System.out.println(iban("DE", 58550130, 67598));
    }

}
