package com.tema13part5;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nrImp = scan.nextInt();
        int sumNr = 0;
        while (nrImp > 0){
            int n2 = nrImp % 10;
            sumNr += n2;
            nrImp /= 10;
        }
        System.out.println(sumNr);
    }
}
