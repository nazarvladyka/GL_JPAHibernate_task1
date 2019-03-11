package services;

import dao.DepartmentDao;
import models.Department;
import models.Workers;

public class DepartmentService {
    private DepartmentDao departmentDao = new DepartmentDao();

    public DepartmentService() { }

    public Department findDepartment(int id) {
        return departmentDao.findById(id);
    }

    public void saveDepartment(Department department) {
        departmentDao.save(department);
    }

    public void deleteDepartment(Department department) {
        departmentDao.delete(department);
    }

    public void updateDepartment(Department department) {
        departmentDao.update(department);
    }

//    public List<Department> findAllDepartments() {
//        return departmentDao.findAll();
//    }

    public Workers findWorkerById(int id) {
        return departmentDao.findWorkerById(id);
    }
}