package b04a2;

import java.util.Scanner;

public class Messdaten {
    public static double temperaturInDurchschnitt(java.util.Scanner s){
        String be = "", date="";
        int t=0, m=0, j=0;
        double w=.0, gesamt=.0, max=-273.15;
        int count=0;
        while(s.hasNext()){
            j = s.nextInt();
            m = s.nextInt();
            t = s.nextInt();
            be = s.next();
            w = s.nextDouble();
            if (be.equals("Temperatur")){
                gesamt += w;
                ++count;
                if (max<=w){
                    max = w;
                    date = t + "." + m + "." + j;
                }
            }
        }
        System.out.println("hoechste Temperatur (" + max + ") am " + date);
        return gesamt / count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(" 2018 10 17 Niederschlag 1,3");
        System.out.println("Durchschnitt: " + temperaturInDurchschnitt(s));
    }
}
