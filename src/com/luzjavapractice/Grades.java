package com.luzjavapractice;

import java.util.Scanner;

// Create program that allows user to enter any number of grades and provides them with their avg score along with the
// highest and lowest scores:
public class Grades {
    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many grades would you like to enter?");
        grades = new int[scanner.nextInt()];

        getGrades();

        // % sign is a placeholder for the value of second parameter passed to String.format() method:
        // specifying in this case that value will be a float with 2 decimal places:
        System.out.println("Average: " + String.format("%.2f", calculateAvg()));

        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());
    }

    public static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Please enter grade #" + (i + 1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSum() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

    public static double calculateAvg() {
        return calculateSum() / grades.length;
    }

    public static int getHighest() {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
               highest = grade;
            }
        }
        return highest;
    }

    public static int getLowest() {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
