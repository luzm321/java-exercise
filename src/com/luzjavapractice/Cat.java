package com.luzjavapractice;

public class Cat extends Dog {
    private String breed;
    // Dog is the super class while Cat is the subclass/derived inheriting properties and methods from Dog parent class
    // using same constructor from Dog class and super from dog constructor
    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Can have multiple constructors via method overloading with varied parameters and data types that get called
    // depending on what is passed to the constructor when instantiating a new object of the Cat class:
    // another way to create a new cat object and introduces polymorphism to system like inheritance and interfaces
    public Cat(String name, int age) {
        super(name, age);
        this.breed = "Munchkin";
    }

    public Cat(String name) {
        super(name, 0); // if no age given, value is set to 0
        this.breed = "Munchkin";
    }

    // override speak() method from Dog class so that methods prints something different
    public void speak() {
        System.out.println("Meow! My name is " + this.name + " I'm " + this.age + " years old" + " and I'm a " + this.breed);
    }

    public void sayBreed(String breed) {
        this.breed = breed;
    }
}
