package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Alice", 75000));
        employees.add(new Employee(1, "Bob", 60000));
        employees.add(new Employee(2, "Charlie", 80000));

        // Display original list
        System.out.println("Original List:");
        displayEmployees(employees);

        // Sort by natural order (id)
        Collections.sort(employees);
        System.out.println("\nSorted by ID:");
        displayEmployees(employees);

        // Sort by name using Comparator
        Collections.sort(employees, EmployeeComparators.sortByName);
        System.out.println("\nSorted by Name:");
        displayEmployees(employees);

        // Sort by salary using Comparator
        Collections.sort(employees, EmployeeComparators.sortBySalary);
        System.out.println("\nSorted by Salary:");
        displayEmployees(employees);

        // Cloning an employee
        try {
            Employee clonedEmployee = (Employee) employees.get(0).clone();
            System.out.println("\nCloned Employee: " + clonedEmployee);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Iterate over the employees using Iterator
        System.out.println("\nIterating over employees:");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Method to display the list of employees
    private static void displayEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
