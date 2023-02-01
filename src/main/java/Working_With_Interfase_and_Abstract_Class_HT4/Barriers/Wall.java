package Working_With_Interfase_and_Abstract_Class_HT4.Barriers;

public class Wall implements Obstacles {
     private int height;

    public Wall(int height) {
        this.height = height;
    }
    @Override
    public void overcome(Participant participant) {
        if ( height > 0 && height <= participant.getMaxHeight()) {
            participant.jump();
        } else {
            System.out.println("Participant " + participant.getName() + " did not pass the obstacle wall, height passed " + participant.getMaxHeight() + " m;");
            participant.countObstacle = 0;
        }
    }
    public int getHeight() {
        return height;
    }
}
