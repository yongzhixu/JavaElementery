/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit6;

/**
 *
 * @author 86188
 */
class Box {
 
   double width;
   double height;
   double depth;
 
   // This is an empty constructor
   Box() {
          ;
   }
 
   Box(double w, double h, double d) {
          width = w;
          height = h;
          depth = d;
   }
 
   void getVolume() {
          System.out.println("Volume is : " + width * height * depth);
   }
}