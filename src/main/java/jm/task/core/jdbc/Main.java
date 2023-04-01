package jm.task.core.jdbc;


import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь



// JDBC
        /*UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("dima","Samoylenko", (byte) 30);
        userDaoJDBC.saveUser("andrey","Kuchorenko", (byte) 28);
        userDaoJDBC.saveUser("vladimir","Sochenko", (byte) 35);
        userDaoJDBC.saveUser("sveta","Komarova", (byte) 25);
        System.out.println(userDaoJDBC.getAllUsers().toString());
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();*/


// Hibernate
        UserDaoHibernateImpl userDaoHibernate=new UserDaoHibernateImpl();
        userDaoHibernate.createUsersTable();
        userDaoHibernate.saveUser("Alena","Krovet", (byte) 24);
        userDaoHibernate.saveUser("Timur","Kungur", (byte) 32);
        userDaoHibernate.saveUser("Lecha","Popov", (byte) 27);
        userDaoHibernate.saveUser("Sasha","Boll", (byte) 34);
        System.out.println(userDaoHibernate.getAllUsers().toString());
        userDaoHibernate.cleanUsersTable();
        userDaoHibernate.dropUsersTable();

    }
}
