package com.tema13part5;

import java.util.Scanner;

public class ex44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte nr = scan.nextByte();
        int nrPar = 0;
        while (nr > 0) {
            Scanner scan1 = new Scanner(System.in);
            int nrDat = scan1.nextInt();
            if (nrDat > 0 && nrDat % 2 == 0){
                nrPar = nrDat;
            }
            nr--;
        }
        System.out.println(nrPar);
    }
}
