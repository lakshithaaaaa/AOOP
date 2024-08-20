package EmployeeManagementSystem;

import java.util.Comparator;

public class EmployeeComparators {
    
    // Comparator for sorting by name
    public static Comparator<Employee> sortByName = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

    // Comparator for sorting by salary
    public static Comparator<Employee> sortBySalary = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Double.compare(e1.getSalary(), e2.getSalary());
        }
    };
}
