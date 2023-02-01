package C_Working_With_Interfase_and_Abstract_Class_HT4.Figures;

public class Square implements Figure {
    private int side;
    private static double squareSquare ;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double square() {
        squareSquare = Math.pow(side, 2);
        return squareSquare;
    }
}
