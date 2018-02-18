package by.itacademy.dao;


import by.itacademy.entity.InstructorLang;
import org.springframework.stereotype.Repository;

@Repository
public class InstructorLangDaoImpl extends BaseDaoImpl<InstructorLang> implements InstructorLangDao {
    @Override
    protected Class<InstructorLang> getEntityClass() {
        return InstructorLang.class;
    }
}
