package com.tema13part3;

public class ex9 {
    public static void main(String[] args) {
        int n = 28;
        int i = 0;
        int sum = 0;
        while (i < n / 2){
            i++;
            if (n % i == 0){
                sum += i;
            }
        }
        if (sum == n){
            System.out.println("Este numar prim");
        }else{
            System.out.println("Nu este numar prim");
        }
    }
}
