package com.tema13part5;

import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nNr = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < nNr; i++){
            Scanner scan1 = new Scanner(System.in);
            int nrDt = scan1.nextInt();
            int nrMax = 0;
            while (nrDt > 0) {
                int n2 = nrDt % 10;
                if (n2 > nrMax) {
                    nrMax = n2;
                }
                nrDt /= 10;
            }int nrMax1 = nrMax;
             sum += nrMax1;
        }
        System.out.println(sum);
    }
}
