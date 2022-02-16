package service;

import dao.UserDao;
import dto.UserDTO;
import entity.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserService {
    private final UserDao userDao = UserDao.getInstance();
    private static final UserService INSTANCE = new UserService();

    private UserService() {
    }

    public static UserService getInstance() {
        return INSTANCE;
    }

    public List<UserDTO> findAllUsers() {

        return userDao.findAll().stream()
                .map(user -> new UserDTO(
                        user.getFirstName(),
                        user.getLastName()
                ))
                .collect(Collectors.toList());
    }

    public UserDTO findUserByID(Integer id) {
        if (id != null) {
            User user = userDao.findById(id);
            return new UserDTO(user.getFirstName(), user.getLastName());
        }
        return null;
    }

    public UserDTO save() {
        User user = new User();
        user.setFirstName("Nick");
        user.setLastName("Nick");
        user.setEmail("nick@.com");

        userDao.save(user);

        return new UserDTO(user.getFirstName(), user.getLastName());
    }

    public void delete(Integer id) {
        userDao.delete(id);
    }

    public void update(Integer id) {
        User user = new User();
        user.setFirstName("Nick");
        user.setLastName("Nick");
        user.setEmail("nick@.com");

        userDao.update(id, user);
    }

}