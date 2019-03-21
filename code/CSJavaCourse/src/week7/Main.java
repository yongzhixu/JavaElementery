/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author 86188
 */
public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(true, 9, 5, 5);
        System.out.printf("==================\nsecondaryDiagonal of this matrix is: %1.3f \n==================\n", matrix.secondaryDiagonal());
    }

}
