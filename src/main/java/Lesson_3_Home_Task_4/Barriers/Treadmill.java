package Lesson_3_Home_Task_4.Barriers;

public class Treadmill implements Obstacles {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }
    @Override
    public void overcome(Participant participant) {
        if (distance > 0 && distance <= participant.getMaxDistance()) {
            participant.run();
        } else {
            System.out.println("Participant " + participant.getName() + " did not pass the obstacle treadmill, distance passed " + participant.maxDistance + " m;");
            participant.countObstacle = 0;
        }
    }
    public int getDistance() {
        return distance;
    }
}
