package com.luzjavapractice; // specifies the package the class belongs to
// A module file (the .iml file) is used for keeping module configuration. Modules allow you to combine several
// technologies/frameworks in one application. IML files store a module's type, paths, dependencies, and other settings.
import java.sql.Array;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Set;
import java.util.HashSet;
//import java.util.*;
//import java.util.Scanner;
import java.util.function.Consumer; // Use Java's Consumer interface to store a lambda expression in a variable:

public class Main {
//    static int requiredSalary = 25_000;
//    static int requiredCreditScore = 700;
//    static Scanner scanner = new Scanner(System.in);

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

//        System.out.println("-----\"Mortgage Calculator Project with Error Handling\"--------");
//        // Can make code cleaner by creating a method that calculates mortgage
//        final byte MONTHS_IN_YEAR = 12; // constant
//        final byte PERCENT = 100; // constant
//
//        int principal = 0;
//        float monthlyInterest = 0;
//        int numberOfPayments = 0;
//
//        Scanner userInput = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("Principal: ");
//            principal = userInput.nextInt();
//            if (principal >= 1000 && principal <= 1_000_000) {
//                break;
//            } else {
//                System.out.println("Please enter a value between 1000 and 1000000");
//            }
//        }
//
//        while (true) {
//            System.out.print("Annual Interest Rate: ");
//            float annualInterest = userInput.nextFloat();
//            if (annualInterest >= 1 && annualInterest <= 30) {
//                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
//                break;
//            } else {
//                System.out.println("Please enter a value between 1 and 30");
//            }
//        }
//
//        while (true) {
//            System.out.print("Period (Years): ");
//            byte years = userInput.nextByte();
//            if (years >= 1 && years <= 30) {
//                numberOfPayments = years * MONTHS_IN_YEAR;
//                break;
//            }
//            System.out.println("Please enter a value between 1 and 30");
//        }
//
//        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
//
//        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("Mortgage: " + formattedMortgage);

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

        System.out.println("---More Java Practice---");

//        System.out.print("Enter your age: ");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//
//        int age = Integer.parseInt(input);
//        // Rudimentary nesting if/else statements (Control flow):
//        if (age >= 18) {
//            System.out.print("Enter your fave food: ");
//            String food = sc.nextLine().toLowerCase();
//            if (food.equals("bibimbap")) {
//                System.out.println("That's my fave food also!");
//            } else {
//                System.out.println("I like that food too, but it's not my fave.");
//            }
//        } else if (age >= 13) {
//            System.out.println("You're a teenager!");
//        } else {
//            System.out.println("You're not a teenager or adult!");
//        }

        // For Loop Practice:
//        int[] numbers = {1,2,3,4,5};
//        String[] names = new String[5];

//        int count = 0; // counter to keep track of count value/index in loop
//        // for each element in the array: every time you iterate through this loop, we're going to declare a new variable
//        // called element, and it's going to be equal to the next element in the numbers array:
//        for (int element:numbers) {
//            System.out.println(element + " " + count);
//            count++; // increment 1 to value of count variable
//        }
//        Scanner sc = new Scanner(System.in);
//        // Populating the names array with values with for loop:
//        for (int i = 0; i < names.length; i++) {
//            System.out.print("Input: ");
//            String input = sc.nextLine();
//            names[i] = input;
//        }
//
//        for (String name:names) {
//            System.out.println("name: " + name);
//            if (name.equals("Luz")) {
//                System.out.println("Found Luz!");
//                break; // only use break if needed
//            }
//        }

        // Sets and Lists from collection interface in Java:
        // A set should be unique (cannot contain duplicate elements) and does not know where the elements are:
        // HashSet is a common implementation of a standard set and values are not in order, can't index a set:
//        Set<Integer> t = new HashSet<Integer>(); // can pass variable containing values in parentheses of hashset
//        t.add(1);
//        t.add(2);
//        t.add(3);
//        t.add(1); // will not be added to set as it is a duplicate
//        t.add(4);
//        t.add(-5);
//        t.remove(3);
////        t.clear(); //clears an entire set
//        t.isEmpty(); // checks if a set is empty or not
//        t.size(); // length of set
//
//        System.out.println(t);
//        boolean x = t.contains(2); // can quickly find out if a value exists in a set compared to an array
//        System.out.println(x);

       // TreeSet similar to HashSet in having unique elements, but ordered in a tree data structure
        // LinkedHashSet faster in performance

