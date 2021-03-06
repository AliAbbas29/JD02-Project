package by.itacademy.dao;


import by.itacademy.entity.InstructorProg;
import org.springframework.stereotype.Repository;

@Repository
public class InstructorProgDaoImpl extends BaseDaoImpl<InstructorProg> implements InstructorProgDao {
    @Override
    protected Class<InstructorProg> getEntityClass() {
        return InstructorProg.class;
    }
}
