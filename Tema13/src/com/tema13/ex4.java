package com.tema13;

public class ex4 {
    public static void main(String[] args) {
        byte x = 1;
        byte y = 23;
        while (y > x){
            y--;
            if (y % 2 != 0) {
                System.out.println(y);
            }
        }
    }
}
