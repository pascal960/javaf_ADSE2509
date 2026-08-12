package com.adse2509.sess08_interfaces_and_nested_classes;
 
/**
* Java program to demonstrate the following nested classes
*     1. Inner Class
*     2. Local Class
*     3. Anonymous Class 
* 
* @author a.nyanjui
* @version 1.0
*/
public class NestedClasses
{
 
     /*
     * ------------------------------------------------------------
     * Instance variable belonging to the outer class.
     * An inner class has direct access to this variable.
     * ------------------------------------------------------------
     */
    private String college = "Edulink International College Nairobi";
 
    /*
     * ============================================================
     * INNER CLASS
     * ============================================================
     *
     * An inner class is declared inside another class, but outside
     * any method.
     *
     * Characteristics:
     *  - Has access to all members of the outer class.
     *  - Requires an object of the outer class before it can be
     *    instantiated.
     */
    class Student 
    {
 
        private String name;
 
        /**
         * Constructor
         *
         * @param name Name of the student.
         */
        public Student(String name) 
        {
            this.name = name;
        }
 
        /**
         * Displays information about the student.
         */
        public void displayDetails() 
        {
            System.out.println("----- INNER CLASS -----");
            System.out.println("Student Name : " + name);
 
            // Accessing the outer class variable directly.
            System.out.println("College   : " + college);
            System.out.println();
        }
    }
 
    /*
     * ============================================================
     * METHOD DEMONSTRATING A LOCAL CLASS
     * ============================================================
     *
     * A local class is declared inside a method.
     *
     * Characteristics:
     *  - Exists only within that method.
     *  - Cannot be accessed outside the method.
     *  - Can access local variables that are final or effectively
     *    final.
     */
    public void demonstrateLocalClass() 
    {
 
        String module = "Java Fundamentals Programming";
        String lecturer = "Mr. Nyanjui Arthur";
 
        /*
         * Local Class
         */
        class Lecturer 
        {
 
            public void teach() 
            {
                System.out.println("----- LOCAL CLASS -----");
                System.out.println("Teaching module : " + module);
                System.out.println("Institution      : " + college);
                System.out.println("Lecturer        : " + lecturer);
                System.out.println();
            }
        }
 
        // Creating an object of the local class.
        Lecturer l1 = new Lecturer();
        l1.teach();
    }
 
    /*
     * ============================================================
     * METHOD DEMONSTRATING AN ANONYMOUS CLASS
     * ============================================================
     *
     * An anonymous class has no name.
     *
     * It is normally used when only one object is required and the
     * class will not be reused elsewhere.
     */
    public void demonstrateAnonymousClass() 
    {
 
        /*
         * Interface used for demonstration.
         */
        Greeting greeting = new Greeting() 
        {
 
            /*
             * Implementation of the interface method.
             */
            @Override
            public void sayHello() 
            {
 
                System.out.println("----- ANONYMOUS CLASS -----");
                System.out.println("Welcome to " + college + "!");
                System.out.println();
            }
        };
 
        // Execute the anonymous class method.
        greeting.sayHello();
    }
 
    /**
     * main method begins program execution.
     */
    public static void main(String[] args) 
    {
 
        // Create the outer class object.
        NestedClasses demo = new NestedClasses();
 
        /*
         * --------------------------------------------------------
         * Demonstrating an Inner Class
         * --------------------------------------------------------
         */
 
        // An inner class object requires an outer class object.
        Student student = demo.new Student("Abigail Mueni");
        student.displayDetails();
 
        /*
         * --------------------------------------------------------
         * Demonstrating a Local Class
         * --------------------------------------------------------
         */
        demo.demonstrateLocalClass();
 
        /*
         * --------------------------------------------------------
         * Demonstrating an Anonymous Class
         * --------------------------------------------------------
         */
        demo.demonstrateAnonymousClass();
    }
}
 
/*
* ================================================================
* Interface used for the Anonymous Class example.
* ================================================================
*/
interface Greeting {
 
    /**
     * Displays a greeting.
     */
    void sayHello();
}