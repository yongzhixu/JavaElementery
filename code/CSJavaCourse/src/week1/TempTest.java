/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import static java.lang.System.out;

/**
 *
 * @author 86188
 */
public class TempTest {

    static enum Alignment {
        LEFT, RIGHT, CENTER
    }
    static String[] namelist = new String[100];

    int age;
    static int age2 = 3;

    public static void main(String[] args) {
        Student student1;
        Student student2;
        Student student3;

        student1 = new Student();
        student1.age = 10;
        student2 = student1;
        student3 = new Student();
        System.out.println(student2.age + "  " + student3.age2);

        Base b = new Derived();
        System.out.println(b.getValue());

    }
}
