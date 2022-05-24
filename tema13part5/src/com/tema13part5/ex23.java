package com.tema13part5;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nr = scan.nextInt();
        int nr9 = 0;
        while (nr > 0){
            Scanner scan1 = new Scanner(System.in);
            int nrInt = scan1.nextInt();
            int sum = 0;
            while (nrInt > 0){
                int n2 = nrInt % 10;
                sum += n2;
                nrInt /= 10;
            }
            if (sum % 9 == 0) {
                nr9++;
            }
            nr--;
        }
        System.out.println(nr9);
    }
}
