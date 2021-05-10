package b06a6;

import java.util.Scanner;

public class InterpreterTest {
    public static boolean test() {
        return verarbeiteTest();
    }

    private static boolean verarbeiteTest() {
        return verarbeiteCheck("vor s in durstiger", "dur") |
                verarbeiteCheck("nach s in durstiger", "tiger") |
                verarbeiteCheck("vor a in durstiger", "") |
                verarbeiteCheck("nach a in durstiger", "durstiger");
    }

    private static boolean verarbeiteCheck(String s, String erw) {
        boolean erg = Interpreter.verarbeite(new Scanner(s)).equals(erw);
        if(!erg){
            System.out.println("Fehler für: verarbeite(\""+s+"\") gibt "+ Interpreter.verarbeite(new Scanner(s)) +" zurück " +
                    "erwartet war aber: "+ erw);
        }
        return erg;
    }
}
