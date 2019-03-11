package dao;

import models.Department;
import models.Workers;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtils;

import java.util.List;

public class WorkersDao {
    public Workers findById(int id) {
        return HibernateUtils.getSessionFactory().openSession().get(Workers.class, id);
    }

    public void save(Workers worker) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(worker);
        tx1.commit();
        session.close();
    }

    public void update(Workers worker) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(worker);
        tx1.commit();
        session.close();
    }

    public void delete(Workers worker) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(worker);
        tx1.commit();
        session.close();
    }

    public Department findDepartmentById(int id) {
        return HibernateUtils.getSessionFactory().openSession().get(Department.class, id);
    }

//    public List<Workers> findAll() {
//        List<Workers> workers = (List<Workers>) HibernateUtils.getSessionFactory().openSession().createQuery("From Workers").list();
//        return workers;
//    }
}
