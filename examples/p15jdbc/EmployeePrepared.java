package p15jdbc;

import java.sql.*;

public class EmployeePrepared {

    public static void main(String[] args) {

        try {
            String connString = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "user1";
            String password = "user1";
            //DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection connection = DriverManager.getConnection(connString, user, password);
            connection.setAutoCommit(false);
            PreparedStatement statement = connection.prepareStatement(
                    "update employee set salary = ? where surname = ?");
            //PreparedStatement statement = connection.prepareStatement(
              //              "update employee set department_nr = ? where surname = ?");
            //statement.setString(1, "1000");
            statement.setInt(1, 7);
            statement.setString(2, "King");
            statement.executeUpdate();
            connection.commit();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
