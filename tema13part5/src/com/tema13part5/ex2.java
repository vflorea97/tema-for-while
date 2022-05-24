package com.tema13part5;

public class ex2 {
    public static void main(String[] args) {
        int n = 24059, sumPrt = 0, sumImp = 0, sumDiv = 0, nrCfMr = 0, prod = 1, n3 = n, n4 = n, sumPrUl = 0;
        while (n > 0){
            int n2 = n % 10;
            int prNr = n2 * n2;
            sumPrt = sumPrt + prNr;
            if(n2 % 2 != 0){
                sumImp += n2;
            }
            if(n2 % 3 == 0){
                sumDiv += n2;
            }
            if (n2 > 5){
                nrCfMr++;
            }
            if (n2 > 0){
                prod *= n2;
            }
            n /= 10;
        }while (n3 >= 10) {
            n3 /= 10;
        }
        int nrUlt = n4 % 10;
        sumPrUl = n3 + nrUlt;

        System.out.println(sumPrt);
        System.out.println(sumImp);
        System.out.println(sumDiv);
        System.out.println(nrCfMr);
        System.out.println(prod);
        System.out.println(sumPrUl);
    }
}
