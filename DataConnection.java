package dataconnection;
//import all library here
import java.sql.*;
public class DataConnection {

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://loclhost:3306/dts";
            //here jdbc is driver,mysql is for database, 3306 is port and dts is the database name
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection Successful");
        } catch (SQLException e) {
            System.out.println("Connection failed " + e);
        }
    }

}
