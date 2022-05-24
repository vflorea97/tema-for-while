package com.tema13part5;

public class ex4 {
    public static void main(String[] args) {
        int n = 25674;
        int ctSum = 0;
        int cifreSum = 0;
        while (n > 0){
            int n2 = n % 10;
            ctSum += n2;
            n /= 10;
        }
        while (ctSum > 0){
            int ctSum2 = ctSum % 10;
            ctSum /= 10;
            cifreSum++;
        }
        System.out.println(cifreSum);
    }

}
