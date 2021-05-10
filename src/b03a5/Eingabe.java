package b03a5;

public class Eingabe {
    public static int zaehlen(java.util.Scanner sc, String s){
        String out="";
        int count=0;
        while (sc.hasNext()){
            out = sc.next();
            if (out.equals(s)){
                ++count;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println(zaehlen(scanner, "zwei"));

    }
}
