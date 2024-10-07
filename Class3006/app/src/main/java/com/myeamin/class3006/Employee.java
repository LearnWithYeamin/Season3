package com.myeamin.class3006;

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

    public Employee(String name, String position, float salary, float absent) {
        this.name = name;
        this.position = position;
        this.salary = salary - (absent * 500);
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

