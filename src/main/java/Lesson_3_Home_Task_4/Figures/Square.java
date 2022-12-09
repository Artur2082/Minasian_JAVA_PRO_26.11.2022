package Lesson_3_Home_Task_4.Figures;

import Lesson_3_Home_Task_4.Figures.Figure;

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
