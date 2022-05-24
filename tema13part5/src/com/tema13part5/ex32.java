package com.tema13part5;

public class ex32 {
    public static void main(String[] args) {
        int nr = 342568423;
        int nr2 =0;
        int nrCifre = 0;
        int cifra = 0;
        int nrNou = 0;
        while (nr > 0) {
            int n2 = nr % 10;
            nr2 = nr2 * 10 + n2;
            nrCifre++;
            nr /= 10;
        }
        int nr3 = nr2;
        for (int i = 0; i <= nrCifre / 2; i++){
            cifra = nr2 % 10;
            nr2 /= 10;
        }
        while (nr3 > 0){
            int n4 = nr3 % 10;
            if (n4 != cifra){
                nrNou = nrNou * 10 + n4;
            }
            nr3 /= 10;
        }
        System.out.println(nrNou);
    }
}
