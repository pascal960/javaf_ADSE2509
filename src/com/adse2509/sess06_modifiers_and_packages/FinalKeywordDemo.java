package com.adse2509.sess06_modifiers_and_packages;

/**
 * Java program to demonstrate the 'final' keyword.
 *
 * @author Pascal
 */
public class FinalKeywordDemo
{
    public static void main(String[] args)
    {
        // 1. Demonstrate the final field
        System.out.println("==== 1. Final Field Demo ====");

        Person person = new Person(30, "Jane Mutisya");

        System.out.println(person);

        // Try to reassign Jane's ID number
        // person.id = 21; // Will not compile because id is final

        // We can change Jane's age
        person.setAge(24);

        System.out.println("After Jane's birthday:");
        System.out.println(person);

        // 2. Demonstrate the subclass
        System.out.println("==== 2. Employee Demo ====");

        Employee emp = new Employee(101, 50000.0, "Alice");
        emp.setAge(25);

        System.out.println(emp);

        // 3. Demonstrate the final class
        System.out.println("==== 3. Final Class Demo ====");

        MathUtils.add(20, 10);
        MathUtils.multiply(5, 8);
    }
}

/**
 * Class with a final field.
 */
class Person
{
    private final int id;
    private String name;
    private int age;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
        this.age = 0;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return String.format(
            """
            ID No.: %d
            Name  : %s
            Age   : %d
            """,
            id, name, age
        );
    }
}

/**
 * Employee class extending Person.
 */
class Employee extends Person
{
    private double salary;

    public Employee(int id, double salary, String name)
    {
        super(id, name);
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return String.format(
            """
            ID No.: %d
            Name  : %s
            Age   : %d
            Salary: %.2f
            """,
            getId(),
            getName(),
            getAge(),
            salary
        );
    }
}

/**
 * Final class - cannot be subclassed.
 * Examples in Java API: String, Integer, Double
 */
final class MathUtils
{
    // Static final field (constant)
    public static final double PI = 3.14159265359;

    // Utility methods
    public static void add(int a, int b)
    {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void multiply(int a, int b)
    {
        System.out.println(a + " x " + b + " = " + (a * b));
    }
}