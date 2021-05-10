package b05a4;

public class Zeichenkette {
    public static void main(final String[] args) {
        System.out.println(verkuerze("Abrakadabra", 3));
    }


    public static String verkuerze(String s, int n) {
        String ph = "[...]";
        if (s.length() <= n * 2 + ph.length()) {
            return s;
        }

        String result = "";

        for (int i = 0; i < n; i++) {
            result += s.charAt(i);
        }
        result += ph;

        for (int i = s.length() - n; i < s.length(); i++) {
            result += s.charAt(i);
        }
        return result;
    }
}
