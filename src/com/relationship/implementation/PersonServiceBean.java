package com.relationship.implementation;

public class PersonServiceBean implements PersonService {
    @Override
    public void delete(Integer id) {
        System.out.println("delete");
    }

}
