package R_Working_With_Databases_HT_21;

import java.time.LocalDate;

public class Lesson_Class {
    private int id;
    private String name;
    private LocalDate updatedAt;
    private int homeworkId;

    public Lesson_Class() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setHomeworkId(int homeworkId) {
        this.homeworkId = homeworkId;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", updatedAt=" + updatedAt +
                ", homeworkId=" + homeworkId +
                '}' + '\n';
    }
}
