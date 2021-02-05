package com.lesson5;

public class Employee {

    protected String name;
    protected String position;
    protected String email;
    protected String tel;
    protected int salary;
    protected int age;

    public Employee() {

    }

    static void info() {
        System.out.println("Сотрудники компании, старше 40 лет:");
    }
}
