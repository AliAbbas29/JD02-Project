package by.itacademy.repository;

import by.itacademy.entity.Role;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface RoleRepository extends Repository<Role, Integer> {
    void save(Role role);

    void delete(Role role);

    Role findById(Integer id);

    List<Role> findAll();
}