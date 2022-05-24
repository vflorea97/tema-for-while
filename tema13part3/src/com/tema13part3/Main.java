package com.tema13part3;

public class Main {

    public static void main(String[] args) {
        int nr = 18;
        int i = 1;
        int rez = 0;
        int patrat = 0;
        while (i <= nr / 2){
            i++;
            if (nr % i == 0){
                rez += i;
                if(rez == 2){
                    patrat = rez * 2;
                }
            }
        }
        System.out.println(patrat);
    }
}
