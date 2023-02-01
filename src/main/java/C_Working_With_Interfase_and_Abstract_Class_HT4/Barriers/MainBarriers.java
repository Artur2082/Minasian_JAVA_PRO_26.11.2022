package C_Working_With_Interfase_and_Abstract_Class_HT4.Barriers;

public class MainBarriers {
    public static void main(String[] args) {
        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();
        Participant[] participants = new Participant[3];
        participants[0] = human;
        participants[1] = cat;
        participants[2] = robot;

        Treadmill treadmill = new Treadmill(800);
        Wall wall = new Wall(1);
        Obstacles[] obstacles = new Obstacles[2];
        obstacles[0] = treadmill;
        obstacles[1] = wall;

        System.out.println(" Run treadmill on distance " + treadmill.getDistance() + " m;");
        System.out.println(" Jump the wall height " + wall.getHeight() + " m;");
        System.out.println("----------------------------");

        for (int j = 0; j < participants.length; j++) {
            for (int i = 0; i < obstacles.length; i++) {
            }
            treadmill.overcome(participants[j]);
            if(participants[j].getCountObstacle() != 0){
                wall.overcome(participants[j]);
            }
        }
    }
}
