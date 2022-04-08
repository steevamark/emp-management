package Employeee;

import java.sql.*;

public class conn{
    itjworigj'j
    public Connection c;
    public Statement s;
 
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///Employee","root","Patrisha16");
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}