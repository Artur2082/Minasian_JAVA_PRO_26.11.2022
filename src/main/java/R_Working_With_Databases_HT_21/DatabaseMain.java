package R_Working_With_Databases_HT_21;

import java.sql.*;

public class DatabaseMain {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/dbtest";
        String userName = "root";
        String password = "Velhjcnm0228";
        // Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            System.out.println("We are connected !");
            Statement statement = connection.createStatement();
           // statement.execute("insert into dbtest.product (name, price, shop_id) values (\"chocolate\", 45, 3)");
           // statement.executeUpdate("update dbtest.product set name = \"Kitkat\" where id_product = 7");
           // statement.addBatch("insert into dbtest.product (name, price, shop_id) values (\"onion\", 35, 1)");
           // statement.addBatch("insert into dbtest.product (name, price, shop_id) values (\"Sprite\", 55, 2)");
          //  statement.executeBatch();
          //  statement.clearBatch();
          ResultSet resSet =  statement.executeQuery("SELECT * FROM dbtest.product where shop_id = 3");
          while (resSet.next()){
              int id;
              String name;
              double price;
              int shop_id;
              id = resSet.getInt("id_product");
              name = resSet.getString("name");
              price = resSet.getDouble("price");
              shop_id = resSet.getInt("shop_id");
              Product product = new Product(id,name,price,shop_id);
              System.out.println(product);
          }
        }catch (SQLClientInfoException ex){
            ex.printStackTrace();
        }
    }
}
