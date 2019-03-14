/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

/**
 *
 * @author Asus
 */
public class Vehicle {
    
    private String plateNumer;
    private String color;

    public Vehicle() {
        //default constructor is a constructor with zero parameter
        System.out.println("inside default constructor");
    }
    
    
    public Vehicle(String plateNumer, String color) {
        this.plateNumer=plateNumer;
        this.color=color;
    }

    /**
     * @return the plateNumer
     */
    public String getPlateNumer() {
        return plateNumer;
    }

    /**
     * @param plateNumer the plateNumer to set
     */
    public void setPlateNumer(String plateNumer) {
        this.plateNumer = plateNumer;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
