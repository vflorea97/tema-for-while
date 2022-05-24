package com.tema13part3;

public class ex6 {
    public static void main(String[] args) {
        int n = 18;
        int i = 0;
        int nrDivPari = 0;
        while (i <= n){
            i++;
            if (n % i == 0){
                if (i % 2 == 0){
                    nrDivPari++;
                }
            }
        }
        System.out.println(nrDivPari);
    }
}
