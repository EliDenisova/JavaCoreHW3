package org.example;

import java.util.Date;
import java.util.Objects;

public class Employee {

    String name;
    String post;
    int phone;
    int salary;
    int age;

    public Employee(String name, String post, int phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public int getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public int dateComparison (Date date1, Date date2) {
        int monthDiff = date1.getMonth() - date2.getMonth();
        int dayDiff = date1.getDay() - date2.getDay();
        return monthDiff * 100 + dayDiff;
    }

    public void increaseSalary(int amount) {
        salary += amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return phone == employee.phone && salary == employee.salary && age == employee.age && Objects.equals(name, employee.name) && Objects.equals(post, employee.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, post, phone, salary, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
