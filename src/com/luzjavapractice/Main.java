package com.luzjavapractice; // specifies the package the class belongs to
// A module file (the .iml file) is used for keeping module configuration. Modules allow you to combine several
// technologies/frameworks in one application. IML files store a module's type, paths, dependencies, and other settings.
import java.text.NumberFormat;
import java.util.*;
//import java.util.*;
import java.util.function.Consumer; // Use Java's Consumer interface to store a lambda expression in a variable:

public class Main {

    public static <numbers> void main(String[] args) {
        // List of integers:
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(21);
//        numbers.add(3);
//        numbers.add(1);
//        numbers.add(26);

        // print numbers list:
//        System.out.println("Number List: " + numbers);

        // Using lambda expression denoted by thin arrow -> in the ArrayList's forEach() method
        // to print every item in the list:
        // A lambda expression is a short block of code which takes in parameters and returns a value.
//        System.out.println("Number List Using forEach method:");
//        numbers.forEach( (n) -> System.out.println(n) );

//        System.out.println("-------Fruits-------"); // adds space in between the code in command line app

        // List of strings with object initializer:
//        ArrayList<String> fruits = new ArrayList<String>() {
//            {
//                add("mango");
//                add("dragon fruit");
//                add("jack fruit");
//                add("watermelon");
//            }
//        };

//        Consumer<String> fruitCollection = (fruit) -> System.out.println("Fruit: " + fruit);
//
//        fruits.forEach(fruitCollection);

//        System.out.println("--------Intro--------");

        // invoking introducePerson() method with different values:
//        introducePerson("Luz", 28);
//        introducePerson("Luke", 26);

//        System.out.println("------------Data Types:----------------");
//
//        // Primitive type to store simple values:
//        byte myAge = 21;
//        int largerNum = 123456;
//        // Underscores are digit separators, which lets us separate the thousands places like we would with commas
//        long evenLargerNum = 4_123_456;
//
//        // Reference Type to store complex objects:
//        Date now = new Date(); // now object/variable is an instance of the Date class
//        System.out.println(now);
//        now.getTime();
//
//        // Strings are immutable in Java:
//        String message = "    Hello World" + "!!!    ";
//        System.out.println(message.replace("!", "*")); // any method that modifies a string returns a new String object
//        System.out.println(message.toUpperCase());
//        System.out.println(message.trim());
//        System.out.println(message);

        // Escaping double quotes:
//        String msg = "Hello, \"Luz\"!";
//        System.out.println(msg);
//
//        // Escaping backslash:
//        String escape = "c:\\Windows\\...";
//        System.out.println(escape);
//
//        // Escape sequence for \n to add new line to a string and \t adds a tab between characters:
//        String esc = "c:\tWindows\n\\...";
//        System.out.println(esc);
//
//        // Arrays to store list/collection of items:
//        System.out.println("----------------Initializing Arrays----------------------");
//        // Older syntax of initializing an array:
//        int[] numArray = new int[4];
//        numArray[0] = 1;
//        numArray[1] = 2;
//        System.out.println(Arrays.toString(numArray));

        // Initializing numbers array with object initializer:
        // Arrays have a fixed length; to add/remove items in an array, need to utilize one of the collection classes
//        int[] numberArray = {3, 2, 1, 5, 4};
//        Arrays.sort(numberArray);
//        System.out.println(Arrays.toString(numberArray));
//
//        // Multi-dimensional arrays (2D array to store a matrix and 3d array to store data for a cube) useful for
//        // scientific computations:
//        // 2D array:
//        int[][] matrix = new int[2][3]; // will output 2 rows and 3 columns
//        matrix[0][0] = 1;
//        System.out.println(Arrays.deepToString(matrix));
//        // Curly braces syntax 2d array matrix:
//        int[][] matrixNum = { {1, 2, 3}, {4, 5, 6} };
//        System.out.println(Arrays.deepToString(matrixNum));

//        System.out.println("------Constants---------");
//        // Adding final keyword in front of a variable tells Java compiler to treat variable as a constant so once
//        // it's initialized, the values cannot be changed and convention to use all capital letters to name constants:
//        final float PI = 3.14F;
//        System.out.println(PI);

//        System.out.println("--------Arithmetic Expressions-----------");
//        // Casting/converting whole number operands to a double to get a more precise output value as a floating point
//        // number. Otherwise, if using an int, value of expression will be rounded to the whole number:
//        double result = (double)10 / (double)3;
//        System.out.println(result);
//
//        // Increment or decrement operator applied as a postfix or prefix:
//        int x = 2;
//        x++; // or ++x will yield same result and similar for x-- or --x
//        System.out.println(x);
//
//        // When increment/decrement operator is used as a postfix on the right side of an assignment operator, get
//        // different results as a will be copied to b first, then incremented by 1:
//        int a = 1;
//        int b = a++;
//        System.out.println(a); // output is 2
//        System.out.println(b); // output is 1
//
//        // When used as a prefix, same results as c will be incremented by 1 first, then copied to d:
//        int c = 1;
//        int d = ++c;
//        System.out.println(c); // output is 2
//        System.out.println(d); // output is 2

        // Compound or augmented assignment operators:
//        int e = 1;
//        e += 2; // same as e = e + 2;
//        System.out.println(e); // output is 3
//
//        // Order of Operations (PEMDAS):
//        int f = 10 + 3 * 2;
//        System.out.println(f); // output is 16 (multiply before adding)

//        System.out.println("------Casting and Type Conversion----------");
//        // Implicit/automatic casting/conversion occurs when converting the value of a data type to a bigger data type
//        // and whenever there is no data loss:
//        // ex: byte > short > int > long > float > double (same for casting an int into a more precise double data type)
//        short g = 1;
//        int h = g + 2; // adding a short data type to an integer data type, so one of the types need to be converted
//        // to the other type so they are equal
//        System.out.println(h); // output is 3
//
//        // Explicit casting can only occur between compatible types (num => num, but not num => string) unless
//        // using wrapper class like Integer.parseInt() method to add a string num and an int num...
//        double i = 1.1;
//        int j = (int)i + 2; // convert i from a double into an int
//        System.out.println(j); // output is 3
//        // need to convert strings to their numeric representations as in UI, receive input from users as strings
//        String k = "1";
//        int l = Integer.parseInt(k) + 3;
//        System.out.println(l);

//        System.out.println("------------Math Class----------------");
//        int output = (int)Math.floor(1.5F);
//        System.out.println(output);
//
//        int randomResult = (int) Math.round(Math.random() * 100);
//        // int randomResult = (int) (Math.random() * 100);
//        System.out.println(randomResult);

//        System.out.println("-----Formatting Numbers------");
//        // Formatting numbers to a currency
//        // factory method on NumberFormat class to create new NumberFormat object
//        var currency = NumberFormat.getCurrencyInstance();
//        // has overloaded methods for formatting values available in instance of NumberFormat class
//        // format() returns a string representation of number passed to method, formatted as a currency
//        String currencyResult = currency.format(1234567.891);
//        System.out.println(currencyResult);
//
//        // Formatting numbers as a percentage with method chaining:
//        String percentResult = NumberFormat.getPercentInstance().format(0.5);
//        System.out.println(percentResult);

//        System.out.println("----------Reading Input----------");
//        // Instantiate Scanner class
//        Scanner scanner = new Scanner(System.in);
        // Reading number input:
//        System.out.print("Age: ");
//        byte age = scanner.nextByte(); // method parses byte values
//        System.out.println("You are " + age);
        // Reading string input:
//        System.out.print("Name: ");
//        String name = scanner.nextLine().trim(); // next method only reads 1 token (such as first name), so utilize nexLine()
//        // method instead to get full name that includes last name as well
//        System.out.println("Your name is " + name);

        System.out.println("-----\"Mortgage Calculator Project with Error Handling\"--------");
        // Can make code cleaner by creating a method that calculates mortgage
        final byte MONTHS_IN_YEAR = 12; // constant
        final byte PERCENT = 100; // constant

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            principal = userInput.nextInt();
            if (principal >= 1000 && principal <= 1_000_000) {
                break;
            } else {
                System.out.println("Please enter a value between 1000 and 1000000");
            }
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = userInput.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            } else {
                System.out.println("Please enter a value between 1 and 30");
            }
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte years = userInput.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Please enter a value between 1 and 30");
        }

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + formattedMortgage);

