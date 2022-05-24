package com.tema13part5;

import java.util.Scanner;

public class ex41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nrImp = scan.nextInt();
        int nrImpAp = 0;
        while (nrImp > 0) {
            if (nrImp % 2 != 0) {
                nrImpAp++;
            }
            nrImp = scan.nextInt();
        }
        System.out.println(nrImpAp);
    }
}
