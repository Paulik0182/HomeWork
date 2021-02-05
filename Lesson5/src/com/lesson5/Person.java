package com.lesson5;

public class Person extends Employee {

    public Person(String name, String position, String email, String tel, int salary, int age) {
        super();
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;

        if (age >= 40) {
            System.out.println("Ф.И.О.: " + name + "/ Должность: " + position + "/ E-mail: " + email + "/ Тел.: "
                    + tel + "/ Зарплата: " + salary + " р./ Возраст: " + age + " лет");
        }
    }
}