        // Lists like arrays, but slower and can modify size/length of elements in list for a dynamic list:
        // Can index a list just like an array, unlike a set which cannot be indexed:
//        ArrayList<Integer> t = new ArrayList<Integer>();
//        t.add(21);
//        t.add(3);
//        t.add(4);
//        t.get(0); // get index of element in list with output of 21
//        t.set(1, 5); // sets index 1 to have value of 5 to re-assign values by index in list; need to have an already
//        // existing value for that index prior to using set
//        t.subList(1, 2); // get values of elements within a certain range between 2 indexes, not including, last index
//        System.out.println(t);
//        System.out.println(t.subList(1, 2)); // output is 5 as it is a value between index 1 and 2, not including index
        // of 2, but including index of 1;

        // LinkedList is faster at certain operations than an ArrayList

        // HashMaps or Java Maps (Like a dictionary):
        // A map is a key-value pair, index a map by the keys (any data type), a key links to a value:
        // a fast data type and occurs in constant time and unordered
        // A hashmap must have unique keys, but can have duplicate values
//        Map m = new HashMap();
//        m.put("age", 21); // to put any value into a map, need to specify a key and a value
//        m.put("color", "green");
//        m.put(3, 10);
          //m.containsValue("green"); // checks to see if value exists in the map
        // m.containsKey("age"); // checks if key exists in map // returns null if does not exist
        // m.clear();
        //m.isEmpty();
        // System.out.println(m.values()); // prints values of map unordered, same for m.keys();
        // m.remove("age"); // remove a key from a map
//        System.out.println(m); // output is {3=10, color=green, age=21}
//        System.out.println(m.get("age")); // retrieve value of a key from a map/hashmap

        // TreeMap is sorted in alphabetical order, but data types of keys must be the same
//        Map m = new TreeMap();
//        m.put("name", "Luz");
//        m.put("favorite number", 5);
//        System.out.println(m);

        // LinkedHashMap is similar to a list where it keeps the same order of elements added to it
//        Map m = new LinkedHashMap();
//        m.put("name", "Luz");
//        m.put("favorite number", 5);
//        System.out.println(m);

        // HashMap Example (Looping through every letter in string, checking if map already contains that letter as a
        // key, if so increment by 1 through each loop, else create new key of that letter and initialize value as 1)
        // spaces are also included as a key in the map:
//        Map m = new HashMap();
//        String str = "Hello my name is Luz and I'm learning Java";
//        for (char x:str.toCharArray()) { // convert string to a character array so that we can iterate through it
//            if (m.containsKey(x)) {
//                int old = (int) m.get(x);
//                m.put(x, old + 1); // if character (key) already exists in map, increment count by 1
//            } else {
//                m.put(x, 1); //if character does not exist in map, create new key of that letter with initial value of 1
//            }
//        }
//        m.remove(' '); // will remove space from character array
//        System.out.println(m);

        // Sorting through a range within an array:
//        int[] numArray = {-5, 0, -3, 2, 1, 6, 5, 4};
//        Arrays.sort(numArray, 1, 5); //takes 3 arguments and sorts in place
//        //(first arg is the array to be sorted, other 2 are optional that is the starting and ending index range inclusive
//        // of starting index, but excludes ending index)
//        // Arrays.sort(numArray); // sorts through all the elements in order rather than a specified range
//        for (int i:numArray) {
//            System.out.print(i + ",");
//        }
        // output: -5, -3, 0, 1, 2, 3, 5, 4

        // Objects Practice:
        // An object is an instance of a data type like a class (blueprint/template for creating objects) with
        // properties and methods and represent real-world objects

//        displayAge(21, 3);
//        int sum = addNumbers(1,2);
//        System.out.println(sum);

        // Creating Classes and instantiating new object of type Dog:
        // Created instance of Dog class and stored in object/variable named cindy that references Dog object
        // pass arguments to constructor
//        Dog cindy = new Dog("Cindy", 15);
//        cindy.speak();
//        Dog nova = new Dog("Nova", 10);
//        nova.setAge(5);
//        nova.speak();
//        Dog kona = new Dog("Kona", 12);
//        kona.speak();
//        int dogAge = kona.getAge();
//        System.out.println("Kona's age: " + dogAge);
//        System.out.println("Number of dogs created: " + Dog.count);

//        Cat peach = new Cat("Peach", 3, "Munchkin");
//        peach.speak(); // inherit speak method from Dog class
//        Cat bob = new Cat("Bob", 21);
//        bob.speak();
//        Cat james = new Cat("James");
//        james.speak();

