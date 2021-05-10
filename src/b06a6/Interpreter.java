package b06a6;
import java.util.Scanner;
public class Interpreter {
    public static String verarbeite(Scanner s) {
        String pos = "", zei = "", in = "", zeifo = "";
        while(s.hasNext()){
            pos = s.next();
            zei = s.next();
            in = s.next();
            zeifo = s.next();
            if(pos.equals("vor")){
                if (!zeifo.contains(zei)){
                    return "";
                }
                return zeifo.substring(0, zeifo.lastIndexOf(zei.charAt(0)));
            }
            if(pos.equals("nach")){
                return zeifo.substring(zeifo.indexOf(zei.charAt(0)) + 1);
            }
        }
        return "";
    }
    public static void main(String[] args){
        //Scanner s = new Scanner(System.in);
        //System.out.println(verarbeite(s));
        System.out.println(verarbeite(new Scanner("nach s in durstiger")));
       // System.out.println(InterpreterTest.test());
    }
}
