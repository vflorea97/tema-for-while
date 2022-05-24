package com.tema13part5;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int nrImp = scan.nextInt();
        byte cifre = 0;
        while (nrImp > 0){
            nrImp /= 10;
            cifre++;
        }
        System.out.println(cifre);
    }
}