        // Instantiating Student class:
//        Student tim = new Student("Tim");
//        var bob = new Student("Bob");
//        var nelly = new Student("Nelly");
//        // Comparing objects
//        System.out.println(tim.equals(bob));
//        System.out.println(tim.compareTo(nelly) > 0);
//        System.out.println(tim); // will automatically invoke toString() method in Student class
//        System.out.println(bob.toString());

        // Instantiating OuterClass to use InnerClass:
//        OuterClass out = new OuterClass(); // will call default constructor that does not need any arguments passed
//        out.inner();
//
//        OuterClass outer = new OuterClass();
//        OuterClass.InnerClass in = out.new InnerClass(); // creating new instance of InnerClass within OuterClass
//        in.display();

        // Interfaces and instantiating Car class to create object that implements the Vehicle interface:
//        Car mazda = new Car();
//        mazda.speedUp(10);
//        mazda.changeGear(3);
//        mazda.display();
//
//        int sum = Vehicle.addition(1,2);
//        System.out.println(sum);

        // Enums: collection of constants that can be referenced
//        Level lvl = Level.LOW;
//
//        System.out.println(lvl.getLvl());
//        System.out.println(Level.valueOf("LOW"));

//        String en = lvl.toString();
//        Level[] levels = Level.values();
//        System.out.println();
//
//        for (Level a : levels) {
//            System.out.println(a);
//        }
//
//        if (lvl == Level.LOW) {
//            System.out.println(lvl);
//        } else if (lvl == Level.MEDIUM) {
//            System.out.println(lvl);
//        } else {
//            System.out.println(lvl);
//        }

//       // Rolling Die example:
//        Random randomRoll = new Random();
//        int result = randomRoll.nextInt(6) + 1;
//        System.out.println("You rolled a: " + result);

        // Nested For Loops:
//        String colors[] = {"Green", "Blue", "Lilac"};
//        for (int i = 0; i < colors.length; i++) {
//            System.out.println(colors[i]);
//        }

//        String[][] fancyColors = { {"Green", "Blue", "Lilac"},
//                                   {"Cyan", "Magenta", "Turquoise"}
//        };
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println(fancyColors[i][j]);
//            }
//        }

        // Formatting Dates in Java:
//        Date currentDate = new Date();
//        System.out.println(currentDate);
//
//        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
//        System.out.println(timeFormat.format(currentDate));
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//        System.out.println(dateFormat.format(currentDate));
//
//        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE");
//        System.out.println(dayOfWeekFormat.format(currentDate));
//
//        SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
//        System.out.println(clockFormat.format(currentDate));

        // Another while loop example:
//        String sentence = "Pandas are awesome!";
//        ArrayList<String> words = new ArrayList<String>();
//        Scanner scan = new Scanner(sentence);
//        while (scan.hasNext()) {
//            words.add(scan.next());
//        }
//        System.out.println(words);

        // Finding duplicate characters from a string:
//        String sentence = "How many duplicates are there?";
//        System.out.println(sentence);
//        String characters = "";
//        String duplicates = "";
//        for (int i = 0; i < sentence.length(); i++) {
//            String current = Character.toString(sentence.charAt(i)); // convert character into a string
//            if (characters.contains(current)) {
//                if (!duplicates.contains(current)) {
//                    duplicates += current + " ";
//                }
//            }
//            characters += current;
//        }
//        System.out.println(duplicates);

        //TAU:

        // Each store employee makes 15/hr. Write program that allows an employee to the number of hours worked for the
        // week. Do not allow overtime:

        //initialize known variables:
//        int rate = 15;
//        int maxHours = 40;
//
//        // Get input for unknown variables:
//        System.out.println("How many hours did you work this week?");
//
//        Scanner scanner = new Scanner(System.in);
//        double hoursWorked = scanner.nextDouble();
//
//        //Validate input:
//        while (hoursWorked > maxHours || hoursWorked < 1) {
//            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
//            hoursWorked = scanner.nextDouble(); // sentinel that controls flow of loop and updated to break out of loop
//        }
//
//        scanner.close();
//
//        // Calculate gross:
//        double gross = rate * hoursWorked;
//        System.out.println("Gross pay: $" + gross);

