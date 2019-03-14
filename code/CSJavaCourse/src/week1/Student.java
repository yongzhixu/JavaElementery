/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author 86188
 */
public class Student {

    int age;
    static int age2 = 3;
    static double interestRate;
//    interestRate  = 0.06;

    static double count=2;
    
    

    public static void main(String[] args) {
        count = 40;
        Student student1;
        Student student2;
        Student student3;

        student1 = new Student();
        student1.age = 10;
        student2 = student1;
        student3 = new Student();
        System.out.println(student2.age + "  " + student3.age2);

        String s1 = new String("Welcome to Java!");
        String s2 = new String("Welcome to Java!");

        if (s1 == s2) {
            System.out.println("s1 and s2 reference to the same String object");
        } else {
            System.out.println("s1 and s2 reference to different String objects");
        }

        int x =1,y =1;
        if (x > 0) {
            if (y > 0) {
                x++;
            } else {
                y++;
            }
        }
    }
}
