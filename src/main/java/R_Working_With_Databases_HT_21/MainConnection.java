package R_Working_With_Databases_HT_21;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MainConnection {
    public static void main(String[] args) throws SQLException {
        DataBaseConnection dbc = new DataBaseConnection();
        try {
            Statement statement = dbc.getConnection().createStatement();
            try (ResultSet resultSet = statement.executeQuery("SELECT * FROM dbtest.homework ")) {
                System.out.println("Homework :");
                System.out.println(showHomework(resultSet));
                try (ResultSet resultSet1 = statement.executeQuery("SELECT * FROM dbtest.lesson order by id desc")) {
                    System.out.println("Lesson :");
                    System.out.println(showLesson(resultSet1));
                }
            }
        } finally {
            dbc.closeConnection();
        }
    }

    private static List<Homework> showHomework(ResultSet rs) throws SQLException {
        List<Homework> homework = new ArrayList<>();
        while (rs.next()) {
            Homework hw = new Homework();
            hw.setId(rs.getInt("id"));
            hw.setDescription(rs.getString("description"));
            hw.setName(rs.getString("name"));
            homework.add(hw);
        }
        return homework;
    }

    private static List<Lesson> showLesson(ResultSet rs) throws SQLException {
        List<Lesson> lessonList = new ArrayList<>();
        while (rs.next()) {
            Lesson lesson = new Lesson();
            lesson.setId(rs.getInt("id"));
            lesson.setName(rs.getString("name"));
            lesson.setUpdatedAt(rs.getDate("updatedAt").toLocalDate());
            lesson.setHomeworkId(rs.getInt("homework_id"));
            lessonList.add(lesson);
        }
        return lessonList;
    }

}
