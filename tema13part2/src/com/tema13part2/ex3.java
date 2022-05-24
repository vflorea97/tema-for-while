package com.tema13part2;

public class ex3 {
    public static void main(String[] args) {
        int x = 496758;
        int nrMare = x % 10;
        System.out.println(nrMare);
        while (x != 0){
            int x1 = x % 10;
            if (nrMare < x1){
                nrMare = x1;
            }
            x /= 10;
        }
        System.out.println(nrMare);
    }
}
