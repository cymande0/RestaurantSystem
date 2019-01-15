//package domain;
//
//import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
//import net.bytebuddy.dynamic.loading.InjectionClassLoader;
//
//import javax.persistence.*;
//
//
//
//@Entity
//public class Address {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    private String locality;
//    private String zipCode;
//    private String street;
//    private int streetNumber;
//
//    @OneToOne
//    @JoinColumn(name = "addressId")
//    private Employee employee;
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getLocality() {
//        return locality;
//    }
//
//    public void setLocality(String locality) {
//        this.locality = locality;
//    }
//
//    public String getZipCode() {
//        return zipCode;
//    }
//
//    public void setZipCode(String zipCode) {
//        this.zipCode = zipCode;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public int getStreetNumber() {
//        return streetNumber;
//    }
//
//    public void setStreetNumber(int streetNumber) {
//        this.streetNumber = streetNumber;
//    }
//
//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
//}
