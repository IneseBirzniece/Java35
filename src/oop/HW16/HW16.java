package oop.HW16;


abstract class Member {
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected int salary;

    public Member(String name, int age, String phoneNumber, String address, int salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    //abstract method
    public void printSalary(){
        System.out.println("Salary for " + name + " is " + salary + ".");
    }


}

/*    public class Employee extends Member {
        protected String specialization;
        public Employee (String name, int age, String phoneNumber, String address, int salary, String specialization){
            super(name, age, phoneNumber, address, salary);
            this.specialization = specialization;
        }
        public void printSalary(){
            System.out.println("Salary for " + name + " is " + salary);
        }
    }*/

/*    public class Manager extends Member {
        protected String department;
        public Manager (String name, int age, String phoneNumber, String address, int salary, String department){
        super(name, age, phoneNumber, address, salary);
        this.department = department;
        }
        public void printSalary(){
            System.out.println("Salary for " + name + " is " + salary);
        }
    }*/

