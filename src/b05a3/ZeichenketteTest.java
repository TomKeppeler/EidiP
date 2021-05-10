package b05a3;
import b05a1.Zeichenkette;
public class ZeichenketteTest {
    public static boolean ZiffernfolgeCheck(String z, boolean erw){
        if(Zeichenkette.istZiffernfolge(z) == erw){
            return true;
        }else{
            return false;
        }
    }

    public static boolean testZiffernfolge(){
        return ZiffernfolgeCheck("Hallo World!", false) & ZiffernfolgeCheck("112", true)
                & ZiffernfolgeCheck("1as2", false) & ZiffernfolgeCheck("", true)
                & ZiffernfolgeCheck(" 11", false);
    }

    public static boolean test(){
        return testZiffernfolge();
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}
