package com.tema13part5;

import java.util.Scanner;

public class ex37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int nrOr = scan.nextInt();
        for (int i = 0; i < nrOr; i++){
            Scanner scan1 = new Scanner (System.in);
            int nrDt = scan1.nextInt();
            int nrFin = 0;
            if (nrDt > 0) {
                int n2 = nrDt % 10;
                int ogld = 0;
                nrDt /= 10;
                while (nrDt > 0) {
                    int n3 = nrDt % 10;
                    ogld = ogld * 10 + n3;
                    nrDt /= 10;
                }int n4 = 0;
                int nrNou = 0;
                if (ogld > 0) {
                    n4 = ogld % 10;
                    ogld /= 10;
                    nrNou = ogld * 10 + n2;
                }
                while (nrNou > 0) {
                    int n5 = nrNou % 10;
                    nrFin = nrFin * 10 + n5;
                    nrNou /= 10;
                }
                if (nrFin > 0) {
                    nrFin = nrFin * 10 + n4;
                }
            }
            System.out.println(nrFin);
        }
    }
}
