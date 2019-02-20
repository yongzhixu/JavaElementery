
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1_test;

import java.util.Arrays;
import snakeyescount.ArrayEye;

/**
 *
 * @author Asus
 */
public class loops {

    public static void main(String[] args) {
        int count = 0;
        while (true) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            count++;
            if (dice1 == 1 && dice2 == 1) {
                System.out.println("it takes " + count + " times of dicing before snake eyes appears");
                break;
            }
        }

        int sum = 0;
        int[] ar = new int[10000000]; //define int array 
        for (int i = 0; i < ar.length; i++) {
//            assign random integer (0--20) to each item
            ar[i] = (int) (Math.random() * 21);
        }

        final long startTime = System.currentTimeMillis();
        for (int slot : ar) {
            sum += slot;
        }
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time for for each loop: " + (endTime - startTime));

        sum = 0;
        final long startTimeFor = System.currentTimeMillis();
        for (int i = 0; i < ar.length; i++) {
            sum+=ar[i];
        }
        final long endTimefor = System.currentTimeMillis();
        System.out.println("Total execution time for for loop: " + (endTimefor - startTimeFor));        
        System.out.println("sum of ar is: " + sum);


        for (int i = 0; i < ar.length; i++) {
//            assign random integer (0--20) to each item
            ar[i] = (int) (Math.random() * 21);
        }

        int maxtemp = ar[0];
//        find the maximum of this int array
        for (int slot : ar) {
            if (maxtemp < slot) {
                maxtemp = slot;
            }
        }
        System.out.println("the maximum of the int arr is: " + maxtemp);

    }

}
