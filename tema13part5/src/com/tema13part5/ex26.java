package com.tema13part5;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte nre = scan.nextByte();
        int n2 = 0;
        int sum = 0;
        for (int i = 0; i < nre; i++) {
            Scanner scan1 = new Scanner(System.in);
            int nr = scan1.nextInt();
            while (nr > 0) {
                n2 = nr % 10;
                nr /= 10;
            }
            sum += n2;
        }
        System.out.println(sum);
    }
}
