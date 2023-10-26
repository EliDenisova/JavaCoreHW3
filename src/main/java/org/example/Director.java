package org.example;

import java.util.Date;

public class Director extends Employee{
    public Director(String name, String post, int phone, int salary, int age) {
        super(name, post, phone, salary, age);
    }

    public static void increaseSalary(Employee[] employees, int amount) {
        for (Employee employee : employees
        ) {
            if (!(employee instanceof Director)) {
                employee.increaseSalary(amount);
            }
        }
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setPost(String post) {
        super.setPost(post);
    }

    @Override
    public void setPhone(int phone) {
        super.setPhone(phone);
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getPost() {
        return super.getPost();
    }

    @Override
    public int getPhone() {
        return super.getPhone();
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public int dateComparison(Date date1, Date date2) {
        return super.dateComparison(date1, date2);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
