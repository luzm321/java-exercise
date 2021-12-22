package Interfaces;

public interface Product {
    double getPrice(); // getter method
    void setPrice(double price); // setter method

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    // can use default key word to provide an implementation of method below in interface without breaking the classes
    // implementing this interface:
    default String getBarcode() {
        return "No barcode";
    }
}

/*
    Interface Key Points:
    1. Interfaces cannot be instantiated or extended, only implemented
    2. Any class that implements an interface, must implement all of its methods, or it must declare itself abstract
    3. Methods in an interface must be abstract (no explicit declaration needed) or default.
    4. A class can implement multiple interfaces (using comma delimited interface names), but can only inherit from 1
    parent/super class. Example: public class Book implements Product, KindleItem {}
*/
