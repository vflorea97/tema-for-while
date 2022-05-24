package com.tema13part2;

public class ex2 {
    public static void main(String[] args) {
        int x = 77667574;
        byte y = 7;
        byte count = 0;
        while (x > 0){
            int x1 = x % 10;
            if (y == x1){
                count++;
            }
            x /= 10;
        }
        System.out.println(count);
    }
}
