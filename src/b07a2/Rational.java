package b07a2;

public class Rational{
    private int zaehler, nenner;

    public Rational(int z, int n) throws ArithmeticException{
        if(n == 0){
            throw new ArithmeticException("Nenner ist Null");
        }

        int teiler = Mathe.ggT(z, n);
        if (n < 0){
            z *= -1;
            n *= -1;
        }
        this.zaehler = z/teiler;
        this.nenner = n/teiler;
    }

    public Rational(){
        this(0,1);
    }
    public Rational(int z){
        this(z,1);
    }
    public Rational(Rational r){
        this(r.zaehler, r.nenner);
    }

    public int zaehler(){
        return this.zaehler;
    }

    public int nenner(){
        return this.nenner;
    }

    public boolean equals(Rational r) {
        if (this == r) return true;
        if (r == null || getClass() != r.getClass()) return false;
        return this.zaehler == r.zaehler &&
                this.nenner == r.nenner;
    }

    public boolean istKleiner(Rational r){
        if((this.nenner * r.zaehler) > (r.nenner * this.zaehler)){
            return true;
        }
        return false;
    }

    public Rational abs(){
        int n = this.nenner;
        int z = this.zaehler;
        if (n < 0) {
            n *= -1;
        }
        if (z < 0){
            z *= -1;
        }
        return new Rational(z, n);
    }

    public Rational rez(){
        int n = this.nenner;
        int z = this.zaehler;
        if (z < 0){
            z *= -1;
            n *= -1;
        }
        if(z == 0){
            return null;
        }
        return new Rational(n, z);
    }

    public Rational add(Rational r){
        return new Rational((this.nenner * r.zaehler) + (r.nenner * this.zaehler),this.nenner * r.nenner);
    }

    public Rational sub(Rational r){
        return new Rational((r.nenner * this.zaehler) - (this.nenner * r.zaehler) ,this.nenner * r.nenner);
    }

    public Rational mul(Rational r){
        return new Rational(this.zaehler * r.zaehler, this.nenner * r.nenner);
    }

    public Rational div(Rational r){
        return new Rational(this.zaehler * r.nenner, this.nenner * r.zaehler);
    }

    public String toString() {
        return this.zaehler + "/" + this.nenner;
    }

    public static Rational parse(String r){
        if(!r.contains("/") | r.length() == 0){
            throw new IllegalArgumentException("Falsches Format");
        }
        if(r.contains("/") & r.length()==1){
            throw new IllegalArgumentException("Falsches Format");
        }
        int slash= r.indexOf("/");
        String zaehler = r.substring(0, slash);
        String nenner = r.substring(slash+1);
        int z = Integer.parseInt(zaehler);
        int n = Integer.parseInt(nenner);
        return new Rational(z, n);
    }

    public static Rational auswertung(Rational a, char op, Rational b) throws IllegalArgumentException, ArithmeticException {
        if(a.nenner==0 | b.nenner == 0){
            throw new ArithmeticException("Nenner ist Null");
        }
        switch (op){
            case '+':
                return a.add(b);
            case '-':
                return a.sub(b);
            case '*':
                return a.mul(b);
            case '/':
                return a.div(b);
            default:
               throw new IllegalArgumentException("Falscher op");
        }
    }
    public static void main(String[] args) {
        try{
            parse("/");
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
