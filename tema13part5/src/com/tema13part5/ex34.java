package com.tema13part5;

public class ex34 {
    public static void main(String[] args) {
        int n = 3471589;
        int ogld = 0;
        int poz = 0;
        int sum = 0;
        while (n > 0) {
            int n2 = n % 10;
            ogld = ogld * 10 + n2;
            n /= 10;
        }
        while (ogld > 0) {
            int n3 = ogld % 10;
            if (poz % 2 != 0) {
                sum += n3;

            }
            ogld /= 10;
            poz++;
        }
        System.out.println(sum);
    }
}
