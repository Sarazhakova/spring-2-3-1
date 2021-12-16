package service;

import model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void removeUser(int id);
    List<User> getAllUsers();
    void update(User user);
    User getUserById(long id);
}
