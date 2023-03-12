package R_Working_With_Databases_HT_21;

public class Homework {
    private int id;
    private String description;
    private String name;

    public Homework() {
    }

    @Override
    public String toString() {
        return "Homework{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}' + '\n';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
}
