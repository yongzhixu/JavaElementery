package fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;
import snakeyescount.TextIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yong
 */
public class file_dat {

    /**
     * 
     * @param filePath
     * @return 
     */
    public ArrayList<String> readat2arrlist_textIO(String filePath) {
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
     * @param filePath
     * @return
     */
    public ArrayList<String> readat2arrlist_buffer(String filePath) {
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
    private ArrayList<String> readat2arrlist_scanner(String filepath) {
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

    /**
     *
     * @param filePath
     * @return
     */
    public ArrayList<String> readat2arrlist_inputstream(String filePath) {
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

    /**
     *
     * @param filePath
     * @return
     */
    public ArrayList<String> readat2arrlist_randomacess(String filePath) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            File file = new File(filePath);
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
