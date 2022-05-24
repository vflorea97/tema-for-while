package com.tema13part5;

public class ex35 {
    public static void main(String[] args) {
        int n = 5136;
        int m = 1344;
        int nrNr = 0;
        int ori = 0;
        while (n > 0) {
            int m2 = 0;
            int n2 = n % 10;
            n /= 10;
            nrNr++;
            while (m > n) {
               m2 = m % 10;
                m /= 10;
                // System.out.println( m2 );
                for (int i = nrNr; i < 4; i--) {
                    if (m2 == n2) {
                        ori++;
                    }
                }
            }
        }
        System.out.println(ori);
    }
}
