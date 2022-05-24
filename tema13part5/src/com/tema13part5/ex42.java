package com.tema13part5;

import java.util.Scanner;

public class ex42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        int b = scan1.nextInt();
        int nr = 0;
        int sum = 0;
        for (int i = a; i <=b ; i++){
            if (i % 2 == 0) {
                nr++;
                sum += i;
            }
        }
        int med = sum / nr;
        System.out.println(med);
    }
}
