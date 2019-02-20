/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1_test;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ARRARY {

    public static void main(String[] args) {
        double[][] profit;
        profit = new double[5][12];
        System.out.println(profit[1].length);

        int[] numbers;  // An array for storing the input values.
        int count;      // The number of numbers saved in the array.
        int num;        // One of the numbers input by the user.
        int i;          // for-loop variable.

        numbers = new int[100];   // Space for 100 ints.
        count = 0;                // No numbers have been saved yet.

        Scanner std = new Scanner(System.in);
        System.out.println("Enter up to 100 positive integers; enter 0 to end.");

        while (true) {   // Get the numbers and put them in the array.
            System.out.print("? ");
            num = std.nextInt();
            if (num <= 0) {
                // Zero marks the end of input; we have all the numbers.
                break;
            }
            numbers[count] = num;  // Put num in position count.
            count++;  // Count the number
        }

        System.out.println("\nYour numbers in reverse order are:\n");

        for (i = count - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
