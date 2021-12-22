package ErrorHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        createNewFile();
        numbersExceptionHandling();
        try {
            createNewFileRethrow();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }

        // can use polymorphism with exceptions for a broader/more general error handling:
        try {
            file.createNewFile();
        } catch (Exception e) { // Exception is the superclass
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }

    }

    // Rethrowing Exceptions that you don't want to handle:
    public static void createNewFileRethrow() throws IOException { // or throws Exception (if don't know what exception)
        File newFile = new File("resources/nonexistent.txt");
        newFile.createNewFile();


    }

    // Handling multiple exceptions:
    public static void numbersExceptionHandling() {
        var file = new File("resources/numbers.txt"); // create new file object
        Scanner fileReader = null;

        try {
            fileReader = new Scanner(file); // read from the file
            // use while loop to read each line from the file:
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
            // any error thrown will go into respective exception clause/block
        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println("File not found or discrepancy with input");
            e.printStackTrace();
        } finally { // will always execute whether an exception is thrown or not
            fileReader.close();
        }
//        catch (Exception e) { // catch all other exceptions not specific
//            e.printStackTrace();
//        }

        // or can be done like this without the finally clause and use resource only use with Scanner class:
//        var file = new File("resources/numbers.txt"); // create new file object
//
//        try (Scanner fileReader = new Scanner(file)){
//            while (fileReader.hasNext()) {
//                double num = fileReader.nextDouble();
//                System.out.println(num);
//            }
//            // any error thrown will go into respective exception clause/block
//        } catch (FileNotFoundException | InputMismatchException e) {
//            System.out.println("File not found or discrepancy with input");
//            e.printStackTrace();
//        }
    }

    // Throwing own exception:
    public static void calculateSalary(double hours, double rate) {
        if (hours > 40) {
            throw new IllegalArgumentException("No overtime allowed.");
        }
        System.out.println(hours * rate);
    }

}

