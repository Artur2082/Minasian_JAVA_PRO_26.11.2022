package Lesson_3_Home_Task_4.Barriers;

public class Cat extends Participant {
    private String name = "Maks";
    private int maxDistance = 400;
    private int maxHeight = 5;

    public Cat() {
        super.name = this.name;
        super.maxDistance = this.maxDistance;
        super.maxHeight = this.maxHeight;
        countObstacle++;
    }
}
