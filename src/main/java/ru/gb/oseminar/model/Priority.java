package ru.gb.oseminar.model;
import java.util.List;

public interface Priority {
    List<User> getAllUsers();
    String CreateUser(User user);
    void updateUser(User user);
    void deleteUser(String userID);
}