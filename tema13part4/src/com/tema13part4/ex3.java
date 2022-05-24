package com.tema13part4;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        byte nrNr = 5;
        byte nrMax = 0, nrMin;
        Scanner scan = new Scanner(System.in);
        byte nrImp = scan.nextByte();
        nrMin = nrImp;
        while (nrNr > 0){
            Scanner scan1 = new Scanner(System.in);
            nrImp = scan1.nextByte();
            nrNr--;
            if (nrImp >= nrMax){
                nrMax = nrImp;
            }
            if (nrImp < nrMin){
                nrMin = nrImp;
            }
        }
        System.out.println(nrMax + nrMin);
    }
}
