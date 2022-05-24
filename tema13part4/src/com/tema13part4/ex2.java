package com.tema13part4;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        byte nrNr = 4;
        byte nrImp2 = 0;
        Scanner scan1 = new Scanner(System.in);
        byte nrImp = scan1.nextByte();
        nrImp2 = nrImp;
        while (nrNr > 0){
            Scanner scan = new Scanner(System.in);
            nrImp = scan.nextByte();
            nrNr--;
                if (nrImp < nrImp2){
                    nrImp2 = nrImp;
                }
        }
        System.out.println(nrImp2);
    }
}
