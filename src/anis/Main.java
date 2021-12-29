package anis;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/pass";
        Connection con = DriverManager.getConnection(url,"root","");
        Statement st = con.createStatement();



        new Jpassdemo(con,st);
        Jpassdemo passframe = new Jpassdemo(con, st);
        passframe.setVisible(true);
        passframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        passframe.setTitle("Pass Here");
        passframe.setBounds(100,50,500,400);


    }
}
