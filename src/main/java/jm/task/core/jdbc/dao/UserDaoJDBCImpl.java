package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {

    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() throws SQLException {
       /* Connection connection=Util.getConnection();
        PreparedStatement preparedStatement = null;

        String sql = "CREATE TABLE if not exists `jdbc`.`user` (\n" +
                "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
                "  `name` VARCHAR(45) NOT NULL,\n" +
                "  `lastName` VARCHAR(45) NOT NULL,\n" +
                "  `age` INT(3) NOT NULL,\n" +
                "  PRIMARY KEY (`id`));";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }

        }*/

    }
    public void dropUsersTable() throws SQLException {
        /*Connection connection=Util.getConnection();
        PreparedStatement preparedStatement = null;

        String sql = "DROP TABLE if exists user;";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }

        }*/
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        /*Connection connection=Util.getConnection();
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO USER (name, lastName, age) VALUES (?, ?, ?)";
        try {
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2,lastName);
            preparedStatement.setLong(3,age);
            preparedStatement.executeUpdate();
            System.out.println("User с именем – " + name + " добавлен в базу данных");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }*/
    }

    public void removeUserById(long id) throws SQLException {
       /* Connection connection=Util.getConnection();
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM USER WHERE id=?";

        try {
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }*/
    }

    public List<User> getAllUsers() throws SQLException {
      /*  Connection connection=Util.getConnection();
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM jdbc.user";
        Statement statement = null;
        try {
            statement= connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getLong("id"));
                user.setName(resultSet.getString("name"));
                user.setLastName(resultSet.getString("lastName"));
                user.setAge((byte) resultSet.getLong("age"));

                users.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

        return users;
        */
       return null;
    }

    public void cleanUsersTable() throws SQLException {
       /* Connection connection=Util.getConnection();
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM USER";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }

        }*/

    }
}
