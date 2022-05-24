package com.tema13;

public class ex10 {
    public static void main(String[] args) {
        byte nr = 18;
        byte i = 1;
        short rez = 0;
        while (i <= nr/2){
            i++;
            if (nr % i == 0){
                rez += i;
            }
        }
        System.out.println(rez);
    }
}
