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
public class Matrix {

    double[][] matrix;
    int rows;
    int columns;

    /**
     * default constructor
     */
    public Matrix() {
        matrix = new double[1][1];
        rows = 0;
        columns = 0;
    }

    /**
     * constructor
     *
     * @param random, to fill the matrix with random real number
     * @param ceilling, the ceilling of the random filled value
     * @param rows, number of rows
     * @param columns, number of columns
     */
    public Matrix(boolean random, int ceilling, int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new double[rows][columns];
        if (random) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = (double) (Math.random() * ceilling + 1);
                }
            }
        }
    }

    /**
     * constructor
     *
     * @param rows, number of rows
     * @param columns, number of columns
     */
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new double[rows][columns];
    }

    /**
     * whether the matrix is square matrix or not
     *
     * @return
     */
    public boolean isSquareMatrix() {
        return matrix.length == matrix[0].length;
    }

    /**
     * compute the Primary Diagonal of the Matrix
     *
     * @return
     */
    public double primaryDiagonal() {
        if (!isSquareMatrix()) {
            throw new IllegalArgumentException("This is not a square matrix.");
        } else {
            double pDiagonal = 0;
            for (int i = 0; i < matrix.length; i++) {
                pDiagonal += matrix[i][i];
            }
            return pDiagonal;
        }
    }

    /**
     * compute the Secondary Diagonal of the Matrix
     *
     * @return
     */
    public double secondaryDiagonal() {
        if (!isSquareMatrix()) {
            throw new IllegalArgumentException("This is not a square matrix.");
        } else {
            double sDiagonal = 0;
            for (int i = 0; i < matrix.length; i++) {
                sDiagonal += matrix[i][rows - i - 1];
            }
            return sDiagonal;
        }
    }
}
