package by.itacademy.dao;


import by.itacademy.entity.Review;

public class ReviewDao extends BaseDao<Review> {
    @Override
    protected Class<Review> getEntityClass() {
        return Review.class;
    }
}
