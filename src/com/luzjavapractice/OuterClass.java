package com.luzjavapractice;

public class OuterClass {
    public class InnerClass {
        public void display() {
            System.out.println("This is an inner class...");
        }
    }
    // method creates new instance of InnerClass and print message to console
    public void inner() {
        InnerClass in = new InnerClass();
        in.display();
    }
}
