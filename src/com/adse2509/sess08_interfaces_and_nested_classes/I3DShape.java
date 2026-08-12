/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.adse2509.sess08_interfaces_and_nested_classes;

/**
 *
 * the {@code I3D shape } interface represents a three  dimensional geometric shap. it
 * defines a contract for calculating the surface area and volume of the shape that implements it .
 * Any class implementing this interface must provide its own implementation of the
 * {@link #calcSurfaceArea()}, and the {@link #calcVolume()} methods.
 * 
 * @author pascal
 * @version 1.0
 */
public interface I3DShape
{
   /** Calculates the surface area of the 3-D shape as a {@code float}
     * 
     * @return the surface area of the 3-D shape as a {@code float}. the  surface area is 
     * typically expressed in square units (eg, square cm , or feet)
     */ 
   public float calcSurfaceArea();
   
   /**
   * Calculates the volume of the shape as a {@code float}
   * 
   * @return the volume of the 3-d shape as a {@code float .the volume is typically 
   * expressed in cubic unit(eg. cubic cm, or feet).
   */
   public float calcVolume();
}
