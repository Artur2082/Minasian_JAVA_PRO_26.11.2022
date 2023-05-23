package W_Patterns.factory;

public class FactoryFurn {
    public Furn furniture(String type) {
        if (type == null || type.isEmpty())
            return null;
        switch (type) {
            case "bed":
                return new Bed();
            case "table":
                return new Table();
            default:
                throw new IllegalArgumentException("Unknown type - " + type);
        }
    }
}
