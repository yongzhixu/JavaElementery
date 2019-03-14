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
public abstract class Employee {

    private int empId;
    private String name;
    private Vehicle vehicle;

    public Employee() {
        //default constructor is a constructor with zero parameter
        System.out.println("....inside default constructor");
        empId = 0;
        name = "";
    }

    public Employee(int pEmpId, String pName, Vehicle pV) {
        //a non default constructor with at least one parameter
        System.out.println("....inside non default constructor");
        empId = pEmpId;
        name = pName;
        this.vehicle = pV;
    }

    public Employee(int pEmpId, String pName, String pPlate, String pColor) {
        //a non default constructor with at least one parameter
        System.out.println("....inside non default constructor");
        empId = pEmpId;
        name = pName;
        this.vehicle = new Vehicle(pPlate, pColor);
    }

    public abstract double calculatePay();

    /**
     * @return the empId
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * @param empId the empId to set
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
