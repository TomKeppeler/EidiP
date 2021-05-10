package b09a2;

import javax.imageio.stream.ImageInputStream;
import java.awt.print.Printable;
import java.util.StringTokenizer;

public class Datum {
    private int tag, monat, jahr;
    private static String tz = "-";
    private static String rf = "jmt";

    public Datum(int jahr, int monat, int tag) {
        if (jahr >= 0) {
            this.jahr = jahr;
        }
        if (monat > 0 && monat < 13) {
            this.monat = monat;
        } else {
            this.monat = 1;
        }
        if (tag > 0 && tag < 32) {
            this.tag = tag;
        } else {
            this.tag = 1;
        }
    }

    public Datum(){
        this(1, 1, 1);
    }

    public Datum(int jahr){
        this(jahr, 1, 1);
    }

    public Datum(int jahr, int monat){
        this(jahr, monat, 1);
    }

    public Datum(Datum d){
        this(d.jahr, d.monat, d.tag);
    }

    public int jahr(){
        return this.jahr;
    }

    public int monat(){
        return this.monat;
    }

    public int tag(){
        return this.tag;
    }

    public boolean equals(Datum d) {
        if (this == d) return true;
        if (d == null || getClass() != d.getClass()) return false;
        return tag == d.tag &&
                monat == d.monat &&
                jahr == d.jahr;
    }

    public boolean istFrueher(Datum d){
        if(equals(d)){
            return false;
        }else{
            if(this.jahr == d.jahr && this.monat == d.monat && this.tag < d.tag){
                return true;
            }
            if(this.jahr == d.jahr && this.monat < d.monat){
                return true;
            }
            if(this.jahr < d.jahr){
                return true;
            }
        }
        return false;
    }

    public String getnull(int n){
        if(n < 10 && n >= 0){
            return "0" + n;
        }
        return String.valueOf(n);
    }

    public String toString() {
        String t = getnull(this.tag), m = getnull(this.monat), j = String.valueOf(this.jahr), tr = tz;
        if (tz.equals("0")){
            t = getnull(this.tag) + ".";
            m = nameVonMonat(this.monat);
            tr = " ";
        }
        if(rf.equals("jmt")){
            return j + tr + m + tr + t;
        }else if(rf.equals("tmj")){
            return t + tr + m + tr + j;
        }else if(rf.equals("mtj")){
            return m + tr + t + tr + j;
        }
        return j + tr + m + tr + t;
    }

    public static void setFormatRF(String r){
        if(r.equals("jmt")){
            rf = r;
        }
        if(r.equals("tmj")){
            rf = r;
        }
        if(r.equals("mtj")){
            rf = r;
        }
    }

    public static void setFormatTZ(char t){
        tz = String.valueOf(t);
    }

    public static String nameVonMonat(int m){
        String out = "";
        switch (m){
            case 1:
                out = "Januar";
                break;
            case 2:
                out = "Februar";
                break;
            case 3:
                 out = "Maerz";
                break;
            case 4:
                out = "April";
                break;
            case 5:
                out = "Mai";
                break;
            case 6:
                out = "Juni";
                break;
            case 7:
                out = "Juli";
                break;
            case 8:
                out = "August";
                break;
            case 9:
                out = "September";
                break;
            case 10:
                out = "Oktober";
                break;
            case 11:
                out= "November";
                break;
            case 12:
                out = "Dezember";
                break;
        }
        return out;
    }
    public static int monatVonName(String m){
        int out = 0;
        switch (m){
            case "Januar":
                out = 1;
                break;
            case "Februar":
                out = 2;
                break;
            case "Maerz":
                out = 3;
                break;
            case "April":
                out = 4;
                break;
            case "Mai":
                out = 5;
                break;
            case "Juni":
                out = 6;
                break;
            case "Juli":
                out = 7;
                break;
            case "August":
                out = 8;
                break;
            case "September":
                out =  9;
                break;
            case "Oktober":
                out = 10;
                break;
            case "November":
                out = 11;
                break;
            case "Dezember":
                out = 12;
                break;
        }
        return out;
    }

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
    public int tageInMonat(int j, int m) throws IllegalAccessException{
        int out = 0;
        if(m > 12 | m<1){
            throw new IllegalArgumentException("Kein Monat");
        }

        switch (m) {
            case 2:
                out = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                out = 30;
                break;
            default:
// Ann.: monat OK
                out = 31;
                break;
        }

        if (m == 2){
            if (istSchaltjahr(j)){
                out = 29;
            }
        }
        return out;
    }

}
