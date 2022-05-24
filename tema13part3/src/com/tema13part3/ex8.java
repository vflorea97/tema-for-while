package com.tema13part3;

public class ex8 {
    public static void main(String[] args) {
        int nr = 81;
        int nrOgld = 0;
        while (nr > 0){
            int x2 = nr % 10;
            nrOgld = nrOgld * 10 + x2;
            nr /= 10;
        }
        int nrDiv = 0;
        int i = 0;
        while (i < nrOgld){
            i++;
            if (nrOgld % i == 0){
                nrDiv++;
            }
        }
        System.out.println(nrDiv);
    }
}
