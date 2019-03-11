package services;

import dao.WorkersDao;
import models.Department;
import models.Workers;

import java.util.List;

public class WorkersService {
    private WorkersDao workersDao = new WorkersDao();

    public WorkersService() { }

    public Workers findWorker(int id) {
        return workersDao.findById(id);
    }

    public void saveWorker(Workers worker) {
        workersDao.save(worker);
    }

    public void deleteWorker(Workers worker) {
        workersDao.delete(worker);
    }

    public void updateWorker(Workers worker) {
        workersDao.update(worker);
    }

    public List<Workers> findAllWorkers() {
        return workersDao.findAll();
    }

    public Department findDepartmentById(int id) {
        return workersDao.findDepartmentById(id);
    }
}
