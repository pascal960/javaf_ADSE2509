package com.adse2509.sess07_inheritance_and_polymorphism;

/**
 * The {@code Shape} class will be the super (parent) class of all shapes and
 * it has a name field to store the shape's name and an abstract method
 * getName() that returns the name of the shape.
 *
 * @author pascal
 */
public abstract class Shape
{
    /**
     * The name of the shape
     */
    protected String name;
    public abstract String getName();
}