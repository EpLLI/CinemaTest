package testZ.cinema.config;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    public Connection() {
    }

    public java.sql.Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/Cinema";
        String login = "postgres";
        String password = "admin";
        java.sql.Connection con = DriverManager.getConnection(url, login, password);
        return con;
    }
}
