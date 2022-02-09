package b10a5;

import java.util.*;

public class IbanBerechnen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String land = sc.next();
        String blz = sc.next();
        String kn = sc.next();
        sc.close();
        String iban = großBuchstaben(land)
                + pruefzahl(moduloWert(stringZusammensetzen(großBuchstaben(land), blz, knNormal(kn)))) + blz
                + knNormal(kn);
        System.out.println(iban);
    }

    public static String großBuchstaben(String a) {
        return a.toUpperCase();
    }

    public static String knNormal(String b) {
        if (b.length() == 10) {
            return b;
        } else {
            for (int i = b.length(); i < 10; i++) {
                b = "0" + b;
            }
            return b;
        }
    }

    public static String stringZusammensetzen(String e, String f, String g) {
        char erster = e.charAt(0);
        char zweiter = e.charAt(1);
        int a = erster - 'A' + 10;
        int b = zweiter - 'A' + 10;
        String h = f + g + String.valueOf(a) + String.valueOf(b) + "00";
        return h;
    }

    public static int moduloWert(String j) {

        if (j.length() > 9) {
            int i = Integer.parseInt(j.substring(0, 9));
            j = j.substring(9);
            i = i % 97;
            j = String.valueOf(i) + j;
            return moduloWert(j);
        } else {
            int i = (Integer.parseInt(j) % 97);
            return i;
        }
    }

    public static String pruefzahl(int z) {
        if (98 - z < 10) {
            return "0" + String.valueOf(98 - z);
        } else {
            return String.valueOf(98 - z);
        }
    }
}