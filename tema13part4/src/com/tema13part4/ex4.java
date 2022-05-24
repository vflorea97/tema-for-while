package com.tema13part4;

public class ex4 {
    public static void main(String[] args) {
        int nr = 10;
        int nrApr = 0;
        int sumMax = 0;
        for (int i = 1; i <= nr / 2; i++){
            nrApr++;
            sumMax = (i * 2) + 1;
        }
        System.out.println(nrApr);
        System.out.println(sumMax);
    }
}
