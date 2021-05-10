package b11a4;
public class Figur {
    private Punkt2D a, b;

    public Figur(){
        a = new Punkt2D();
        b = new Punkt2D();
    }
    public Figur(Figur f){
        a = f.a;
        b = f.b;
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

    public double breite(){
        return b.x() - a.x();
    }

    public double hoehe(){
        return b.y() - a.y();
    }
    public boolean istEnthalten(Punkt2D punkt2D){

        System.out.println("px: " + punkt2D.x());
        System.out.println("py: " + punkt2D.y());
        System.out.println("ax: " + a.x());
        System.out.println("ay: " + a.y());
        System.out.println("bx: " + b.x());
        System.out.println("by: " + b.y());
        return punkt2D.x() >= a.x() & punkt2D.y() <= b.y()
                & punkt2D.x() <= b.x() & punkt2D.y() >= b.y();
    }
    public Figur verschiebe(double dx, double dy){
        a.verschiebe(dx, dy);
        b.verschiebe(dx, dy);
        return new Figur(this);
    }
    public String toString(){
        return "[" + a.toString() + b.toString() + "]";
    }
    public boolean equals(Figur f){
        return a.x() == f.a.x()
                && a.y() == f.a.y()
                && b.x() == f.b.x()
                && b.y() == f.b.y();
    }
}
