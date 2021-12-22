package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Looping through collections:
public class CollectionsDemo {
    public static void main(String[] args) {
        setDemo();
        //listDemo();
        //queueDemo();
        mapDemo();
    }

    public static void setDemo() {
        Set<String> fruit = new HashSet(); // angle bracket operator specifies data type rather than generic object
        fruit.add("apple");
        fruit.add("mango");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("mango");

        System.out.println(fruit.size()); // 4
        System.out.println(fruit); // [banana, orange, apple, mango]

        // Iterator to loop through collection
        var i = fruit.iterator(); // loop through each item in collection
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // Enhanced for loop to iterate through collection:
        for (String item : fruit) {
            System.out.println(item);
        }

        // forEach method takes a lambda expression with an action // callback function:
        fruit.forEach(x -> System.out.println(x));
        //syntactic sugar shorthand:
        fruit.forEach(System.out::println);
    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap(); // use Integer wrapper class as an object type rather than int
        fruitCalories.put("apple", 95);
        fruitCalories.put("mango", 10);
        fruitCalories.put("banana", 50);
        fruitCalories.put("orange", 105);
        fruitCalories.put("mango", 21);

        System.out.println(fruitCalories.size()); // 4
        System.out.println(fruitCalories); // { banana=50, orange=105, apple=95, mango=21 }
        System.out.println(fruitCalories.get("mango")); // 21
        System.out.println(fruitCalories.entrySet()); // [ banana=50, orange=105, apple=95, mango=21 ]
        fruitCalories.remove("orange");
        System.out.println(fruitCalories); // { banana=50, apple=95, mango=21 }

        // Looping through map:
        //enhanced for loop:
        for (var entry : fruitCalories.entrySet()) {
            System.out.println(entry.getValue()); // entry is a map of a String and integer
        }

        // forEach method:
        fruitCalories.forEach((k, v) -> System.out.println("Fruit: " + k + ", Calories: " + v));
    }
}
