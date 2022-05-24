package com.tema13part5;

public class ex28 {
    public static void main(String[] args) {
        int a = 100;
        int b = 1000;
        for (int i = a; i <= b; i++){
            int sumP = 0;
            int sumI = 0;
            int n = i;
            while (n > 0) {
                int nb = n % 10;
                if (nb % 2 == 0 && nb != 0) {
                    sumP += nb;
                }
                if (nb % 2 != 0){
                    sumI += nb;
                }
                n /= 10;
            }
            if (sumI == sumP) {
                 System.out.println(sumI + sumP);
            }
        }
    }
}
