package Collections;

public class CollectionInterfaceExamples {

}

/* Collections as Data Structures:
1. A collection is an object that holds references to other objects (elements).
2. Collections itself is an interface, and other interfaces inherit from Collections
3. Types of collections:
    Set - collection that cannot contain duplicate elements and has unordered, unique elements such as a standard deck
        of 52 cards where each card is a unique element in the collection
    List - collection of elements that are ordered, can be duplicates, and accessed by position (index) such as the
        phone numbers from a call history
    Queue - collection of ordered elements for processing. Accessed in the order of elements that were added (FIFO: first
        in, first out) such as people in a checkout line at the supermarket
    Map - unordered unique key-value pairs. Not a true collection, does not inherit from Collection interface, but it
        contains collection-like operations that enable them to be utilized as a collection such as a list of bank
        transactions where each map entry has a unique transaction ID serving as the key and the value would be the
        actual transaction object
* */

/* Example of Set (HashSet, LinkedHashSet, and TreeSet are implementations of Set):
Set fruit =  new HashSet();
fruit.add("apple");
fruit.add("mango");
fruit.add("kiwi");
fruit.add("banana");
fruit.add("mango"); // duplicate not accounted

System.out.println(fruit.size()); // output is 4
System.out.println(fruit); // output is [mango, banana, kiwi, apple]

Set methods:
add (adds an object to the collection)
clear (removes all objects from collection)
contains (returns true if a specified object is an element within the collection)
isEmpty (returns true if the collection has no elements)
iterator (returns an Iterator object for the collection, which may be used to retrieve an object)
remove (removes a specified object from the collection)
size (returns the number of elements in the collection)
* */

/*  Example of List (Implementations are ArrayList, LinkedList, Stack, Vector):
List fruit =  new ArrayList();
fruit.add("apple");
fruit.add("mango");
fruit.add("kiwi");
fruit.add("banana");
fruit.add("mango");

System.out.println(fruit.get(2)); // output is kiwi
System.out.println(fruit.size()); // output is 5
System.out.println(fruit); // output is [apple, mango, kiwi, banana, mango]

List methods:
add(int index, Object obj) - inserts obj into list at position of index
addAll(int index, Collection c) - inserts all elements of c into the list at position of index
get(int index) - returns object stored at specified index
indexOf(Object obj) - returns index of element specified
lastIndexOf(Object obj) - returns index of last instance of obj in list
remove(int index) - removes element at position index and returns deleted element
set(int index, Object obj) - assigns obj to the location specified by index
subList(int start, int end) - returns a list containing elements from start to end
* */

/* Example of Queue:
Queue fruit =  new LinkedList();
fruit.add("apple");
fruit.add("mango");
fruit.add("kiwi");
fruit.add("banana");
fruit.add("mango");

System.out.println(fruit.size()); // output is 5
System.out.println(fruit); // output is [apple, mango, kiwi, banana, mango]

fruit.remove(); // don't need to specify which element or obj to remove due to FIFO rule so 1st one in queue is removed
known as the head/front (last element/obj in queue is the tail/rear)
System.out.println(fruit); // output is [mango, kiwi, banana, mango]
System.out.println(fruit.peek()); // output is mango; peak() returns the next item in the process/queue (head)

Queue methods:
add() - adds element to the tail of the queue
peek() - used to view the head of the queue without removing it. Returns false if queue is empty
element() - similar to peek but throws an exception if queue is empty
remove() - removes and returns the head of the queue; Throws exception if queue is empty
poll() - similar to remove but returns null if queue is empty
* */

/* Example of Map: Keys must be unique, values do not
Map fruitCalories =  new HashMap();
fruitCalories.put("apple", 95);
fruitCalories.put("mango", 3);
fruitCalories.put("kiwi", 105);
fruitCalories.put("banana", 45);
fruitCalories.put("mango", 21);

System.out.println(fruitCalories.size()); // output is 4
System.out.println(fruitCalories); // output is { banana=45, mango=21, kiwi=105, apple=95 } // mango value updated to 21
System.out.println(fruitCalories.get("mango")); // 21
System.out.println(fruitCalories.entrySet()); // [ banana=45, mango=21, kiwi=105, apple=95 ]
fruitCalories.remove("kiwi");
System.out.println(fruitCalories); // // output is { banana=45, mango=21, apple=95 }

Map methods: clear(), containsKey(Object key), containsValue(Object value), entrySet(), putAll(Map m),
remove(Object key), isEmpty(), keySet(), put(Object key, Object value), putIfAbsent(Object key, Object value)
* */


