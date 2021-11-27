package com.luzjavapractice;

public interface Vehicle {
    final int gears = 5; // each vehicle will have 5 gears

    void speedUp(int a);
    void slowDown(int a);
    void changeGear(int a);

    default void out() {
        System.out.println("Default method...");
    }

    static int addition(int a, int b) {
        return a + b;
    }
}
