package b07a1;

public class test {
    public static void main(String[] args) {
        Datum d = new Datum(1899, 13, 32);
        //  System.out.println(d.equals(new Datum(1900)));
        //System.out.println(d.istFrueher(new Datum(1900, 12, 1)));
        System.out.println(d.toString());
        Datum.setFormatRF("tmj");
        Datum.setFormatTZ('|');
        System.out.println(d.toString());
        Datum d2 = new Datum(-1899, 13, 32);
        d.equals(d2);

    }
}
