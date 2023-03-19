package T_DOA_Database_Requests_HT_27;

public class Homework {
    private int id;
    private String name;
    private String description;


    public Homework () {
    }


    @Override
    public String toString() {
        return "Homework{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
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
