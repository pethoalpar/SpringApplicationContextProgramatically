package com.pethoalpar;

/**
 * Created by petho on 2017-07-15.
 */
public class Person {

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void printPerson(){
        System.out.println("Name:"+this.name+" Age:"+this.age);
    }
}
