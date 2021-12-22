package Polymorphism;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow, I'm a cat!");
    }

    public void scratch() {
        System.out.println("I like to scratch things as a cat.");
    }
}
