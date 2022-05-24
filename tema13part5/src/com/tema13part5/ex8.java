package com.tema13part5;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int nrImp = scan.nextInt();
        Scanner scan1 = new Scanner (System.in);
        int cifra = scan1.nextInt();
        int sumCif = 1;
        while (nrImp > 0){
            int n2 = nrImp % 10;
            if (n2 != cifra){
                sumCif *= n2;

            }
            nrImp /= 10;
        }
        System.out.println(sumCif);
    }
}
