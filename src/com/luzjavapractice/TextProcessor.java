package com.luzjavapractice;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I'm learning Java for work.");
        reverseString("Hello!");
        addSpaces("HeyWorld!It'sMeLuz.");
    }

    /**
     * Splits a string into an array by tokenizing it
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text) {
        var words = text.split(" ");
        int numOfWords = words.length;
        String message = String.format("Your text contains %d words:", numOfWords); // string interpolation/concatenation
        System.out.println(message);

        for (int i = 0; i < numOfWords; i++) {
            System.out.println(words[i]);
        }
    }

    /**
     * Prints a string in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    /**
     * String builder Example which allows us to modify strings, as otherwise a String is immutable
     * Adds spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);
        for (int i = 0; i < modifiedText.length(); i++) {
            // if i is not the first letter in the string, and it is in uppercase, add a space
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " "); // insert a space at current position in loop
                i++; // increment i so that it will go on to the next character
            }
        }
        System.out.println(modifiedText);
    }
}
