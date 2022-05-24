package com.tema13part5;

public class ex5 {
    public static void main(String[] args) {
        int n = 5792351;
        int cifraPara = 10;
        while (n > 0){
            int n2 = n % 10;
            if (n2 < cifraPara && n2 % 2 == 0){
                cifraPara = n2;
            }
            n /= 10;
        }
            System.out.println(cifraPara);
    }
}
