package com.tema13part5;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nrImp = scan.nextInt();
        int cfrImp = 0;
        while (nrImp > 0){
            int n2 = nrImp % 10;
            if (n2 > cfrImp && n2 % 2 != 0){
                cfrImp = n2;
            }
            nrImp /= 10;
        }
        System.out.println(cfrImp);
    }
}
