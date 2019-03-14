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
public class PartTime extends Employee{

        
    private double rate;
    private double hoursWorked;

    public PartTime(int id, String name, double rate, double hoursWorked, Vehicle vehicle) {
        super(id, name, vehicle);
        this.rate=rate;
        this.hoursWorked=hoursWorked;
    }
    
    
    

    @Override
    public double calculatePay() {
        System.out.println("Part time employee.");
        return (this.rate * this.hoursWorked);
    }
    
    /**
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * @return the hoursWorked
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    
    
    
}
