package com.brainacad.oop.testexcp1;


public class Main {
    public static void main(String[] args) {

        Person valera = new Person();

        try {
            valera.setAge(121);
        } catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
