package com.adse2509.sess05_arrays_and_strings;

import com.adse2509.sess04_classes_objects_and_methods.Person;
import java.util.ArrayList;

/**
 * Java program to demonstrate the ArrayList class and some of its
 * methods.
 *
 * @author Pascal
 */
public class PersonArrayList
{
    // Instance method to display person details
    public void displayPerson(ArrayList<Person> person)
    {
        System.out.println("The persons in the list are:");

        System.out.printf("%-12s %-7s %-3s%n", "Name", "Gender", "Age");

        // Use the for-each loop to display each person's details
        for (Person p : person)
        {
            System.out.println(p);
        }

        // Display the number of people in the person ArrayList
        System.out.println("The number of persons in the list is: "
                + person.size());
    }

    public static void main(String[] args)
    {
        // Create an ArrayList of persons
        ArrayList<Person> psn = new ArrayList<>();

        // Create an object of the PersonArrayList class
        PersonArrayList pl = new PersonArrayList();

        // Add persons to the psn ArrayList
        psn.add(new Person("Jon", 'M', (byte) 22));
        psn.add(new Person("Claire", 'F', (byte) 19));
        psn.add(new Person("Mary", 'F', (byte) 32));
        psn.add(new Person("Johnson", 'M', (byte) 44));
        psn.add(new Person("Joe", 'M', (byte) 25));
        psn.add(new Person("Sally", 'F', (byte) 21));

        // Display the above details
        pl.displayPerson(psn);

        // Add more persons to the list
        System.out.println("Adding 2 more persons...");

        psn.add(new Person("Sadik", 'M', (byte) 27));
        psn.add(new Person("Jane", 'F', (byte) 22));

        // Display all the persons in the list
        pl.displayPerson(psn);

        // Add and remove a person from a specific index in the list
        psn.add(2, new Person("Arya", 'F', (byte) 28));
        psn.remove(1); // Remove Claire

        System.out.println(
                "After adding 'Arya' and removing 'Claire' we get..."
        );

        pl.displayPerson(psn);
    }
}
