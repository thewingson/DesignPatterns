package kz.almat.behavioral.visitor.model;

import kz.almat.behavioral.visitor.ReportVisitor;

public class Employee implements Visible{

    private String fullName;
    private String position;
    private float salary;

    public Employee(String fullName, String position, float salary) {
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String accept(ReportVisitor visitor) {
        return visitor.visitEmployeeReport(this);
    }
}
