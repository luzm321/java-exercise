package com.luzjavapractice;

// Class that creates instances of the Rectangle class to find the total area of two rooms in a house:
public class HomeAreaCalculator {
    public static void main(String[] args) {
        //Rectangle 1:
        // Create instance of Rectangle class:
        Rectangle livingRoom = new Rectangle();
        livingRoom.setWidth(25);
        livingRoom.setLength(50);
        double livingRoomArea = livingRoom.calculateArea(livingRoom.getWidth(), livingRoom.getLength());

        // Rectangle 2:
        Rectangle kitchen = new Rectangle(30, 75);
        double kitchenArea = kitchen.calculateArea(kitchen.getWidth(), kitchen.getLength());

        double totalArea = livingRoomArea + kitchenArea;
        System.out.println("Area of both rooms is: " + totalArea);
    }
}
