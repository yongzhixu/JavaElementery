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
public class Derived extends Base {

    public Derived() {
        System.out.println("week1.Derived.<init>():"+ this.getValue());
        addValue();
    }

    void addValue() {
        value += 20;
    }

}
