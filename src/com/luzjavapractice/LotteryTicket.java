package com.luzjavapractice;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6; //all caps and final signify field is a constant variable
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random(); //generate between 1 and 69
        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
            // generate random number and search to make sure it doesn't already exist in the array. If it does,
            // regenerate and search again:
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1; // bound is exclusive
            } while(search(ticket, randomNumber)); // loop until there's no duplicate in random number generated
            ticket[i] =randomNumber;
        }

        return ticket;
    }

    // below is a java doc initiated by typing /** then enter for describing method below:
    /**
     * Does a sequential search on the array to find a value
     * @param numArray array to search through
     * @param numToSearchFor value to search for
     * @return true if found, false if not found
     */
    public static boolean search(int[] numArray, int numToSearchFor) {
        // enhanced loop that iterates through the array and each time, assigns the current element to 'value':
        for (int value : numArray) {
            if (value == numToSearchFor) {
                return true; // means there's duplicate
            } // no else statement here to return false because it would get out of loop on first iteration and never go
            // to else statement
        }
        // If reached this point, then the entire array was searched and the value was not found
        return false; // means that no duplicate
    }

    // BINARY SEARCH EXAMPLE:
    public static boolean binarySearch(int[] numArray, int numToSearchFor) {
        // Array must be sorted first:
        Arrays.sort(numArray);
        int index = Arrays.binarySearch(numArray,numToSearchFor);

        // if index in array is >= 0, then number being searched is found as a duplicate
        if (index >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printTicket(int[] ticket) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }
}
