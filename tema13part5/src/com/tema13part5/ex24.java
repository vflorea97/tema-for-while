package com.tema13part5;


public class ex24 {
    public static void main(String[] args) {
        int x = 38916745;
        int y = 31914543;
        int poz = 0;
        while (x > 0) {
            int x2= x % 10;
            int y2 = y % 10;
            if (x2 == y2){
                poz++;
            }
            x /= 10;
            y /= 10;
        }
        System.out.println(poz);
    }
}
