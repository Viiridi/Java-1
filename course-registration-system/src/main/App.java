package main;

import java.sql.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Connection connection = null;

        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: Could not load the database driver");
            System.exit(1);
        }

        try {
            connection = DriverManager.getConnection("jdbc:h2:./delegate_db");
        } catch (SQLException e) {
            System.out.println("ERROR: Could not connect to the database");
            System.exit(1);
        }

        try {
            Statement statement = connection.createStatement();
            statement.execute("create table if not exists delegates (" +
                    "id bigint auto_increment, " +
                    "name varchar(255), " +
                    "email varchar(255), " +
                    "company varchar(255), " +
                    "githubusername varchar(255))");
        } catch (SQLException e) {
            System.out.println("ERROR: Could not create delegate table");
            System.exit(1);
        }

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Register new delegate (1) or Search delegates (2): ");
            int option = input.nextInt();
            input.nextLine();
            if (option == 1) {
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Email: ");
                String email = input.nextLine();
                System.out.print("Company: ");
                String company = input.nextLine();
                System.out.print("GitHub username: ");
                String githubUsername = input.nextLine();
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(
                            "insert into delegates (name, email, company, githubusername) values (?, ?, ?, ?)"
                    );
                    preparedStatement.setString(1, name);
                    preparedStatement.setString(2, email);
                    preparedStatement.setString(3, company);
                    preparedStatement.setString(4, githubUsername);
                    preparedStatement.execute();
                } catch (SQLException e) {
                    System.out.println("ERROR: Could not add a delegate");
                }
            } else if (option == 2) {
                System.out.println("Name: ");
                String searchName = input.nextLine();
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(
                            "select * from delegates where name like ?"
                    );
                    preparedStatement.setString(1, "%" + searchName + "%");
                    ResultSet result = preparedStatement.executeQuery();
                    while (result.next()) {
                        long id = result.getLong(1);
                        String name = result.getString(2);
                        String email = result.getString(3);
                        String company = result.getString(4);
                        String githubUsername = result.getString(5);
                        System.out.printf("%s, %s, %s, %s, %s\n", id, name, email, company, githubUsername);
                    }
                } catch (SQLException e) {
                    System.out.println("ERROR: Could not query the delegate table");
                }
            } else {
                System.out.println("Invalid option");
            }
            System.out.println("More (Y/N)? ");
            String more = input.nextLine();
            if (more.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println();
        }
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("ERROR: Could not close the connection");
            System.exit(1);
        }
    }
}
