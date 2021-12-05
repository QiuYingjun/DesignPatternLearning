package com.principle.dependanceinversion;

public class DependanceInversion1 {
    public static void main(String[] args) {
        Person person = new Person();
        Email email = new Email();
        person.receive(email);
    }
}

class Email {
    public String getInfo() {
        return "Email text";
    }
}

/**
 * 问题：当出现Email以外的需求时，Person要修改或增加接受方法
 */
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}