package by.itacademy.dao;


import by.itacademy.entity.Review;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewDaoImpl extends BaseDaoImpl<Review> {
    @Override
    protected Class<Review> getEntityClass() {
        return Review.class;
    }
}
