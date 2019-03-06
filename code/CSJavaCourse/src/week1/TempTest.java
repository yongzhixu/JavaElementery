/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import static java.lang.System.out;
import java.awt.Color;

import Graphic.GraphicDraw;
/**
 *
 * @author 86188
 */
public class TempTest {

    static enum Alignment {
        LEFT, RIGHT, CENTER
    }
    static String[] namelist = new String[100];
    
    

    
    public static void main(String[] args) {
        out.println(namelist[45]);
        out.println(Alignment.CENTER); 
        out.println(Color.RED);
        GraphicDraw d = new GraphicDraw();
        
        d.drawCircle(0);
        
        
        
        

    }
}
