/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.io.*;
import static java.lang.Math.*;

/**
 *
 * @author 86188
 */
public class myStuff {

    static int num1 = 0;
    int num2;

    public static void main(String a[]) throws Exception {

        myStuff s1 = new myStuff();
        s1.num1 = 5;
        s1.num2 = 10;
        myStuff s2 = new myStuff();
        s2.num1 = 15;
        s2.num2 = 15;
        System.out.println("s1 num1=" + s1.num1 + " num2 =" + s1.num2 + " s2 num1=" + s2.num1 + " num2 =" + s2.num2);

    }
}
