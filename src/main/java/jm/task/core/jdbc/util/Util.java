package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Task2",
                    "root", "springcourse");
            connection.setAutoCommit(false);
            return connection;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
