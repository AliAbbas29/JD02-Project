package by.itacademy.repository;

import by.itacademy.entity.User;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository<User, Integer> {
    void save(User user);

    void delete(User user);

    User findById(Integer id);

    User findByName(String name);

    List<User> findAll();
}
