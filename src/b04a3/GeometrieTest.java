package b04a3;

import java.util.Scanner;

public class GeometrieTest{
    public static void test(java.util.Scanner scanner){
        double breite = 0, hoehe = 0;
        String zk = "";
        while (scanner.hasNext()){
            breite = scanner.nextDouble();
            hoehe = scanner.nextDouble();
            zk = scanner.next();
            if (zk.equals("Umfang")){
                System.out.println(Geometrie.umfangREck(breite, hoehe));
            }else if (zk.equals("Flaeche")){
                System.out.println(Geometrie.flaecheREck(breite, hoehe));
            }else{
                System.out.println("Falsche Eingabe!");
            }
        }
    }

    public static void main(String[] args) {
        test(new Scanner("-3 4 Umfang"));
    }
}
