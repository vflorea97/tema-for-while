package com.tema13part5;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int nr = scan.nextInt();
        int nrOri = 0;
        int nrUlt = nr % 10;
        while (nr > 0) {
            int n2 = nr % 10;
            if (n2 == nrUlt) {
                nrOri++;
            }
            nr /= 10;
        }
        System.out.println(nrOri);
    }
}
