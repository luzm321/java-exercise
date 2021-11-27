package com.luzjavapractice;

public class Student implements Comparable<Student> {
    // implementing interface to compare objects
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public boolean equals(Student other) {
        if (this.name == other.name) {
            return true;
        } else {
            return false;
        }
    }
    // method returns int value saying how far away both objects are when compared
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return "Student(" + this.name + ")";
    }
}
