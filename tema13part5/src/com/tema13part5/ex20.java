package com.tema13part5;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nr = scan.nextInt();
        int nr2 = nr;
        int nrPrim = 0;
        int nrDoi = 0;
        while (nr > 0){
            nrPrim = nr % 10;
            nr /= 10;
        }
        while (nr2 > 10){
            nrDoi = nr2 % 10;
            nr2 /= 10;
        }
        System.out.println(nrPrim + nrDoi);
    }
}
