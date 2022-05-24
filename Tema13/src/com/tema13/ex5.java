package com.tema13;

public class ex5 {
    public static void main(String[] args) {
        byte nr = 3;
        byte exp = 5;
        int rez = 1;
        while (exp > 0){
            rez *= nr;
            exp--;

        }
        System.out.println(rez);
    }
}
