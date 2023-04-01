package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    /*
    private static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/jdbc";
    private static final String DB_Login = "root";
    private static final String DB_Password = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_Driver).newInstance();
            connection=DriverManager.getConnection(DB_URL,DB_Login,DB_Password);
            //System.out.println("OK CONNECTION");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("ERROR CONNECTION");
        }

        return connection;
    }*/
    private static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/hibernatel";
    private static final String DB_Login = "root";
    private static final String DB_Password = "root";
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_Driver).newInstance();
            connection=DriverManager.getConnection(DB_URL,DB_Login,DB_Password);
            System.out.println("OK CONNECTION");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("ERROR CONNECTION");
        }

        return connection;
    }
}





