/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author Asus
 */
import java.io.*;
import sun.management.resources.agent;

public class GravityCalculator {

    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0; // starting velocity of the object
        double fallingTime = 10.0; // time in seconds that the object falls
        double initialPosition = 1000.0; // Starting position in meters, the calculation will 		determine the ending position in meters
        double finalPosition = 0.0;
        finalPosition = .5 * gravity * Math.pow(fallingTime, 2) + initialVelocity + initialPosition;
        System.out.println("The object's position after " + fallingTime + " seconds is 			" + finalPosition + " m.");

        int N = 5;
        int D = 4;
        int A = 0;
        calcValue(N);
        System.out.println(N);
        System.out.println(lastname+age +sex);

    }

    public static String lastname; // Patient’s last name 
    public static int age; // Patient’s age on admission 
    public static boolean sex; // Indicates if patient is male or female 

    static void calcValue(int N) {
        int D;
        for (D = 0; D < 5; D++) {
            N++;
        }
    }
}
