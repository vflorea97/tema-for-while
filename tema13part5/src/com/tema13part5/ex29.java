package com.tema13part5;

public class ex29 {
    public static void main(String[] args) {
        int a = 100;
        int b = 1000;
        for (int i = a; i <= b; i++) {
            int ogld = 0;
            int n = i;
            int n1 = n;
            while (n > 0) {
                int n2 = n % 10;
                ogld = ogld * 10 + n2;
                n /= 10;
           }
            if (n1 == ogld) {
                System.out.println(ogld);
            }
        }
    }
}
