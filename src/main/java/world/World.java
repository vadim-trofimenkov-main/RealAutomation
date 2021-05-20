package world;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class World {
    public static Connection createConnection() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        String url = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "qwerty12345";
      //  Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        Connection connection = createConnection();
        Statement statement = connection.createStatement();

        String query = "SELECT * FROM world.city limit 10;";
        ResultSet cities = statement.executeQuery(query);

        System.out.println("Список городов:");
        while (cities.next()) {
            System.out.println(cities.getString(1) + " - " + cities.getString(2) + " - " + cities.getString(3) + " - " + cities.getString(4) + " - " + cities.getString(5));
        }

        System.out.println(connection.getCatalog());
        System.out.println(connection.isValid(1000));
        System.out.println(connection.isClosed());
        System.out.println(connection.getClass());
        connection.close();
    }
}
