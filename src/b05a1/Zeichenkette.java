package b05a1;

public class Zeichenkette {
    public static boolean istZiffernfolge(String a){ // a
        boolean erg = false;
        if(a.length() == 0){
            return true;
        }
        for (int i = 0;i < a.length();++i){
            if(Character.isDigit(a.charAt(i))){
                erg = true;
            }else{
                return false;
            }
        }
        return erg;
    }
    public static boolean istZiffernfolge2(String a){ // a
        if(a.length() == 0){
            return true;
        }
        for (int i = 0;i < a.length();++i){
            if(!Character.isDigit(a.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean istName(String a){ // b
        boolean erg = false;
        int i = 0;
        if(a.equals("")){
            return true;
        }
        if(a.contains(" ")){
            return false;
        }
        if(a.charAt(0) == '-' | a.charAt(a.length()-1) == '-'){
            return false;
        }
        while (i < a.length()){
            if(Character.isAlphabetic(a.charAt(i)) | a.charAt(i) == '-'){
                erg=true;
            }else{
                return false;
            }
            ++i;
        }
        return erg;
    }
    public static boolean istName2(String a){ // b
        if(a.equals("")){
            return true;
        }
        if(a.contains(" ") | a.charAt(0) == '-' | a.charAt(a.length()-1) == '-'){
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if(!(Character.isAlphabetic(a.charAt(i)) | a.charAt(i) == '-')){
                return false;
            }
            ++i;
        }
        return true;
    }

    public static int anzahlBuchstaben(String s){ //c
        int l = 0, i = 0;
        while (i < s.length()){
            if(Character.isAlphabetic(s.charAt(i))){
                ++l;
            }
            ++i;
        }
        return l;
    }
    public static String vokaleGross(String s){ //d
        int i = 0;
        String out = "";
        while(i < s.length()){
            if(s.toLowerCase().charAt(i)=='a' | s.toLowerCase().charAt(i)=='e' |
                s.toLowerCase().charAt(i)=='i' | s.toLowerCase().charAt(i)=='o' |
                s.toLowerCase().charAt(i)=='u'){
                out += s.toUpperCase().charAt(i);
            }else{
                out += s.toLowerCase().charAt(i);
            }
            ++i;
        }
        return out;
    }
    public static void main(String[] args) {
        String a = "141";
        System.out.println(" istZiffernfolge(" + a + "): " + istZiffernfolge(a));
        a = "";
        System.out.println("istName(" + a + "): " + istName(a));
        a = "";
        System.out.println("anzahlBuchstaben(" + a + "): "+ anzahlBuchstaben(a));
        a = "aezt";
        System.out.println("vokaleGross(" + a + "): " + vokaleGross(a));
    }
}
