package com.tema13part2;

public class ex4 {
    public static void main(String[] args) {
        int x = -123;
        int nrMic = 9;
        while(x != 0){
            int x1 = x % 10;
            System.out.println(x1);
            if (nrMic > x1){
                nrMic = x1;
            }
            x /= 10;
        }
        System.out.println(nrMic);
    }
}
