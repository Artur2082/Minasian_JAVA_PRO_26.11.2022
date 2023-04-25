package T_DOA_Database_Requests_HT_27;

import java.sql.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LessonDao {
    private final DataBaseConnection dbc;
    private final static String SQL_QUERY = " select *, a.id as a_id, a.name as a_name, a.description as a_description " +
            "from dbtest.lesson as u join dbtest.homework as a on a.id = u.homework_id; ";
    private final static String INSERT_SQL = "insert into dbtest.lesson (name, updatedAt, homework_id) values (?, ?, ?)";
    private final static String DELETE_SQL = "delete from dbtest.lesson where id = ?";
    private final static String FIND_SQL = "select u. *, a.id as a_id, a.name as a_name, a.description as a_description " +
            "from dbtest.lesson as u join dbtest.homework as a on a.id = u.homework_id where u.id = ? ";

    public LessonDao(DataBaseConnection dbc) {
        this.dbc = dbc;
    }

    public void insertLesson(String name, Date date, int id) throws SQLException {
        try  {
            Connection connection = dbc.getConnection();
            try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL)) {
                preparedStatement.setString(1, name);
                preparedStatement.setDate(2, date);
                preparedStatement.setInt(3, id);
                int row = preparedStatement.executeUpdate();
                System.out.println(" added " + row + " row; ");
            }
        }finally {
            dbc.closeConnection();
        }
    }

    public void deleteById(Integer id) throws SQLException {
        try {
            Connection connection = dbc.getConnection();
            try (PreparedStatement preparedStatement = connection.prepareStatement(DELETE_SQL)) {
                preparedStatement.setInt(1, id);
                int row = preparedStatement.executeUpdate();
                System.out.println(" deleted " + row + " row; ");
            }
        }finally {
           dbc.closeConnection();
        }
    }

    public List<Lesson> showLesson() throws SQLException {
        List<Lesson> lessonList = new ArrayList<>();
        try (Statement statement = dbc.getConnection().createStatement()) {
            try (ResultSet rs = statement.executeQuery(SQL_QUERY)) {
                while (rs.next()) {
                    lessonList.add(extractLesson(rs));
                }
            }
        }
        return lessonList;
    }

    public Optional<Lesson> findById(Integer id) throws SQLException {
        System.out.println("Finding by id = " + id);
        try (Connection connection = dbc.getConnection()) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(FIND_SQL)) {
                preparedStatement.setInt(1, id);
                try (ResultSet rs = preparedStatement.executeQuery()) {
                    if (!rs.next()) {
                        return Optional.empty();
                    }
                    return Optional.of(extractLesson(rs));
                }
            }
        }
    }

    public Lesson extractLesson(ResultSet rs) throws SQLException {
        Lesson lesson = new Lesson();
        lesson.setId(rs.getInt("id"));
        lesson.setName(rs.getString("name"));
        Homework homework = new Homework();
        homework.setId(rs.getInt("a_id"));
        homework.setName(rs.getString("a_name"));
        homework.setDescription(rs.getString("a_description"));
        lesson.setHomework(homework);
        return lesson;
    }

    public static void main(String[] args) throws SQLException {
        DataBaseConnection baseConnection = new DataBaseConnection();
        LessonDao lessonDao = new LessonDao(baseConnection);
        lessonDao.insertLesson("drawing",  Date.valueOf(LocalDate.of(2022, 12, 25)),6);
        System.out.println(lessonDao.showLesson());
        lessonDao.deleteById(29);
        System.out.println(lessonDao.showLesson());
        System.out.println(lessonDao.findById(3));
    }
}
