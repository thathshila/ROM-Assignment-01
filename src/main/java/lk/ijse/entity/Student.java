package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lk.ijse.embed.FullName;

@Entity//(name = "OOP&Mysql")
//@Table(name = "OOP&Mysql")
public class Student {
    @Id
    private int id;
    private FullName fullName;
    private String address;

    public Student(int id, FullName fullName, String address) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
    }
    public Student(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(FullName fullName) {
    }
}
