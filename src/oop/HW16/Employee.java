package oop.HW16;

public class Employee extends Member {
    protected String specialization;
    public Employee (String name, int age, String phoneNumber, String address, int salary, String specialization){
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}
