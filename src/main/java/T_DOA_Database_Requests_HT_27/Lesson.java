package T_DOA_Database_Requests_HT_27;

public class Lesson {
    private int id;
    private String name;

    private Homework homework;

    public Lesson() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setHomework(Homework homework) {
        this.homework = homework;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", homework=" + homework +
                '}' + '\n';
    }
}