//        System.out.println("------Comparison Operators-------");
//        int x = 1;
//        int y = 1;
//        //System.out.println(x == y);
//        System.out.println(x != y);

//        System.out.println("----Logical Operators----");
//        int temperature = 21;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);

//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = false;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//        System.out.println(isEligible);

//        System.out.println("----If Statements----");
//        int temp = 21;
//        if (temp > 30) {
//            System.out.println("It's a hot day.");
//            System.out.println("Drink plenty of water.");
//        } else if (temp > 20 && temp <= 30) {
//            System.out.println("It's a nice day.");
//        } else {
//            System.out.println("It's cold.");
//        }

//        int income = 200_000;
//        boolean hasHighIncome = (income > 100_000);
//        System.out.println(hasHighIncome);

//        System.out.println("------Ternary Operator------");
//        int income = 120_000;
//        String className = income > 100_000 ? "First" : "Economy";
//        System.out.println(className);

//        System.out.println("----Switch Statements----");
//        String role = "admin";
//        switch (role) {
//            case "admin":
//                System.out.println("You're an admin");
//                break; // jumps out of switch block
//            case "moderator":
//                System.out.println("You're a moderator");
//                break;
//            default:
//                System.out.println("You're a guest");
//
//        }

//        System.out.println("----FizzBuzz Exercise-----");
//        Scanner userInput = new Scanner(System.in);
//        System.out.print("Number: ");
//        int number = userInput.nextInt();
//        if (number % 15 == 0) {
//            System.out.println("FizzBuzz");
//        } else if (number % 3 == 0) {
//            System.out.println("Fizz");
//        } else if (number % 5 == 0) {
//            System.out.println("Buzz");
//        } else {
//            System.out.println(number);
//        }
//        System.out.println("----For Loops----");
//        final String[] colors = {"green", "blue", "lilac", "black"};
//        for (int i = 0; i < colors.length; i++ ) {
//            if (colors[i] == "green") {
//                System.out.println(String.format("%s is my favorite color!", colors[i]));
//            } else {
//                System.out.println(String.format("%s is nice, but not my favorite.", colors[i]));
//            }
//        }

