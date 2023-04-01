package jm.task.core.jdbc.dao;

import com.mysql.cj.Query;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDaoHibernateImpl implements UserDao {
    public UserDaoHibernateImpl() {

    }


    @Override
    public void createUsersTable() {
        Util.getConnection();
        SessionFactory sessionFactory = null;
        try {
            Configuration configuration = new Configuration().addAnnotatedClass(User.class);
            sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            Transaction transaction = session.beginTransaction();
            String sql = "CREATE TABLE if not exists `hibernatel`.`user` (\n" +
                    "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
                    "  `name` VARCHAR(45) NOT NULL,\n" +
                    "  `lastName` VARCHAR(45) NOT NULL,\n" +
                    "  `age` INT(3) NOT NULL,\n" +
                    "  PRIMARY KEY (`id`));";

            session.createSQLQuery(sql).addEntity(User.class).executeUpdate();
            transaction.commit();
        } finally {
            sessionFactory.close();
        }
    }

    @Override
    public void dropUsersTable() {
        Util.getConnection();
        SessionFactory sessionFactory = null;
        try {
            Configuration configuration = new Configuration().addAnnotatedClass(User.class);
            sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            Transaction transaction = session.beginTransaction();
            String hql = "DROP TABLE if exists user;";

            session.createSQLQuery(hql).addEntity(User.class).executeUpdate();
            transaction.commit();
        } finally {
            sessionFactory.close();
        }
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        Util.getConnection();
        SessionFactory sessionFactory = null;
        try {
            Configuration configuration = new Configuration().addAnnotatedClass(User.class);
            sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            Transaction transaction = session.beginTransaction();

            session.save(new User(name,lastName, age));
            transaction.commit();
        } finally {
            sessionFactory.close();
        }
    }

    @Override
    public void removeUserById(long id) {
        Util.getConnection();
        SessionFactory sessionFactory = null;
        try {
            Configuration configuration = new Configuration().addAnnotatedClass(User.class);
            sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            Transaction transaction = session.beginTransaction();

            String hql = "DELETE FROM user WHERE id = :id";
            session.createSQLQuery(hql).addEntity(User.class).setParameter("id", id).executeUpdate();


            transaction.commit();
        } finally {
            sessionFactory.close();
        }
    }

    @Override
    public List<User> getAllUsers() {
        Util.getConnection();
        List users;

        SessionFactory sessionFactory = null;
        try {
            Configuration configuration = new Configuration().addAnnotatedClass(User.class);
            sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            String hql = "SELECT * FROM hibernatel.user";
            Transaction transaction = session.beginTransaction();
            users = session.createSQLQuery(hql).addEntity(User.class).list();
            transaction.commit();
        }  finally {
            sessionFactory.close();
        }
        return users;
    }

    @Override
    public void cleanUsersTable() {
        Util.getConnection();
        SessionFactory sessionFactory = null;
        try {
            Configuration configuration = new Configuration().addAnnotatedClass(User.class);
            sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            String hql = "DELETE FROM USER";
            Transaction transaction = session.beginTransaction();
            session.createSQLQuery(hql).addEntity(User.class).executeUpdate();
            transaction.commit();
        }  finally {
            sessionFactory.close();
        }
    }
}
