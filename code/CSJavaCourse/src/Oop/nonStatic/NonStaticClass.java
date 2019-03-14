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
public class NonStaticClass {

    static Student std, std1;

    static void change(Student s) {
        s.name = "f";
    }

    static void changeStr(String s) {
        s = "changeStr";
    }

    public static void main(String[] args) {
        std = new Student();
        System.out.println("Oop.nonStatic.NonStaticClass.main()" + std.name);
        change(std);
        System.out.println("Oop.nonStatic.NonStaticClass.main()" + std.name);

        String str = "a";
        System.out.println("Oop.nonStatic.NonStaticClass.main()" + str);
        changeStr(str);
        System.out.println("Oop.nonStatic.NonStaticClass.main()" + str);

        String str2 = str;
        String str3 = "a";

        System.out.println(str2 == str);
        System.out.println(str3 == str);
        System.out.println(str3 == str2);

    }

}
