package Abstraction;

public class ShapeTester {
    public static void main(String[] args) {
        var rectangle = new Rectangle(5, 7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}

/* Abstraction Key Points:
1. Abstract classes and methods are templates that are meant to be implemented by their subclasses.
2. Classes and methods are declared abstract by using the abstract keyword
3. If a subclass extends from an abstract class, it must implement its abstract methods or be declared abstract itself
4. Abstract classes cannot be instantiated, but only to be used as a superclass. If even one method in a class is
abstract, the class must be declared abstract as well.
* */
