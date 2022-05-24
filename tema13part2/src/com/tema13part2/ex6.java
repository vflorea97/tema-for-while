package com.tema13part2;

public class ex6 {
    public static void main(String[] args) {
        int x = 911512;
        int nrMic = 9;
        byte count = 0;
        while (x > 0){
            int x1 = x % 10;
            if (nrMic > x1){
                nrMic = x1;
            }
            if (nrMic == x1){
                count++;
            }
            x /= 10;
        }
        System.out.println(count);
    }
}
