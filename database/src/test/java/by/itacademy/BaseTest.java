package by.itacademy;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTest {
    protected static SessionFactory sessionFactory;

    @BeforeClass
    public static void beforeClass() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    @AfterClass
    public static void afterClass() {
     sessionFactory.close();
    }
}
