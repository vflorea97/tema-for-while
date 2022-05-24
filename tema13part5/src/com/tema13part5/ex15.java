package com.tema13part5;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nrImp = scan.nextInt();
        int nrOgld = 0;
        int nrParUlt = 0;
        while (nrImp > 0){
            int n2 = nrImp % 10;
            nrOgld = nrOgld * 10 + n2;
            nrImp /= 10;
        }
        while (nrOgld > 0){
            int x = nrOgld % 10;
            if (x % 2 == 0){
                nrParUlt = x;
            }
            nrOgld /= 10;
        }
        System.out.println(nrParUlt);
    }
}
