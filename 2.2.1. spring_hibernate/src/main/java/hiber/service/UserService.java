package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import javax.persistence.Query;
import java.util.List;

public interface UserService {
    void add(User user);
    List<User> getUserCar(String model, int series);
    List<User> listUsers();
}
