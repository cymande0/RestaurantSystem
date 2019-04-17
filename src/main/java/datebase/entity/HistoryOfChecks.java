package datebase.entity;

import javax.persistence.*;

@Entity
public class HistoryOfChecks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="date")
    private java.sql.Date date;

    @Column(name="cost")
    private double cost;

}
