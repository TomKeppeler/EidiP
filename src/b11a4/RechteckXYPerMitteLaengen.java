package b11a4;

public class RechteckXYPerMitteLaengen extends FigurPerMitte{
    private double breite, hoehe;
    private Punkt2D mitte; //nicht gefordert!
    public RechteckXYPerMitteLaengen(Punkt2D mitte, double breite, double hoehe) {
        super(mitte);
        this.breite = breite;
        this.hoehe = hoehe;
        this.mitte = mitte;
    }

    public Punkt2D mitte(){
        return mitte;
    }
    public RechteckXYPerMitteLaengen(RechteckXYPerMitteLaengen r){
        this(r.mitte, r.breite, r.hoehe);
    }

    public double breite() {
        return breite;
    }

    public double hoehe() {
        return hoehe;
    }

    public Punkt2D ecke(boolean istRechts, boolean istOben){
        if(!istRechts & !istOben){
            return new Punkt2D(mitte.x()-(breite/2), mitte.y()-(hoehe/2));
        }
        if(istRechts & istOben){
            return new Punkt2D(mitte.x()+(breite/2), mitte.y()+(hoehe/2));
        }
        if(!istRechts & istOben){
            return new Punkt2D(mitte.x()-(breite/2), mitte.y()+(hoehe/2));
        }
        return new Punkt2D(mitte.x()+(breite/2), mitte.y()-(hoehe/2));
    }

    public boolean equals(RechteckXYPerMitteLaengen r){
        double ax = mitte.x();
        double ay = mitte.y();
        double bx = r.mitte.x();
        double by = r.mitte.y();
        if(!Mathe.equals(this.breite, r.breite)){
            return false;
        }
        if(!Mathe.equals(this.hoehe, r.hoehe)){
            return false;
        }
        if(!Mathe.equals(ax, bx)){
            return false;
        }
        if(!Mathe.equals(ay, by)){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "[" + ecke(false, false).toString() + "," + ecke(true, true) + "]";
    }
}
