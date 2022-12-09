package Lesson_3_Home_Task_4.Figures;

import Lesson_3_Home_Task_4.Figures.Figure;

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
