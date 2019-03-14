/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeyescount;

import cardGame.Hand;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {
        
        int[] arrRolls = new int[1000];
        for (int i = 0; i < 1000; i++) {
            int count = 0;
            while (true) {
                int dice1 = (int) (Math.random() * 6) + 1;
                int dice2 = (int) (Math.random() * 6) + 1;
                count++;
                if (dice1 == 1 && dice2 == 1) {
                    arrRolls[i] = count;
                    break;
                }
            }
        }

        TextIO.putln("the average times to get snake eyes is " + ArrayEye.arr_average(arrRolls) + " under 1000 shots.");

    }
}
