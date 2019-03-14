/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class PayrollSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private FullTime readNewFullTime() {
        Vehicle vehicle = new Vehicle();
        FullTime fullTime = new FullTime(0, "", 0, 0, vehicle);
        return fullTime;
    }

    private PartTime readNewPartTime() {
        Vehicle vehicle = new Vehicle();
        PartTime partTime = new PartTime(0, "", 0, 0, vehicle);
        return partTime;
    }

    private void addEmployee(ArrayList<Employee> pArrEmp, Employee pEmp) {
    }

    private void calPayroll(ArrayList<Employee> pArrEmp) {
    }

    private byte showMenu() {
        return 'd';
    }

    private Vehicle getVehicle() {
        Vehicle vehicle = new Vehicle();
        return vehicle;
    }

}
