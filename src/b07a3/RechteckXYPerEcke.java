package b07a3;

public class RechteckXYPerEcke {
    Punkt2D a, b;
    public RechteckXYPerEcke(double x1, double x2, double y1, double y2){
         a = new Punkt2D(x1, y1);
         b = new Punkt2D(x2, y2);
    }

    public RechteckXYPerEcke(Punkt2D a, Punkt2D b){
        this(a.x(), b.x(), a.y(), b.y());
    }

    public RechteckXYPerEcke(RechteckXYPerEcke rXYPE){
        this(rXYPE.a.x(), rXYPE.b.x(), rXYPE.a.y(), rXYPE.b.y());
    }

    public boolean equals(RechteckXYPerEcke rxyPE){
        if (this ==  rxyPE) return true;
        return a.x() == rxyPE.a.x()
                && a.y() == rxyPE.a.y()
                && b.x() == rxyPE.b.x()
                && b.y() == rxyPE.b.y();
    }

    public double breite(){
            return b.x() - a.x();
    }

    public double hoehe(){
            return b.y() - a.y();
    }

    public Punkt2D ecke(boolean istRechts, boolean istOben){
        if(!istRechts & !istOben){
            return new Punkt2D(a);
        }
        if(istRechts & istOben){
            return new Punkt2D(b);
        }
        if(!istRechts & istOben){
            return new Punkt2D(a.x(), b.y());
        }
        return new Punkt2D(b.x(), a.y());
    }

    public Punkt2D ecke(int a){
        if(a == 0){
            return new Punkt2D(this.a);
        }
        if(a == 2){
            return new Punkt2D(this.b);
        }
        if(a == 3){
            return new Punkt2D(this.a.x(), this.b.y());
        }
        if(a == 1) {
            return new Punkt2D(this.b.x(), this.a.y());
        }
        return null;
    }

    public Punkt2D mitte(){
        return new Punkt2D(b.x() / 2, b.y() / 2);
    }

    public double durchmesser(){
        return Math.sqrt(breite() * breite() + hoehe() * hoehe());
    }

    public double umfang(){
        return breite() * 2 + hoehe() * 2;
    }

    public double flaeche(){
        return breite() * hoehe();
    }

    public RechteckXYPerEcke verschiebe(double x, double y){
       return new RechteckXYPerEcke(this.a.x() + x, this.a.y() + y, this.b.x() + x, this.b.y() + y);
    }

    public String toString(){
        return "[" + a.toString() + "," + b.toString() + "]";
    }

    public static void main(String[] args) {
        RechteckXYPerEcke r1 = new RechteckXYPerEcke(new Punkt2D(1,4),new Punkt2D(3,2));
        RechteckXYPerEcke r2 = new RechteckXYPerEcke(r1);
        Punkt2D p1 = r2.ecke(false,false);
        System.out.println(p1.x());
        System.out.println(p1.y());
    }

}
