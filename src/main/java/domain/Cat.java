//package domain;
//
//import javax.persistence.*;
//import java.security.acl.Owner;
//
//@Entity
//public class Cat {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    private String name;
//
//    @OneToOne(mappedBy = "cat")
//    private Owner owner;
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Owner getOwner() {
//        return owner;
//    }
//
//    public void setOwner(Owner owner) {
//        this.owner = owner;
//    }
//}
