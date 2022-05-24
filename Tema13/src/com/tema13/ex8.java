package com.tema13;

public class ex8 {
    public static void main(String[] args) {
        byte x = 6;
        int rez = 0;
        byte count = 0;
        while (count < x){
            count++;
            rez = rez * 10 + count;
            System.out.println(rez);
        }
    }
}
