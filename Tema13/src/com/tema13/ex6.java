package com.tema13;

public class ex6 {
    public static void main(String[] args) {
        byte nr = 3;
        byte exp = 0;
        int rez = 729;
        while (rez > 1){
            rez /= nr;
            exp++;

        }
        System.out.println(exp);
    }
}
