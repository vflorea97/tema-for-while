package com.tema13part5;

public class ex31 {
    public static void main(String[] args) {
        int nr = 3442534;
        int cifra = 4;
        int ogld = 0;
        int nrNou = 0;
        while (nr > 0){
            int n2 = nr % 10;
            ogld = ogld * 10 + n2;
            nr /= 10;
        }
        while (ogld > 0) {
            int ogld2 = ogld % 10;
            if (ogld2 != cifra){
                nrNou = nrNou * 10 + ogld2;
            }
            ogld /= 10;
        }
        System.out.println(nrNou);
    }
}
