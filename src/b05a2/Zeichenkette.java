package b05a2;

public class Zeichenkette {
    public static String rueckwaerts(String s){ //a
        int i = s.length()-1;
        String out="";
        while(i >= 0){
            out += s.charAt(i);
            --i;
        }
        return out;
    }
    public static String einfuegung(String s, int p, String t){ //b
        return s.substring(0, p) + t + s.substring(p);
    }

    public static void main(String[] args) {
        String a="Hallo, Welt!";
        System.out.println("rückwärts("+ a +": " + rueckwaerts(a));

        System.out.println("einfuegung(): " + einfuegung("Brot", 2, "Kaese"));
    }
}
