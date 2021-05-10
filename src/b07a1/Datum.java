package b07a1;

public class Datum {
    private int tag, monat, jahr;
    private static String tz = "-";
    private static String rf = "jmt";

    public Datum(int jahr, int monat, int tag) {
        if (jahr >= 0){
            this.jahr = jahr;
        }
        if (monat > 0 && monat < 13){
            this.monat = monat;
        } else{
            this.monat = 1;
        }
        if (tag > 0 && tag < 32){
            this.tag = tag;
        } else{
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
        if(rf.equals("jmt")){
            return this.jahr + tz + getnull(this.monat) + tz + getnull(this.tag);
        }else if(rf.equals("tmj")){
            return getnull(this.tag) + tz + getnull(this.monat) + tz + this.jahr;
        }else if(rf.equals("mtj")){
            return getnull(this.monat) + tz + getnull(this.tag) + tz + this.jahr;
        }
        return this.jahr + tz + getnull(this.monat) + tz + getnull(this.tag);
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

    public static void main(String[] args) {
        Datum d = new Datum(-1899, 13, 32);
        Datum d2 = new Datum(1928, 01, 21);
        d2.equals(d2);
        //  System.out.println(d.equals(new Datum(1900)));
        //System.out.println(d.istFrueher(new Datum(1900, 12, 1)));
        System.out.println(d.toString());
        Datum.setFormatRF("tmj");
        Datum.setFormatTZ('|');
        System.out.println(d.toString());
    }
}
