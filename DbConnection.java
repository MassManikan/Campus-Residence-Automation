package Hostel;
import java.util.Scanner;
import java.sql.*;
public class DbConnection {
    private static final String url = "jdbc:mysql://localhost:3306/hostel";
    private static final String userName = "root";
    private static final String passWord = "1234";

    public static Connection getConnection() throws SQLException{
        return  DriverManager.getConnection(url,userName,passWord);
    }

}
