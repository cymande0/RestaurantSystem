//package domain;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import java.sql.Date;
//import java.sql.Time;
//import java.sql.Timestamp;
//import java.util.Calendar;
//
//
//@Entity
//public class DataTime {
//
//    @Id
//    private long id;
//
//    private java.sql.Date date;
//    private java.sql.Time time;
//    private java.sql.Timestamp timeStamp;
//
//    @Temporal(TemporalType.TIME)
//    private java.util.Date utilDate;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private java.util.Date utilDate;
//
//    @Temporal(TemporalType.DATE)
//    private java.util.Date utilDate;
//
//    private java.util.Calendar calendar;
//
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    public Time getTime() {
//        return time;
//    }
//
//    public void setTime(Time time) {
//        this.time = time;
//    }
//
//    public Timestamp getTimeStamp() {
//        return timeStamp;
//    }
//
//    public void setTimeStamp(Timestamp timeStamp) {
//        this.timeStamp = timeStamp;
//    }
//
//
//}
