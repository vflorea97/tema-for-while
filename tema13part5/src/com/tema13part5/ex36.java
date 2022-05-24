package com.tema13part5;

import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
    Scanner scan2 = new Scanner(System.in);
    int nrN = scan2.nextInt();
    int sum = 0;
    for (int i = 0; i < nrN; i++){
        Scanner scan1 = new Scanner(System.in);
        int nrDt = scan1.nextInt();
        if (nrDt > 0) {
            int n2 = nrDt % 10;
            nrDt /= 10;
            int ogld = 0;
            while (nrDt > 0) {
                int n3 = nrDt % 10;
                ogld = ogld * 10 + n3;
                nrDt /= 10;
            }
            int nrNou = 0;
            while (ogld > 0) {
                int n4 = ogld % 10;
                if (n4 != n2) {
                    nrNou = nrNou * 10 + n4;
                }
                ogld /= 10;
                }
            sum += nrNou;
            }
        }
        System.out.println(sum);
    }
}
