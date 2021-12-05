package com.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class Demeter2 {
    public static void main(String[] args) {
        SchoolManager2 schoolManager = new SchoolManager2();
        schoolManager.printAllEmployee(new CollegeManager2());
    }
}

class CollegeEmployee2 {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}

class CollegeManager2 {
    public List<CollegeEmployee2> getAllEmployee() {
        List<CollegeEmployee2> list = new ArrayList<CollegeEmployee2>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee2 emp = new CollegeEmployee2();
            emp.setId("学院员工id=" + i);
            list.add(emp);
        }
        return list;
    }

    public void printEmployee() {
        List<CollegeEmployee2> list1 = this.getAllEmployee();
        System.out.println("-----------------学院员工----------------");
        for (CollegeEmployee2 e : list1) {
            System.out.println(e.getId());
        }

    }
}

class Employee2 {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}

class SchoolManager2 {
    public List<Employee2> getAllEmployee() {
        List<Employee2> list = new ArrayList<Employee2>();
        for (int i = 0; i < 5; i++) {
            Employee2 emp = new Employee2();
            emp.setId("学校员工id=" + i);
            list.add(emp);
        }
        return list;
    }

    void printAllEmployee(CollegeManager2 sub) {
        // 把陌生类移到和它相关的类中，不让作为陌生类出现
        sub.printEmployee();
        List<Employee2> list2 = this.getAllEmployee();
        System.out.println("-----------------学校总部员工----------------");
        for (Employee2 e : list2) {
            System.out.println(e.getId());
        }

    }
}
