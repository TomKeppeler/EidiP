package b03a2;

public class Mathe {
    public static void ausgabeVielfache(int a, int n) { //a
        int v = 1;
        while (v <= n) {
            System.out.print(a * v + " ");
            ++v;
        }
        System.out.print("\n");
    }

    public static void ausgabe1x1(int n) {//b
        int i = 1;
        while (i <= n) {
            ausgabeVielfache(i, n);
            ++i;
        }
    }

    public static void main(String[] args) {
      //  System.out.println("Auf. a: a=4 n=5");
       ausgabeVielfache(4, 5);
        //System.out.println("Auf. b: n=5");
      //  ausgabe1x1(5);
    }
}
