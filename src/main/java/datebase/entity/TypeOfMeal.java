package datebase.entity;

import datebase.entity.Meal;

import javax.persistence.*;

@Entity
@Table(name="Type of meal")
public class TypeOfMeal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="type_meal")
    private String typeOfMeal;

//    @ManyToOne
    @Column(name="meal")
    private Meal meal;

    public TypeOfMeal(){}

    public TypeOfMeal(String typeOfMeal, Meal meal){
        this.typeOfMeal = typeOfMeal;
        this.meal = meal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTypeOfMeal() {
        return typeOfMeal;
    }

    public void setTypeOfMeal(String typeOfMeal) {
        this.typeOfMeal = typeOfMeal;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

}
