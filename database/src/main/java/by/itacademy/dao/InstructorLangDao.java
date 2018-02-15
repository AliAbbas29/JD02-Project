package by.itacademy.dao;


import by.itacademy.entity.InstructorLang;

public class InstructorLangDao extends BaseDao<InstructorLang> {
    @Override
    protected Class<InstructorLang> getEntityClass() {
        return InstructorLang.class;
    }
}
