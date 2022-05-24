package com.tema13part3;

public class ex3 {
    public static void main(String[] args) {
        byte n = 10;
        byte i = 0;
        byte sum = 0;
        while (i <= n){
            i++;
            if (n % i == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
