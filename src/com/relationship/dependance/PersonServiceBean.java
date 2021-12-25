package com.relationship.dependance;

public class PersonServiceBean {
    private PersonDao personDao;

    public void save(Person person) {
    }

    public IDCard getIdCard(Integer personId) {
        return new IDCard();
    }

    public void modify() {
        Department department = new Department();
    }
}
