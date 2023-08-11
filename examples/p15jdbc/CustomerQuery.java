package p15jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerQuery {

    public static void main(String[] args) {

        try {
            String connString = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "user1";
            String password = "user1";
            //DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection connection = DriverManager.getConnection(connString, user, password);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("select * from customer");
            while (result.next()) {
                System.out.println(result.getString("surname") + "\t" + result.getString("town"));
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
