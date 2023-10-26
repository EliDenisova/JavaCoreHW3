package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", "employee", 3333, 3000, 30));
        employees.add(new Director("Jane Smith", "director", 4444, 8000, 40));
        employees.add(new Employee("Mark Johnson", "employee", 5555, 5000, 50));

        System.out.println("Before salary increase:");
        for (Employee employee : employees
        ) {
            System.out.println(employee);
        }

        Director.increaseSalary(employees.toArray(new Employee[0]), 1000);
        System.out.println("\nAfter salary increase:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}