package com.tema13part2;

public class ex8 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int count = 0;
        while (count < n){
            count++;
            sum = sum + (count * count);
        }
        System.out.println(sum);
    }
}
