package com.luzjavapractice;

// Class as a blueprint or template for creating objects:
public class Rectangle {
    //properties or fields encapsulated via private access modifier so no other class can access these properties:
    private double length;
    private double width;
    // protected access modifier means other classes within the same package can access it (similar to having no
    // access modifier at all)

    //methods used to access the fields:

    // Constructor to initialize objects:
    // default constructor is parameterless and assigns default values which can be set later
    // when instantiating new instance of Rectangle class, create a Rectangle object with corresponding properties
    // with access to methods of class.
    public Rectangle() {
        length = 0;
        width = 0;
    }

    // constructor with parameters:
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        // or can use below to set the values:
//        setLength(length);
//        setWidth(width);
    }

    // getter and setter for length:
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length; // this keyword refers to this Rectangle class so it will take the memory location
        // of this field and set it to the value of the length variable passed as a parameter to this method to store
        // value to this class's version of length
    }

    // getter and setter for width:
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width; // use this keyword to differentiate the scope of width from the field and parameter passed
    }

    public double calculatePerimeter(double length, double width) {
        return (2 * length) + (2 * width);
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

}
