package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final String URL = "jdbc:mysql://localhost:3306/my_db2";
    private final String USERNAME = "root";
    private final String PASSWORD = "Лшефкщ90ашпппф";

    Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public Util() {
        try  {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Соединение успешно установлено!");
        } catch (SQLException e) {
            System.out.println("Не удалось получить соединение с БД.");
            e.printStackTrace();
        }


    }
}
