package b06a7;

import java.io.PrintStream;
import java.util.Scanner;

public class Eingabe {
    public static int filter(Scanner s, PrintStream printStream, String start, String stop, String skip){
        int i = 0;
        String out = "", ausgabe = "";
        while(s.hasNext()) {
           String in = s.next();
            if(in.equals(skip)){
                s.nextLine();
                in = "";
                i--;
            }
            if(in.equals(start)){
                while(!s.next().equals(stop)){}
            }else{
                out += in + " ";
                i++;
            }
        }
        Scanner a = new Scanner(out);
        while(a.hasNext()){
            ausgabe += a.next() + " ";
        }
        a.close();
        printStream.println(ausgabe);
        return i;
    }

    public static void main(String[] args) {
        int i = filter(new Scanner("/*\n" +
                "* Programm: gibt \"Hi!\" aus\n" +
                "*/\n" +
                "public class Hi {\n" +
                "public static void main(String[] args) {\n" +
                "// Ausgabe der Nachricht\n" +
                "System.out.println(\"Hi!\");\n" +
                "}\n" +
                "}"), System.out, "/*", "*/", "//");
        System.out.println("Anzahl: " + i);
    }
}
