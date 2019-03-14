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
public class MatchBox extends Box {

    private double weight;
    private static double density = .03611;

    public MatchBox() {
    }
    
    public MatchBox(double w, double h, double d) {
        super(w, h, d);
    }

    @Override
    void getVolume() {
        this.calculateWeight();
        System.out.println("width of MatchBox is : " + this.width);
        System.out.println("height of MatchBox is : " + this.height);
        System.out.println("depth of MatchBox is : " + this.depth);
        System.out.println("weight of MatchBox is : " + this.weight);
        super.getVolume(); //To change body of generated methods, choose Tools | Templates.
    }

    void calculateWeight() {
        this.weight = density * this.height * this.width * this.depth;
    }

}
