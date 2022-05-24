package com.tema13part2;

public class Main {

    public static void main(String[] args) {
        int x = 27856;
        byte nrImp = 0;
        byte nrPare = 0;
        while (x > 0){
            int y = x % 10;
            if (y % 2 == 0){
                nrPare++;
            }else{
                nrImp++;
            }
            x /= 10;
        }
        System.out.println(nrPare + " cifre pare");
        System.out.println(nrImp + " cifre impare");
    }
}
