package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    Connection connection;
    String url ="jdbc:mysql://localhost:3306/bd_sales?useUnicode=true&serverTimezone=UTC&useSSL=false";
    String user = "root";
    String pass = "P@ssw0rd_123";
    public Connection Connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (Exception e){
            e.printStackTrace();
        }


        return connection;
    }
}
