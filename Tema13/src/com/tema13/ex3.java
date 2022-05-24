package com.tema13;

public class ex3 {
    public static void main(String[] args) {
        byte x = 1;
        byte y = 23;
        while (y > x){
            x++;
            if(x % 2 == 0) {
                System.out.println(x);
            }
        }
    }
}
