package dao;

import entity.User;
import util.ConnectionManager;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements Dao<Integer, User> {
    private static final UserDao INSTANCE = new UserDao();
    private static final String FIND_ALL_USERS_QUERY = "select id, first_name, last_name, email, date_of_birth from users";
    private static final String FIND_BY_ID_QUERY = "select id, first_name, last_name, email, date_of_birth from users where id = ?";
    private static final String SAVE_USER_QUERY = "insert into users(first_name, last_name, email, date_of_birth) values(?, ?, ?, ?)";
    private static final String DELETE_USER_QUERY = "delete from users where id = ?";
    private static final String UPDATE_USER_QUERY = "update users(first_name, last_name, email, date_of_birth) values(?, ?, ?, ?) where id=?";

    private UserDao() {
    }

    public static UserDao getInstance() {
        return INSTANCE;
    }

    @Override
    public User save(User entity) {
        try (Connection connection = ConnectionManager.get()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE_USER_QUERY);
            preparedStatement.setString(1, entity.getFirstName());
            preparedStatement.setString(2, entity.getLastName());
            preparedStatement.setString(3, entity.getEmail());
            preparedStatement.setDate(4, new Date(System.currentTimeMillis()));

            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public User findById(Integer id) {
        User user = new User();
        try (Connection connection = ConnectionManager.get()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID_QUERY);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user = mapUser(resultSet);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try (Connection connection = ConnectionManager.get()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_USERS_QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                users.add(mapUser(resultSet));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public boolean update(Integer id, User entity) {
        try (Connection connection = ConnectionManager.get()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER_QUERY);
            preparedStatement.setString(1, entity.getFirstName());
            preparedStatement.setString(2, entity.getLastName());
            preparedStatement.setString(3, entity.getEmail());
            preparedStatement.setDate(4, new Date(System.currentTimeMillis()));
            preparedStatement.setInt(5, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean delete(Integer id) {
        try (Connection connection = ConnectionManager.get()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER_QUERY);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    private User mapUser(ResultSet resultSet) {
        try {
            return new User(
                    resultSet.getObject("id", Integer.class),
                    resultSet.getObject("first_name", String.class),
                    resultSet.getObject("last_name", String.class),
                    resultSet.getObject("email", String.class),
                    resultSet.getObject("date_of_birth", LocalDate.class)
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}