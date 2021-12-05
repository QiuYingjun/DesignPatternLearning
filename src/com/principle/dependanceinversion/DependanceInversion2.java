package com.principle.dependanceinversion;

public class DependanceInversion2 {
    public static void main(String[] args) {
        Person2 person = new Person2();
        Email2 email = new Email2();
        person.receive(email);
        WeChat weChat = new WeChat();
        person.receive(weChat);
    }
}

interface IReceiver {
    public String getInfo();
}

class Email2 implements IReceiver {
    public String getInfo() {
        return "Email text";
    }
}

class WeChat implements IReceiver {
    public String getInfo() {
        return "Wechat text";
    }
}

/**
 * 当出现Email以外的需求时，只需各自实现接口里的方法，Person不需要改
 */
class Person2 {
    public void receive(IReceiver ir) {
        System.out.println(ir.getInfo());
    }
}