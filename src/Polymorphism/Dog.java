package Polymorphism;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof, I'm a dog!");
    }

    public void fetch() {
        System.out.println("Fetching toys is fun!");
    }
}
