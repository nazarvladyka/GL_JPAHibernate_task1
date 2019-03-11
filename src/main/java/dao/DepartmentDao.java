package dao;

import models.Department;
import models.Workers;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtils;

import java.util.List;

public class DepartmentDao {
    public Department findById(int id) {
        return HibernateUtils.getSessionFactory().openSession().get(Department.class, id);
    }

    public void save(Department department) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(department);
        tx1.commit();
        session.close();
    }

    public void update(Department department) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(department);
        tx1.commit();
        session.close();
    }

    public void delete(Department department) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(department);
        tx1.commit();
        session.close();
    }

    public Workers findWorkerById(int id) {
        return HibernateUtils.getSessionFactory().openSession().get(Workers.class, id);
    }

////    public List<Department> findAll() {
////        List<Department> departments = (List<Department>) HibernateUtils.getSessionFactory().openSession().createQuery("From Department").list();
////        return departments;
////    }
}
