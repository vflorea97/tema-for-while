package com.tema13part3;

public class ex2 {
    public static void main(String[] args) {
        int n = 18;
        int i = 1;
        int nrDiv = 0;
        while (i <= n / 2){
            i++;
            if (n % i == 0){
                nrDiv++;
            }
        }if (nrDiv % 2 != 0){
            System.out.println("Nr. impar");
        }else{
            System.out.println("Nr. par");
        }
    }
}
