package com.tema13part5;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nrImp = scan.nextInt();
        int prodNrImp = 1;
        while (nrImp > 0){
            int n2 = nrImp % 10;
            if (n2 % 2 != 0){
                prodNrImp *= n2;
            }
            nrImp /= 10;
        }
        System.out.println(prodNrImp);

    }
}
