package com.tema13part5;

public class ex25 {
    public static void main(String[] args) {
        int nr = 956478;
        int n1 = 0;
        int n2 = 0;
        while (nr > 0) {
            int nr2 = nr % 10;
            if (nr2 % 2 == 0) {
                n1 += nr2;
            }
            if (nr2 % 2 != 0){
                n2 += nr2;
            }
            nr /= 10;
        }
        int dif = n1 - n2;
        if (dif < 0){
            dif *= -1;
        }
        System.out.println(dif);

    }
}
