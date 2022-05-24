package com.tema13part5;

public class ex30 {
    public static void main(String[] args) {
        int n = 4567298;
        int nx = n;
        int m = 3456035;
        int mx = m;
        int ogld1 = 0;
        int ogld2 = 0;
        int nrP = 0;
        int nrI = 0;
        if (n % 2 == 0) {
            while (n > 0) {
                int n1 = n % 10;
                ogld1 = ogld1 * 10 + n1;
                n /= 10;
            }
            while (ogld1 > 0) {
                int n2 = ogld1 % 10;
                if (n2 % 2 == 0) {
                    nrP = nrP * 10 + n2;
                }
                ogld1 /= 10;
            }
        }
        if (m % 2 != 0) {
            while (m > 0) {
                int m1 = m % 10;
                ogld2 = ogld2 * 10 + m1;
                m /= 10;
            }
            while (ogld2 > 0) {
                int m2 = ogld2 % 10;
                if (m2 % 2 != 0) {
                    nrI = nrI * 10 + m2;
                }
                ogld2 /= 10;
            }
        }
        int nrP1 = nrP;
        int nrI1 = nrI;
        if (nrP1 >= nrI1) {
            System.out.println(nx);
        }else{
            System.out.println(mx);
        }
    }
}
