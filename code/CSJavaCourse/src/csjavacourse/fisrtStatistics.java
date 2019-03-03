/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csjavacourse;

/**
 *
 * @author Asus
 */
public class fisrtStatistics {

    private static String dtStr = "5 7 12 23 3 2 8 14 10 5 9 13";

    public static void main(String[] args) {
        StatCalc myStatCalc = new StatCalc();
        String[] temp = dtStr.split(" ");
        for (int i = 0; i < temp.length; i++) {
            try {
                myStatCalc.enter(Double.parseDouble(temp[i]));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        int count = myStatCalc.getCount();
        double sum = myStatCalc.getSum();
        double mean = myStatCalc.getMean();
        double std = myStatCalc.getStandardDeviation();
        System.out.println("The count of the data set is: " + count);
        System.out.println("The sum of the data set is: " + sum);
        System.out.println("The mean of the data set is: " + mean);
        System.out.println("The standard deviation of the data set is: " + std);

    }

}
