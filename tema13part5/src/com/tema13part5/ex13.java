package com.tema13part5;

public class ex13 {
    public static void main(String[] args) {
        int n = 27;
        int x = n;
        int z = x;
        int nrUrm = 0;
        int nrOgld = 0;
        while (n > 0){
            int n2 = n % 10;
            nrUrm = nrUrm * 10 + 9;
            n /= 10;
        }while (x > 0){
            int x2 = x % 10;
            nrOgld = nrOgld * 10 + x2;
            x /= 10;
        }
        if (nrUrm - nrOgld == z){
            System.out.println("Este nr curat");
        }else{
            System.out.println("Nu este nr curat");
        }
    }
}
