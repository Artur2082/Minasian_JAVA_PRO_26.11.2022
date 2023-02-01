package Working_With_Interfase_and_Abstract_Class_HT4.Figures;

public class Triangle implements Figure {
    private int sideA;
    private int height ;

    private static double squareTriangle ;

    public Triangle( int sideA, int height) {
       this.height = height ;
       this.sideA = sideA;

    }

    @Override
    public double square() {
        squareTriangle = 0.5 * sideA * height ;
        return squareTriangle;
    }
}
