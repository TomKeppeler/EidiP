package UBlatt02;
/*
 * @author tkeppe2s
 */
public class Zeichenketten {//4a

    public static String grussMitZeit(int stunde, String name){
        String gr = "Guten ";
            if (stunde < 12){
                return  gr + "Morgen, " + name + "!";
            }else{
                if(stunde < 18) {
                    return gr + "Tag, " + name + "!";
                }else{
                    return gr + "Abend, " + name + "!";
                }
            }
    }

    public static String zitronenEis(int n){//4b
        String lecker="leckeres", zitroneneis="Zitroneneis";
        for (int i = 0; i < n; i++) {
            lecker = "super" + lecker;
            zitroneneis ="Z" + zitroneneis;
        }
        return lecker + " " + zitroneneis;
    }
}
