package Working_With_Interfase_and_Abstract_Class_HT4.Barriers;

public class Human extends Participant{
private String name = "Bob";
private int maxDistance = 800;
private int maxHeight = 3 ;

    public Human() {
        super.name = this.name;
        super.maxDistance = this.maxDistance;
        super.maxHeight = this.maxHeight;
        countObstacle++;
    }
}
