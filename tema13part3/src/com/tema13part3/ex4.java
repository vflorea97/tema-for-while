package com.tema13part3;

public class ex4 {
    public static void main(String[] args) {
        int n = 18;
        int i = 0;
        int sumNrImp = 0;
        while (i <= n) {
            i++;
            if (n % i == 0 && i % 2 != 0) {
                    sumNrImp += i;
            }
        }
        System.out.println(sumNrImp);
    }
}