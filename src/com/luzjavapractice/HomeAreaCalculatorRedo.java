package com.luzjavapractice;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in); // global scanner

    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("Total area is: " + area);
        calculator.scanner.close();
    }

    public Rectangle getRoom() {
        System.out.print("Enter the length of your room: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of your room: ");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea(rectangle1.getWidth(), rectangle1.getLength()) +
                rectangle2.calculateArea(rectangle2.getWidth(), rectangle2.getLength());
    }
}
