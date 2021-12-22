package Polymorphism;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky); // Though rocky obj is of type Dog, can pass it to feed() method because of polymorphism, because
        // method accepts the superclass of Animal it means you can pass an Animal object, or any subclass of Animal
        // Cindy is of type animal, but an instance of a dog to demonstrate polymorphism:
        Animal cindy = new Dog(); // because cindy is of type Animal, obj has no access to the fetch method belonging
        // to the Dog class, but can mitigate by typecasting
        ((Dog) cindy).fetch(); // casting obj from Animal type to Dog type to access fetch() method only available to
        // Dog class
        cindy.makeSound(); // the overridden makeSound() method will be invoked from Dog class, not Animal class
        // Below also demonstrates polymorphism, cindy's type is redefined into the Cat class from a Dog instantiation
        // to a Cat instantiation, this is possible because both Cat and Dog subclasses are of type Animal who inherit
        // from the Animal the superclass
        feed(cindy);
        cindy = new Cat();
        cindy.makeSound(); // because cindy is of type Animal, object does not have access to scratch method belonging
        // to the Cat class, but can mitigate by typecasting:
        ((Cat) cindy).scratch(); // casting obj from Animal type to Cat type to access scratch() method only available
        // to Cat class. Type casting does not change the overall object. Cindy is still of type Animal, but it's saying
        // that in this specific call above, go ahead and make cindy of type Cat just so that scratch() method can be
        // executed. This is the same logic as example above regarding type casting cindy from Animal to dog class
        // as well just to execute fetch() method.
        feed(cindy);
    }

    public static void feed(Animal animal) {
        if (animal instanceof Dog) { // check to see if animal is an instance of Dog
            System.out.println("Here's your dog food.");
        } else if (animal instanceof Cat) {
            System.out.println("Here's your cat food.");
        }
    }
}

/* Key points of Polymorphism:
1. An object can have a superclass type and a subclass instance
2. Polymorphic objects can only access the methods of their type (not their instance). Casting is required in order to
access the methods of their instance.
3. If a method is overridden by the subclass, the polymorphic object will execute the overridden method at runtime
4. The instance of operator is used to determine if an object is an instance of a certain class
* */
