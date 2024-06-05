
package com.example;

public class Student {
    // Private instance variables
    private String name;
    // Implement age
    private int age;
    // Implement count
    public static int count = 0;

    // Constructor that initializes the name and age
    public Student(String name, int age) {
        this.name = name;
        // Initialize age
        this.age = age;
        count=count+1;
    }
        // Increment the student count
    
    

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Implement getter for age

    // Implement setter for age

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Implement static function to get the student count
    public static int getStudentCount() {
        return count;
    }

    // Implement object function to display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

}