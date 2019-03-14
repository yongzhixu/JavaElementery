/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oop.nonStatic;

/**
 *
 * @author 86188
 */
public class Student {

    public String name;  // Student's name.
    public double test1, test2, test3;   // Grades on three tests.

    public double getAverage() {  // compute average test grade
        return (test1 + test2 + test3) / 3;
    }
}
