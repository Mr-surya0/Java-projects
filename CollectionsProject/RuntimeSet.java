package com.CollectionsProject;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

public class RuntimeSet {

    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter employee ID:");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("Enter employee name:");
            String name = scanner.nextLine();
            System.out.println("Enter employee department:");
            String department = scanner.nextLine();

            Employee employee = new Employee(id, name, department);
            employees.add(employee);

            System.out.println("Do you want to add another employee? (yes/no)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Employee details:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

