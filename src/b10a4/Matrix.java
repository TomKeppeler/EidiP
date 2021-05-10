package b10a4;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    private double[][] feld;

    public Matrix(int z, int s) {
        this.feld = new double[z][s];
    }
    public Matrix(int n){
        this(n, n);
    }
    public Matrix(Matrix m){
        feld = m.feld;
    }
    public int zeilen(){
        return feld.length;
    }
    public int spalten(){
        return feld[0].length;
    }
    public double get(int z, int s){
        return feld[z][s];
    }
    public Matrix set(int z, int s, double e){
        feld[z][s] = e;
        return new Matrix(this);
    }
    public double[][] setAll(double e){
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[0].length; j++) {
                feld[i][j] = e;
            }
        }
        return feld;
    }
    public double[][] setZeile(int z, double[] f){
        for (int j = 0; j < spalten(); j++) {
            feld[z][j] = f[j];
        }
        return feld;
    }
    public double[][] setSpalte(int s, double[] f){
        for (int i = 0; i < feld.length; i++) {
            feld[i][s] = f[i];
        }
        return feld;
    }

    public boolean equals(Matrix m) {
        if(zeilen() != m.zeilen() | spalten() != m.spalten()){
            return false;
        }
        for (int i = 0; i < zeilen(); i++) {
            for (int j = 0; j < spalten(); j++) {
                if (!Mathe.equals(feld[i][j], m.feld[i][j])){
                    return false;
                }
            }
        }
        return true;
    }
    public String toString(){
        String out = "[";
        for (int i = 0; i < feld.length; i++) {
            if(feld.length - i == 1){
                out += Arrays.toString(feld[i]);
            }else {
                out += Arrays.toString(feld[i]) + ",\n";
            }
            }
        return out + "]";
    }


    public double[][] eingabe(java.util.Scanner sc){
        for (int i = 0; i < zeilen(); i++) {
            for (int j = 0; j < spalten(); j++) {
                feld[i][j] = sc.nextDouble(); //Wirft InputMismatchException wenn Eingabe nicht double
            }
        }
        return feld;
    }

    public static void main(String[] args) {
        Matrix m1 = new Matrix(3,5);
        Matrix m2 = new Matrix(new Matrix(2));
        m1.setAll(3);
        m2.setAll(3);
        m1.equals(m2);
        System.out.println(m1.toString());
    }
}
