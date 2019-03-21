/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic;

import java.awt.Graphics;

/**
 *
 * @author Asus
 */
public class GraphicDraw {

    public void drawCircle(int n) {
        Graphics graphics;
        CircleInfo[] circleData = new CircleInfo[n];
        for (int i = 0; i < circleData.length; i++) { // create the objects
            circleData[i] = new CircleInfo(
                    (int) (100 * Math.random()),
                    (int) (100 * Math.random()),
                    (int) (100 * Math.random()));
            circleData[i].radius++;
//            circleData[i].draw(graphics);
        }
    }

}
