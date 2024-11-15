package entities;

import entities.enums.ex7_1_4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ex7_1_1 {
    private String name;
    private ex7_1_4 level;
    private Double baseSalary;

    private ex7_1_3 department;
    private List<ex7_1_2> contracts = new ArrayList<>();

    public ex7_1_1(){

    }

    public ex7_1_1(String name, ex7_1_4 level, Double baseSalary, ex7_1_3 department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ex7_1_4 getLevel() {
        return level;
    }

    public void setLevel(ex7_1_4 level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public ex7_1_3 getDepartment() {
        return department;
    }

    public void setDepartment(ex7_1_3 department) {
        this.department = department;
    }

    public List<ex7_1_2> getContracts() {
        return contracts;
    }

    public void addContract(ex7_1_2 contract){
        contracts.add(contract);
    }

    public void removeContract(ex7_1_2 contract){
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (ex7_1_2 c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = cal.get(Calendar.MONTH);
            if(year == c_year && month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }

}


