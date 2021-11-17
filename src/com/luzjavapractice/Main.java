package com.luzjavapractice; // specifies the package the class belongs to
// A module file (the .iml file) is used for keeping module configuration. Modules allow you to combine several
// technologies/frameworks in one application. IML files store a module's type, paths, dependencies, and other settings.
import java.util.ArrayList;
//import java.util.*;
import java.util.function.Consumer; // Use Java's Consumer interface to store a lambda expression in a variable:

public class Main {

    public static void main(String[] args) {
        // List of integers:
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(21);
        numbers.add(3);
        numbers.add(1);
        numbers.add(26);

        // print numbers list:
        System.out.println("Number List: " + numbers);

        // Using lambda expression denoted by thin arrow -> in the ArrayList's forEach() method
        // to print every item in the list:
        // A lambda expression is a short block of code which takes in parameters and returns a value.
        System.out.println("Number List Using forEach method:");
        numbers.forEach( (n) -> System.out.println(n) );

        System.out.println("-------Fruits-------"); // adds space in between the code in command line app

        // List of strings with object initializer:
        ArrayList<String> fruits = new ArrayList<String>() {
            {
                add("mango");
                add("dragon fruit");
                add("jack fruit");
                add("watermelon");
            }
        };

        Consumer<String> fruitCollection = (fruit) -> System.out.println("Fruit: " + fruit);

        fruits.forEach(fruitCollection);

        System.out.println("--------Intro--------");

        // invoking introducePerson() method with different values:
        introducePerson("Luz", 28);
        introducePerson("Luke", 26);
    }

    // method that prints a string to the console (template literal/string interpolation) of person introducing self
    // by name and age based on values passed for each corresponding parameters:
    public static void introducePerson(String name, Integer age) {
        System.out.println(String.format("Hello, my name is %s and I'm %s.", name, age));
    }

}
