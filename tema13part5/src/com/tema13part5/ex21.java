package com.tema13part5;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nr = scan.nextInt();
        int nr2 = nr;
        int nrMare = 0;
        int nrOri = 0;
        while (nr > 0) {
            int n2 = nr % 10;
            if (n2 > nrMare) {
                nrMare = n2;
            }
            nr /= 10;
        }
        while (nr2 > 0){
            int n3 = nr2 % 10;
            if (n3 == nrMare) {
                nrOri++;
            }
            nr2 /= 10;
        }
        System.out.println(nrOri);
    }
}
