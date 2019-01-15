package domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private  long id;

    private String firstName;
    private String lastName;
    private double salary;

    @OneToMany(mappedBy = "employee")
    private List<Phone> phones;

//    @OneToOne
//    @JoinColumn(name = "addressId")
//    private Address address;

//    @Embedded
//    private Address address;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    //    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }



}
