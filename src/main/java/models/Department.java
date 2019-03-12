package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private boolean status;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Workers> workers;

    public Department() { }

    public Department(String name, boolean status) {
        this.name = name;
        this.status = status;
        workers = new ArrayList<>();
    }

    public void addWorker(Workers worker) {
        worker.setDepartmentId(this);
        workers.add(worker);
    }

    public void removeWorker(Workers worker) {
        workers.remove(worker);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "models.Department{" +
                "id = " + id +
                ", name = '" + name + "\'" +
                ", status = " + status +
                " }";
    }
}