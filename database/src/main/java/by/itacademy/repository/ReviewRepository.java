package by.itacademy.repository;


import by.itacademy.entity.Review;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ReviewRepository extends Repository<Review, Integer> {
    void save(Review review);

    void delete(Review review);

    Review findById(Integer id);

    List<Review> findAll();
}
