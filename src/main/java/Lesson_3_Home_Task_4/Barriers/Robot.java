package Lesson_3_Home_Task_4.Barriers;

public class Robot extends Participant {
    private String name = "Robo";
    private int maxDistance = 200 ;
    private int maxHeight = 2 ;

    public Robot() {
        super.name = this.name;
        super.maxDistance = this.maxDistance;
        super.maxHeight = this.maxHeight;
        countObstacle++;
    }
}
