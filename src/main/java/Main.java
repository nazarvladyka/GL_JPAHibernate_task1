import dao.Availability;
import models.Department;
import models.Workers;
import services.DepartmentService;

public class Main {
    public static void main(String[] args) {
        DepartmentService departmentService = new DepartmentService();
        Department department = new Department("Sun", true);
        departmentService.saveDepartment(department);
        Workers stepan = new Workers(26, Availability.FullTime, "Stepan Gorodniy");
        stepan.setDepartment(department);
        department.addWorker(stepan);
        Workers olya = new Workers(35, Availability.FullTime, "Olya Stepanova");
        olya.setDepartment(department);
        department.addWorker(olya);
        departmentService.updateDepartment(department);

//        UserService userService = new UserService();
//        User user = new User("Masha",26);
//        userService.saveUser(user);
//        Auto ferrari = new Auto("Ferrari", "red");
//        ferrari.setUser(user);
//        user.addAuto(ferrari);
//        Auto ford = new Auto("Ford", "black");
//        ford.setUser(user);
//        user.addAuto(ford);
//        userService.updateUser(user);
    }
}
