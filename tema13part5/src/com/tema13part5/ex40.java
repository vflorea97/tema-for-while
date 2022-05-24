package com.tema13part5;

import java.util.Scanner;

public class ex40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nrImp = scan.nextInt();
        int sum = 0;
        while (nrImp > 0) {
            if (nrImp % 2 == 0) {
                sum += nrImp;
            }
            nrImp = scan.nextInt();
        }
        System.out.println(sum);
    }
}
