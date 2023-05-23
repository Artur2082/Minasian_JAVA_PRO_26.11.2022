package W_Patterns.builder.carComponents;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "route - Dnipro city";
    }

    public GPSNavigator(String destination) {
        this.route = destination;
    }

    public String getRoute() {
        return route;
    }
}
