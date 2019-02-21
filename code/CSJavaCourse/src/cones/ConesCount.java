/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import snakeyescount.TextIO;

/**
 *
 * @author Asus
 */
public class ConesCount {

    public static void main(String[] args) {
//        // Variable declaration
//        String flavor;
//        double numberOfIcecreams = 0;
//        double numberOfStrawberry = 0;
//
//        // Read the icecream.dat file
//        TextIO.readFile("icecream.dat");
//
//        // Running while End of File is false
//        while (TextIO.eof() == false) {
//            // Count Total number of icecreams
//            numberOfIcecreams++;
//            // Get next icecream flavor from the file
//            flavor = TextIO.getlnWord();
//            // Check if icecream flavor is Strawberry
//            if (flavor.equals("Strawberry")) // Count Total number of Strawberry icecreams
//            {
//                numberOfStrawberry++;
//            }
//        }
//        // Print results
//        TextIO.putln("The number of icecream cones is : " + numberOfIcecreams);
//        TextIO.putln("The number of Strawberry icecream cones is :" + numberOfStrawberry);
//        TextIO.putln("The percentage of Strawberry icecream cones is :" + numberOfStrawberry / numberOfIcecreams * 100);

        readcones("");
    }

    public static void readcones(String args) {
        readEye rd = new readEye();
        try {
            String filePath = System.getProperty("user.dir") + "/src/cones/data/icecream.dat";
            ArrayList<String> cones = rd.readfile2arrlist_textIO(filePath);
            int strawberry = countItem(cones, "Strawberry");
            System.out.println(cones.size() + " ice cream cones that were sold");
            System.out.println(strawberry + " of them are Strawberry");
            float percent = (float) strawberry / (cones.size());
            System.out.printf("which means %1.2f", percent * 100);
            System.out.println(" percent of all ice cream cones are Strawberry");
        } catch (Exception e) {
            System.out.println("cones.ConesCount.readcones()" + e);
        }
    }

    public static class readEye {

        /**
         *
         * @param filePath
         * @return
         */
        public ArrayList<String> readfile2arrlist_textIO(String filePath) {
            // ArrayList, bo to store the data for later purpose
            ArrayList<String> arrayList = new ArrayList<>();
            try {
                TextIO.readFile(filePath);
                while (!TextIO.eof()) {
                    arrayList.add(TextIO.getln());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return arrayList;
        }

        /**
         *
         * @param name
         * @return
         */
        public ArrayList<String> readfile2arrlist_buffer(String filePath) {
            // ArrayList, bo to store the data for later purpose
            ArrayList<String> arrayList = new ArrayList<>();
            try {
                FileReader fr = new FileReader(filePath);
                BufferedReader bf = new BufferedReader(fr);
                String str;
                // read line by line
                while ((str = bf.readLine()) != null) {
                    arrayList.add(str);
                }
                bf.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return arrayList;
        }

        /**
         *
         * @param filepath
         * @return
         */
        private ArrayList<String> readfile2arrlist_scanner(String filepath) {
            ArrayList<String> arrlist = new ArrayList<>();
            try {
                File icecream = new File(filepath);
                Scanner sc = new Scanner(icecream);
                while (sc.hasNext()) {
                    arrlist.add(sc.nextLine());
                }
            } catch (Exception e) {
            }
            return arrlist;
        }

        public ArrayList<String> readfile2arrlist_inputstream(String filePath) {
            ArrayList<String> arrayList = new ArrayList<>();
            try {
                File file = new File(filePath);
                InputStreamReader input = new InputStreamReader(new FileInputStream(file));
                BufferedReader bf = new BufferedReader(input);
                String str;
                while ((str = bf.readLine()) != null) {
                    arrayList.add(str);
                }
                bf.close();
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return arrayList;

        }

        public ArrayList<String> readfile2arrlist_randomacess(String name) {
            ArrayList<String> arrayList = new ArrayList<>();
            try {
                File file = new File(name);
                RandomAccessFile fileR = new RandomAccessFile(file, "r");
                String str = null;
                while ((str = fileR.readLine()) != null) {
                    arrayList.add(str);
                }
                fileR.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return arrayList;
        }
    }

    private static int countItem(ArrayList<String> arrayList, String column) {
        int length = arrayList.size();
        int count = 0;
        for (int i = 0; i < length; i++) {
            String s = arrayList.get(i);
            if (s.equals(column)) {
                count++;
            }
        }
        return count;
    }

}
