package com.tema13part5;

import java.util.Scanner;

public class ex30x {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int nrImp = scan.nextInt();
        while (nrImp > 0) {
            int sum = 0;
            int ogld = 0;
            while (nrImp > 0){
                int n1 = nrImp % 10;
                ogld = ogld * 10 + n1;
                nrImp /= 10;

            }
            for (int i = 0; i < 2; i++) {
                   int n2 = ogld % 10;
                   sum += n2;
                    ogld /= 10;

            }
            System.out.println(sum);
            nrImp = scan.nextInt();
        }
    }
}
