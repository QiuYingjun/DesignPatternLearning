package com.pattern.prototype.deepclone.clone;

import java.io.Serializable;

public class Sheep implements Serializable, Cloneable {
    private String name;
    private int age;
    private String color;
    private Sheep friend;

    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Sheep() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep name(String name) {
        setName(name);
        return this;
    }

    public Sheep age(int age) {
        setAge(age);
        return this;
    }

    public Sheep color(String color) {
        setColor(color);
        return this;
    }

    public Sheep getFriend() {
        return this.friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", age='" + getAge() + "'" +
                ", color='" + getColor() + "'" +
                ", hashcode='" + this.hashCode() + "'" +
                ", friend=" + getFriend() + "" +
                "}";
    }

    @Override
    protected Sheep clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
            sheep.friend = this.friend.clone();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
