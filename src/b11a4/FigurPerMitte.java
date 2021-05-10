package b11a4;

public class FigurPerMitte extends Figur {
    public Punkt2D mitte;
    public FigurPerMitte(Punkt2D mitte){
        this.mitte = mitte;
    }
    public FigurPerMitte(FigurPerMitte figurPerMitte){
        mitte = figurPerMitte.mitte;
    }
}
