package com.java.automation.lab.fall.cehanovich.core22.domain.classes.humans;

public abstract class Human {
    protected String firstname;
    protected String lastname;
    protected String gender;
    protected int age;

    public Human() {

    }

    public Human(String firstname, String lastname, String gender, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;

    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }


    @Override
    public String toString() {
        return "Human {\nFirstname: " + firstname + "Lastname: " + lastname + "Gender: " +
                gender + "Age: " + age + "\n}";
    }

    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        if (this == that) {
            return true;
        }
        Human other = (Human) that;
        return firstname.equals(other.firstname) && lastname.equals(other.lastname) &&
                gender.equals(other.gender) && age == other.age;
    }

    @Override
    public int hashCode() {
        return (firstname.hashCode() * 17 + lastname.hashCode()) / 2 + age;
    }

}
