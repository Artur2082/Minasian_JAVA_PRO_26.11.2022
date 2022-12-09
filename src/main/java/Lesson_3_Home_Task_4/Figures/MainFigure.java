package Lesson_3_Home_Task_4.Figures;

public class MainFigure {
    public static void main(String[] args) {
        double sum = 0.0;
        Figure[] figures = new Figure[3];
        figures[0] = new Triangle(12, 8);
        figures [1] = new Circle(3);
        figures [2] = new Square(9);

        for (int i = 0; i < figures.length ; i++) {
            sum += figures[i].square();
        }
        System.out.println("Square of triangle is - " + figures[0].square());
        System.out.println("Square of circle is - " + figures[1].square());
        System.out.println("Square of Square is - " + figures[2].square());
        System.out.println("Total square = " + sum);
    }
}

