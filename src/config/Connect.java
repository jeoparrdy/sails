package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    Connection connection;
    String url ="jdbc:mysql://localhost:/bd_sails";
    String user = "root";
    String pass = "P@ssw0rd_123";
    public Connection Connect() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (Exception e){

        }

        return connection;
    }
}
