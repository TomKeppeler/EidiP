package b11a4;

public class test {
    public static void main(String[] args) {
        Punkt2D m1 = new Punkt2D(-5,-3);
        Punkt2D m2 = new Punkt2D(0,0);
        RechteckXYPerMitteLaengen r1 = new RechteckXYPerMitteLaengen(m1,2,3);
        Figur f1 = r1;
        RechteckXYPerMitteLaengen r2 = new RechteckXYPerMitteLaengen(m2,600,800);
        Figur f2 = r2;
        Punkt2D p1 = new Punkt2D(-0.5,0);
        Punkt2D p2 = new Punkt2D(1,0);
        f1.istEnthalten(p1);
        System.out.println(f2.istEnthalten(p2));
    }
}
