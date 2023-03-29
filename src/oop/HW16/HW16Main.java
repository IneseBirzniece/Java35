package oop.HW16;

public class HW16Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Bob", 45, "31769998545", "Street", 1650, "cashier");
        Manager manager = new Manager("Sarah", 34, "31769993445", "Road", 2650, "food");

        employee.printSalary();
        manager.printSalary();
    }
}
