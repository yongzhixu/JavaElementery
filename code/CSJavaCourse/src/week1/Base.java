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
public class Base {

    int value = 0;

    public Base() {
        
        System.out.println("supper1:"+ this.getValue());
        addValue();
        System.out.println("supper2:"+ this.getValue());
    }

    void addValue() {
        value += 10;
    }

    int getValue() {
        return value;
    }

}
