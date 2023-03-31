package jm.task.core.jdbc;


import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь


        Util.getConnection();
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();

        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("dima","Samoylenko", (byte) 30);
        userDaoJDBC.saveUser("andrey","Kuchorenko", (byte) 28);
        userDaoJDBC.saveUser("vladimir","Sochenko", (byte) 35);
        userDaoJDBC.saveUser("sveta","Komarova", (byte) 25);
        System.out.println(userDaoJDBC.getAllUsers().toString());
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();


    }
}
