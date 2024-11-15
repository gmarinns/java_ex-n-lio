package entities;

import java.util.Date;

public class ex7_1_2 {

    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public ex7_1_2() {

    }

    public ex7_1_2(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double totalValue(){
        return valuePerHour * hours;
    }
}
