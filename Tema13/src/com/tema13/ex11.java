package com.tema13;

public class ex11 {
    public static void main(String[] args) {
        byte nr = 11;
        byte i = 1;
        byte count = 0;
        while (i <= nr){
            if (nr % i == 0){
                count++;
            }
            i++;
        }
        if (count == 2) {
            System.out.println("este nr prim");
        }else{
            System.out.println("nu este nr prim");
        }
    }
}
