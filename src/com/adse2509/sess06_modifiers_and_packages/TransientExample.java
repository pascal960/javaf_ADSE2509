package com.adse2509.sess06_modifiers_and_packages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Java program to demonstrate the 'transient' keyword/modifier to prevent the
 * user's password from being serialised.
 *
 * @author Pascal
 */
public class TransientExample
{
    public static void main(String[] args)
    {
        User user1 = new User("matthew", "matthewmuindi@gmail.com", "8uujdgt");

        // Display the details of the user before serialisation
        System.out.println("user1's details before serialisation:\n" + user1);

        // Serialise the user1 object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user1.txt")))
        {
            oos.writeObject(user1);
        }
        catch (IOException ioe)
        {
            System.err.println("The error:\n" + ioe.getLocalizedMessage());
        }

        // Modify the object's password
        user1.password = "n3wEas1erp@$s";

        // Deserialize the object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user1.txt")))
        {
            User deserialisedUser = (User) ois.readObject();

            // Display the details after deserialisation
            System.out.println("user1's details after deserialisation:\n" + deserialisedUser);
        }
        catch (IOException | ClassNotFoundException e)
        {
            System.err.println("The error:\n" + e.getLocalizedMessage());
        }
    }
}

class User implements Serializable
{
    String username;
    String email;

    // This field will not be serialized
    transient String password;

    public User(String username, String email, String password)
    {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString()
    {
        return String.format(
            """
            -------------------------------------------------------------
            Username: %s,
            Email: %s,
            Password: %s
            -------------------------------------------------------------
            """,
            username,
            email,
            password
        );
    }
}