package b04a1;

import java.util.*;

public class Eingabe {
    public static double durchschnitt(Scanner s){
        double in=.0;
        int c=0;
        while (s.hasNext()){
            in += s.nextDouble();
            ++c;
        }
        return in/c;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(durchschnitt(s));
    }
}
