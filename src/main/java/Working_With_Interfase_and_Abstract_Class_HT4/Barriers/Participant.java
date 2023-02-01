package Working_With_Interfase_and_Abstract_Class_HT4.Barriers;

public abstract class Participant {
    protected String name;
    protected int maxDistance;
    protected int maxHeight;
    protected int countObstacle;

    int getCountObstacle() {
        return countObstacle;
    }

    void run(){
         System.out.println("Participant " + name + " - run on treadmill given distance;");
     }
    void jump(){
        System.out.println("Participant " + name + " - jumped wall given height; ");
    }

    public String getName() {
        return name;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public int getMaxHeight() {
        return maxHeight;
    }
}
