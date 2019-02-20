/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1_test;

import sun.print.resources.serviceui;

/**
 *
 * @author Asus
 */
public class control_s_test {

    double e = 2.324234e23;

    enum Season {
        SPRING, SUMMER, FALL, WINTER
    }

    public static void main(String[] args) {

        String str = "hello there";
        Season voSeason = Season.FALL;
//        System.out.println("week1_test.control_s_test.main()"+ voSeason);        
        System.out.println("===== " + str.valueOf(true));
        System.out.println("===== " + String.valueOf(123));

    }

}
