package b07a4;

import java.util.Objects;

/**
 * @author kgolub2s
 */

 //mit John in Partnerarbeit gemacht :)

public class Uhrzeit {
    private int stunde = 0; // [0;23]
    private int minute = 0; //[0;59]
    static boolean is24h = true;

    public Uhrzeit(){
        stunde = 0;
        minute = 0;
    }
    public Uhrzeit(int s){
        stunde = s;
        minute = 0;
    }
    public Uhrzeit(int s, int m){
        stunde = s;
        minute = m;
    }
    public Uhrzeit(Uhrzeit kopieUhrzeit){
        stunde = kopieUhrzeit.stunde;
        minute = kopieUhrzeit.minute;
    }

    public int stunde(){
        return stunde;
    }
    public int minute(){
        return minute; 
    }

    public boolean equals(Uhrzeit vorgabeUhrzeit){
        if (stunde != vorgabeUhrzeit.stunde) {
            return false;
        }
        if (minute != vorgabeUhrzeit.minute) {
            return false;
        }else{
            return true; 
        }
    }
    public boolean istFrueher(Uhrzeit fruehereUhrzeit){ 
       if(this.stunde == fruehereUhrzeit.stunde){
           if(this.minute == fruehereUhrzeit.minute || this.minute >= fruehereUhrzeit.minute){
               return false;
           }else{
               return true;
           }
       }

       if(this.stunde > fruehereUhrzeit.stunde){
               return false;
       }
       else{
           return true;
           }     
    }


    public String toString() { //
        String stundeString = " ";
        String minuteString = " ";
        String neueAusgabe = "";
        
        if(stunde < 10){
            stundeString = "0" + stunde;
            //System.out.println(stundeString);
        }else{
            stundeString = ""+ stunde;
        }
        if(minute < 10){
            minuteString = "0" + minute;
            //System.out.println(minuteString);
        }else{
            minuteString = ""+ minute;
            //System.out.println(minuteString);
        }
        if (stunde < 12 & stunde > 0) {
            neueAusgabe = " a.m.";
        }
        if (stunde >= 12 & stunde < 24) {
            neueAusgabe = " p.m.";
        }
        if(!is24h){ 
            stundeString = ""+ this.stunde % 12;
            //stundeString.length(); - groeßer als 2 
            if((this.stunde % 12) < 10){
            stundeString = "0" + stundeString;
            }
            return stundeString + ":" + minuteString + neueAusgabe;
        }else{
        return stundeString + ":" + minuteString;
        }
    }
    
 
    
    public static void set12h24h(){ //allgemein für alle 
        is24h = !is24h;
    }
  
    //Hinweis
}
