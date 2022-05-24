package com.tema13part3;

public class ex5 {
    public static void main(String[] args) {

        int n = 18;
        int i = 1;
        int sumNrPare = 0;
        while (i <= n) {
            i++;
            if (n % i == 0) {
                if (i % 2 == 0) {
                    sumNrPare += i;
                }
            }
        }
        System.out.println(sumNrPare);
    }
}
