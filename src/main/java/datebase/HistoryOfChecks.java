package datebase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HistoryOfChecks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private java.sql.Date date;
    private double cost;

    //Dodanie nowej zmiennej - unikalnego id
    


}
