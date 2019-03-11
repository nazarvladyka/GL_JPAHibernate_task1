package models;

import dao.Availability;

import javax.persistence.*;

@Entity
@Table(name = "Workers")
public class Workers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "age")
    private int age;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "availability")
    private Availability availability;
    @Column(name = "full_name")
    private String fullName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    public Workers() { }

    public Workers(int age, Availability availability, String fullName) {
        this.age = age;
        this.availability = availability;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return id + " " + age + " " + availability + " " + fullName;
    }
}