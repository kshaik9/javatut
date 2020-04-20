package com.kdrtut.collectionstest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeesTest {
    public static void main(String[] args) {
        Employees e1 = new Employees(1, "Khadeer", "20000", "khadeer@gmail.com");
        Employees e2 = new Employees(2, "Rehana", "30000", "rehana@gmail.com");
        Employees e3 = new Employees(3, "Khayum", "40000", "khayum@gmail.com");
        Employees e4 = new Employees(4, "Ruksana", "50000", "ruksana@gmail.com");

        Departments d1 = new Departments(111, "IT", "Information Technology");
        Departments d2 = new Departments(123, "Health", "Employee Health");
        Departments d3 = new Departments(111, "HR", "Human Resource");

        Map<Employees, Departments> empsDeps = new HashMap<>();
        empsDeps.put(e1, d1);
        empsDeps.put(e2, d2);
        empsDeps.put(e3, d3);
        empsDeps.put(e4, d3);

        Set<Map.Entry<Employees, Departments>> entries = empsDeps.entrySet();
        for (Map.Entry<Employees, Departments> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