//        System.out.println("-----While Loops-----"); // useful when we don't know how many times we need to iterate
//        String input = "";
//        Scanner userInput = new Scanner(System.in);
//        while (!input.equals("quit")) {
//            System.out.print("Input: ");
//            input = userInput.nextLine().toLowerCase();
//            System.out.println(input);
//        }

//        System.out.println("----Do...While Loops----");
//        // code executes once, even if initial condition is false
//        String input = "";
//        Scanner userInput = new Scanner(System.in);
//        do {
//            System.out.print("Input: ");
//            input = userInput.nextLine().toLowerCase();
//            System.out.println(input);
//        } while (!input.equals("quit"));
//        System.out.println("-----Break and Continue-----");
//        String input = "";
//        Scanner userInput = new Scanner(System.in);
//        while (true) {
//            System.out.print("Input: ");
//            input = userInput.nextLine().toLowerCase();
//            if (input.equals("pass")) {
//                continue;
//            }
//            if (input.equals("quit")) {
//                break;
//            } else {
//                System.out.println(input);
//            }
//        }

//        System.out.println("----For-Each Loop----");
//        String[] fruits = {"mango", "watermelon", "dragon fruit"};
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }

//        fruits.forEach((fruit) -> System.out.println(fruit));

        System.out.println("-----");
    }

    // method that prints a string to the console (template literal/string interpolation) of person introducing self
    // by name and age based on values passed for each corresponding parameters:
//    public static void introducePerson(String name, Integer age) {
//        System.out.println(String.format("Hello, my name is %s and I'm %s.", name, age));
//    }

}
