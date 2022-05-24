package com.tema13part4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        byte nrNr = 5;
        byte nrImp2 = 0;
        while (nrNr > 0){
            Scanner scan = new Scanner(System.in);
            byte nrImp = scan.nextByte();
            nrNr--;
            if (nrImp >= nrImp2){
                nrImp2 = nrImp;
            }
        }
        System.out.println(nrImp2);



    }
}
