package com.fxlearning.sm.fristjavafxapp;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee {
    private StringProperty name;
    private IntegerProperty salary;
    public Employee(String name, int salary){
        this.name = new SimpleStringProperty(name);
        this.salary = new SimpleIntegerProperty(salary);
    }

    public int getSalary() {
        return salary.get();
    }

    public IntegerProperty salaryProperty() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary.set(salary);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }
    public IntegerProperty getSalaryProperty(){
        return salary;
    }
}
