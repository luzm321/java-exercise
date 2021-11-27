package com.luzjavapractice;

public class Dog {
    // private properties/attributes are only accessible within the class itself
    protected String name; // attribute/property
    protected int age;
    protected static int count = 0; // statically change count for each instance of class to keep track of how many
    // dog instances there are for example

    // constructor
    public Dog(String name, int age) {
        this.name = name; // setting values of parameters equal to what is passed in to constructor when Dog class is invoked
        this.age = age; // this keyword references the attributes of the class
        add2ToAge();
        Dog.count += 1; // will keep track of how many dogs there are
        //speak();
    }

    public void speak() {
        System.out.println("I am " + this.name + " and I am " + this.age + " years old!");
    }
    // method for retrieving age
    public int getAge() {
        return this.age;
    }
    // method for setting age:
    public void setAge(int age) {
        this.age = age;
    }
    // protected method:
    protected int add2ToAge() {
        return this.age + 2;
    }

    // static method:
    public static void display() {
        System.out.println("I am a dog!");
    }
}
