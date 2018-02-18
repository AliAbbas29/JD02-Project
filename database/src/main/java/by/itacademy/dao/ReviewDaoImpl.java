package by.itacademy.dao;


import by.itacademy.entity.Review;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewDaoImpl extends BaseDaoImpl<Review> implements ReviewDao {
    @Override
    protected Class<Review> getEntityClass() {
        return Review.class;
    }
}
