package com.tema13part5;

public class Main {

    public static void main(String[] args) {
        int n = 369432;
        int k = 7;
        int count = 0;
        while (n > 0){
            int n1 = n % 10;
            if (k < n1){
                count++;
            }
            n /= 10;
        }
        if (count == 0){
            System.out.println("Mai mici sau egale");
        }else{
            System.out.println("Mai mari");
        }
    }
}
