/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstsubroutines;
import java.util.Scanner;

/**
 *
 * @author 86188
 */
public class firstsubroutines {

    public static void main(String[] args) {
        String strUser = "";
        String strReverse = "";
        Scanner std = new Scanner(System.in);
        try {
            System.out.println("please write down something as you like: ");
            strUser = std.nextLine();
        } catch (Exception e) {
            System.out.println("input type error, please try again.");
            strUser = std.nextLine();
        }
        std.close(); // close scanner 
        strUser = strUser.toLowerCase(); //turn input string to lowcase
        strUser = strStrip(strUser);// ommit the non letter from the string
        strReverse = strReverse(strUser); // reverse string 
        if (strReverse.equals(strUser) && !strUser.isEmpty()) {
            System.out.println("stripped: " + strUser);
            System.out.println("reversed: " + strReverse);
            System.out.println("This IS a palindrome.");
        } else {
            System.out.println("stripped: " + strUser);
            System.out.println("reversed: " + strReverse);
            System.out.println("This is NOT a palindrome.");
        }

    }

    private static String strStrip(String str) {
        String strip = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                strip += ch;
            }
        }
        return strip;
    }

    private static String strReverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
