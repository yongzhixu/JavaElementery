/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1_test;

/**
 *
 * @author 86188
 */
public class TempTest {
    public static void main(String[] args) {
        
        String test = "fas dfsdf asdff 2342%^$% 111fADDDsdf";
        System.out.println("1: "+test.replaceAll("[^a-zA-Z]", "")); // Remove all non letter
        System.out.println("2: "+test.replaceAll("[^a-z]", "")); // remove all non low case letter
        System.out.println("3: "+test.replaceAll("\\s+","")); // remove all white space
    }
}
