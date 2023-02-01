package Working_With_Interfase_and_Abstract_Class_HT4.Barriers;

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
