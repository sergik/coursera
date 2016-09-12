package com.company;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by volkovich on 9/12/2016.
 */
public class Percolation {
    public  static final int OpenedBlock = 1;
    public static final int ClosedBlock = 0;
    public static final int FullBlock = 2;

    private int[][] map;

    public Percolation(int n){
        map = new int[n][n];
    }
    public void open(int i, int j){
        map[i][j] = Percolation.OpenedBlock;
    }

    public boolean isOpen(int i, int j){

        return map[i][j] == Percolation.OpenedBlock;
    }
    public boolean isFull(int i, int j) {
        return map[i][j] == Percolation.FullBlock;
    }

    public boolean percolates(){
        return true;
    }

    public static void main(String[] args) {
        StdOut.println("Test msg");
    }
}
