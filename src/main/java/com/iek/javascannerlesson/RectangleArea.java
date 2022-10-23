/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package com.iek.javascannerlesson;

import java.util.Scanner;

/**
 *
 * @author Spyros
 */


/**
 *  This program demonstrates keyboard input.
 */
public class RectangleArea
{
   public static void main(String[] args)
   {
      int length;    // To hold rectangle's length.
      int width;     // To hold rectangle's width.
      int area;      // To hold rectangle's area


      

// Create a Scanner object to read input.
      Scanner console = new Scanner(System.in);

      // Get length from the user.
      System.out.println("Enter length ");
      length= console.nextInt();
        System.out.println("you entered as length: "+(length));
      // Get width from the user.
      System.out.println("Enter width ");
      width = console.nextInt();
              System.out.println("you entered as width: "+(width));
      // Calculate area.
      area = length * width;

      // Display area.
      System.out.println("The area of rectangle is " + area);
   }
}