        // Do...while loop:

//        var scanner = new Scanner(System.in);
//        boolean again;
//
//        do {
//            System.out.print("Enter first number: ");
//            double num1 = scanner.nextDouble();
//
//            System.out.print("Enter second number: ");
//            double num2 = scanner.nextDouble();
//
//            double sum = num1 + num2;
//
//            System.out.println("The sum is: " + sum);
//
//            System.out.println("Would you like to start over? Enter true or false");
//            again = scanner.nextBoolean();
//        } while(again);
//
//        scanner.close();

        // For Loop:
        // Cashier program that will scan a given number of items and tally the cost:
        //Get number of items to scan:
//        System.out.println("Enter the number of items you would like to scan:");
//        var scanner = new Scanner(System.in);
//        int quantity = scanner.nextInt();
//
//        double total = 0;
//
//        //Create loop to iterate through all the items and accumulate the cost:
//        for (int i = 0; i < quantity; i++) {
//            System.out.println("Enter the cost of the item:");
//            double price = scanner.nextDouble();
//            total += price;
//        }
//        scanner.close();
//        System.out.println("Your total is: $" + total);

        // Letter Search: Program that searches a string to determine if it contains the letter 'A':
        //Get text:
//        System.out.print("Enter some text: ");
//        var scanner = new Scanner(System.in);
//        String text = scanner.nextLine();
//        scanner.close();
//
//        boolean letterFound = false;
//
//        //Search text for letter 'A':
//        for (int i = 0; i < text.length(); i++) {
//            char currentLetter = text.charAt(i);
//            if (currentLetter == 'A' || currentLetter == 'a') {
//                letterFound = true;
//                break;
//            }
//        }
//
//        if (letterFound) {
//            System.out.println("This text contains the letter 'A'.");
//        } else {
//            System.out.println("This text does not contain the letter 'A'.");
//        }

        // Nested Loops (Find avg test scores for each student in class):
//        int numOfStudents = 24;
//        int numOfTests = 4;
//
//        var scanner = new Scanner(System.in);
//
//        for (int i = 0; i < numOfStudents; i++) {
//            double total = 0;
//            for (int j = 0; j < numOfTests; j++) {
//                System.out.println("Enter the score for Test #" + (j + 1));
//                double score = scanner.nextDouble();
//                total += score;
//            }
//            double average = total/numOfTests;
//            System.out.println("The test average for Student #" + (i + 1) + " is " + average);
//        }
//        scanner.close();

        // Method asks user for their name, and greets them by their name:
//        System.out.print("Please enter your name: ");
//        var scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//
//        greetUser(name);
        // Instant credit check:
//        double salary = getSalary();
//        int creditScore = getCreditScore();
//        scanner.close();
//        //check if user is qualified:
//        boolean qualified = isUserQualified(salary, creditScore);
//        //notify the user
//        notifyUser(qualified);

        // Convert decimal to int, wrapper class example from primitive double type to Double class/object data type
        // to access intValue() method available from Double class/obj:
        double[] numbers = { 1.1, 2.2, 3.3, 4.4 };
        for (Double num: numbers) {
            System.out.println(num.intValue());
        }


    }
    // Instant credit check program:

//    public static double getSalary() {
//        System.out.println("Enter you salary: ");
//        double salary = scanner.nextDouble();
//        return salary;
//    }

//    public static int getCreditScore() {
//        System.out.println("Enter your credit score: ");
//        int creditScore = scanner.nextInt();
//        return creditScore;
//    }

//    public static boolean isUserQualified(double salary, int creditScore) {
//        if (creditScore >= requiredCreditScore && salary >= requiredSalary) {
//            return true;
//        } else {
//            return false;
//        }
//    }

//    public static void notifyUser(boolean isQualified) {
//        if (isQualified) {
//            System.out.println("Congrats, you've been approved!");
//        } else {
//            System.out.println("Sorry, you've been declined.");
//        }
//    }
    // method greet person by name:
//    public static void greetUser(String name) {
//        System.out.println("Hi there, " + name);
//    }
    // method that prints age
//    public static void displayAge(int age, int x) {
//        for (int i = 0; i < x; i++) {
//            System.out.println("I am " + age + "!");
//        }
//    }
//
//    public static int addNumbers(int a, int b) {
//        return a + b;
//    }

    // method that prints a string to the console (template literal/string interpolation) of person introducing self
    // by name and age based on values passed for each corresponding parameters:
//    public static void introducePerson(String name, Integer age) {
//        System.out.println(String.format("Hello, my name is %s and I'm %s.", name, age));
//    }

}
