package db;

import java.sql.*;

public class TestingDBConnection {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
           // DatabaseMetaData DriverManager = null;
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/java35", "root", "Amanvienalga10");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            while (rs.next()){
                System.out.printf("ID %d username:  %s password: %s full name: %s email: %s \n",
                        rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
            }
            con.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
