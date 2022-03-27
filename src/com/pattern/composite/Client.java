package com.pattern.composite;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        University university = new University("University");
        Random rand = new Random();
        for (int i = 1; i <= rand.nextInt(3) + 3; i++) {
            College college = new College("College" + i);
            university.add(college);
            for (int j = 1; j <= rand.nextInt(7) + 5; j++) {
                Department department = new Department("Department" + j);
                department.setCount(rand.nextInt(100));
                college.add(department);
            }
        }
        university.print();
    }
}
