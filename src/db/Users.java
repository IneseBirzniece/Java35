package db;

import java.sql.*;
import java.util.Scanner;

public class Users {
    public static void main(String[] args) {
        //to connect with db
        String dbURL = "jdbc:mysql://localhost:3306/java35";
        String username = "root";
        String password = "Amanvienalga10";
        Scanner scanner = new Scanner(System.in);
        char again = 'y';

        try (Connection conn = DriverManager.getConnection(dbURL, username, password)){ //to crate connection type object

            System.out.println("connected to database");

            while (again == 'y'){ // to interact with user
                System.out.println("Choose one option (r,i,d)");
                System.out.println("r - reading data");
                System.out.println("i - inserting data");
                System.out.println("d - deleting data");

                char action = scanner.nextLine().charAt(0);

                //read data
                //insert data
                //delete data
                // interaction to get specific information

                if (action == 'i'){
                    System.out.println("Enter username");
                    String newUserName = scanner.nextLine();

                    System.out.println("Enter password");
                    String newPassword = scanner.nextLine();

                    System.out.println("Enter full name");
                    String newFullName = scanner.nextLine();

                    System.out.println("Enter your email");
                    String newEmail = scanner.nextLine();

                    //to call method for data input
                    insertData(conn, newUserName, newPassword, newFullName, newEmail);

                } else if (action == 'r') {
                    //to call method for reading data
                    readData(conn);

                } else if (action == 'd') {
                    System.out.println("Enter username you want to delete");
                    String deleteUser = scanner.nextLine();

                    //to call method for deleting data
                    deleteData(conn, deleteUser);

                }else {
                    System.out.println("Invalid input");
                }

                System.out.println("Do you want to do something more? y/n");
                again = scanner.nextLine().charAt(0);

            }
        }catch (Exception e){
            System.out.println(e);
        }


    }

    //we will use conn object, because we need connection to db
    public static void readData(Connection conn) throws SQLException {
        //we will interact with data
        //have to catch any problems - throws

        String sql = "select * from users";
        Statement statement = conn.createStatement(); //creates new page where to write
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            String userName = resultSet.getString(2);
            String password = resultSet.getString(3);
            String fullName = resultSet.getString("fullName"); //to find colon by name
            String email = resultSet.getString("email");

            String output = "User: %s - %s - %s - %s";
            System.out.println(String.format(output, userName, password, fullName, email));

        }


    }

    public static void insertData(Connection conn, String username, String password, String fullName, String email) throws SQLException {
        String sql = "insert into users(username, password, fullname, email) values (?, ?, ?, ?)"; //each ? will be replaced by values from method input
        PreparedStatement preparedStatement = conn.prepareStatement(sql); //creates new page where to write
        preparedStatement.setString(1, username); //replaces 1. ? with username
        preparedStatement.setString(2, password);
        preparedStatement.setString(3, fullName);
        preparedStatement.setString(4, email);

        int rowInserted = preparedStatement.executeUpdate();
        if (rowInserted > 0){
            System.out.println("A new user was added successfully");
        }else {
            System.out.println("something went wrong");
        }
    }

    public static void deleteData(Connection conn, String username) throws SQLException{
        String sql = "delete from users where username = ?"; // ? will be replaced by values from method input
        PreparedStatement preparedStatement = conn.prepareStatement(sql); //creates new page where to write
        preparedStatement.setString(1, username); //replaces 1. ? with username

        if (preparedStatement.executeUpdate() > 0){
            System.out.println("User was deleted successfully");
        }else {
            System.out.println("Something went wrong");
        }

    }



}
