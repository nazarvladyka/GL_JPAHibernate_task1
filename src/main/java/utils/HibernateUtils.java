package utils;

import models.Department;
import models.Workers;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static SessionFactory sessionFactory;

    private HibernateUtils() {
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
//            try {
            Configuration configuration = new Configuration().configure();
            configuration.addAnnotatedClass(Department.class);
            configuration.addAnnotatedClass(Workers.class);
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory(builder.build());
//            } catch (Exception e) {
//                System.err.println("something wrong " + e);
//            }
        }
        return sessionFactory;
    }
}