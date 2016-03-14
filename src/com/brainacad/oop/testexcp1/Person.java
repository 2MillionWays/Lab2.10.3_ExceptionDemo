package com.brainacad.oop.testexcp1;


public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException { //don't need to say throws for unchecked exception
        this.age = age;
        if(age == 0){
            throw new InvalidAgeException("Invalid age");
        }
        if(age > 120){
            throw new InvalidAgeException("Invalid age");
        }
    }
}
