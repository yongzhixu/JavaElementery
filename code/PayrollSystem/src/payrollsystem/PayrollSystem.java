/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

import java.util.ArrayList;
import java.util.Scanner;

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
        ArrayList<Employee> arrEmp = new ArrayList<>();
        String varCont = "N";
        byte menuOption = 0;
        do {
            menuOption = showMenu();
            switch (menuOption) {
                case 1:
                    FullTime ft;
                    ft = readNewFullTime();
                    addEmployee(arrEmp, ft);
                    break;
                case 2:
                    PartTime pt;
                    pt = readNewPartTime();
                    addEmployee(arrEmp, pt);
                    break;
                case 3:
                    calPayroll(arrEmp);
                    break;
                default:
                    break;
            }
        } while (menuOption != 4);

    }

    public static byte showMenu() {
        byte menuOption = 0;
        Scanner kbd = new Scanner(System.in);
        System.out.println(""
                + "/* *********************************/"
                + "\n/*1. Add FullTime                  "
                + "\n/*2. Add PartTime                  "
                + "\n/*3. Calculate PayRoll             "
                + "\n/*4. Exit                          "
                + "\n/* ********************************/");
        System.out.println("Input: ");
        menuOption = kbd.nextByte();
        return menuOption;
    }

    public static FullTime readNewFullTime() {
        int id = 0;
        String name = null;
        double sal = 0.0;
        double hourAndHalf = 0.0;
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter Id: ");
        id = kbd.nextInt();
        System.out.println("/nEnter Name: ");
        name = kbd.next();
        System.out.println("/nEnter Salary: ");
        sal = kbd.nextDouble();
        System.out.println("/nEnter Bonus: ");
        hourAndHalf = kbd.nextDouble();

        FullTime fullTime = new FullTime(id, name, sal, hourAndHalf, getVehicle());

        return fullTime;
    }

    public static Vehicle getVehicle() {

        Scanner kbd = new Scanner(System.in);
        String hasVehicle = "N";
        System.out.println("\n Does this employee has a vehicle? Y/N : \n Input : ");
        hasVehicle = kbd.next();
        if (hasVehicle.equalsIgnoreCase("Y")) {

            System.out.println("/nEnter Vehicle Plate: ");
            String auxPlate = kbd.next();
            System.out.println("/nEnter Vehicle Color: ");
            String auxColor = kbd.next();
            return new Vehicle(auxPlate, auxColor);
        } else {
            return null;
        }
    }

    public static PartTime readNewPartTime() {

        int id = 0;
        String name = null;
        double sal = 0.0;
        double hourWorked = 0.0;
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter Id: ");
        id = kbd.nextInt();
        System.out.println("/nEnter Name: ");
        name = kbd.next();
        System.out.println("/nEnter Salary: ");
        sal = kbd.nextDouble();
        System.out.println("/nEnter Number of Hours Worked: ");
        hourWorked = kbd.nextDouble();
        Vehicle vehicle = getVehicle();
        PartTime partTime = new PartTime(id, name, sal, hourWorked, vehicle);
        return partTime;
    }

    public static void addEmployee(ArrayList<Employee> pArrEmp, Employee pEmp) {
        pArrEmp.add(pEmp);
    }

    public static void calPayroll(ArrayList<Employee> pArrEmp) {
        double totalCompanyPay = 0.0;
        double individualPay = 0.0;

        for (int i = 0; i < pArrEmp.size(); i++) {
            System.out.println("\n***************************");
            individualPay = (pArrEmp.get(i)).calculatePay();
            String hasVehicle = null;
            Vehicle vehicle = (pArrEmp.get(i)).getVehicle();
            if (vehicle == null) {
                hasVehicle = "No";
            } else {
                hasVehicle = "Yes";
            }
            System.out.println("Employee Name: " + (pArrEmp.get(i)).getName());
            System.out.println("Has Vehicle: " + hasVehicle);
            if (vehicle != null) {
                System.out.println("Vehicle Plate: " + vehicle.getPlateNumer());
                System.out.println("Vehicle Color: " + vehicle.getColor());
            }
            System.out.println("Take Home Pay: " + individualPay);
            totalCompanyPay += individualPay;
        }
        System.out.println("-------------\nTotal payroll of the company: " + totalCompanyPay);

    }

}
