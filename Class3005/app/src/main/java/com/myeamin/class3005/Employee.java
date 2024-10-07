package com.myeamin.class3005;

public class Employee {

    private String name;
    private String position;
    private float salary;

    // Constructor
    public Employee(String name, String position, float salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public float getSalary() {
        return salary;
    }

}

