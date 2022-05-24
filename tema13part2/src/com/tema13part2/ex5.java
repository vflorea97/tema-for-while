package com.tema13part2;

public class ex5 {
    public static void main(String[] args) {
        int x = 496758;
        int x2 = x;
        int nrMare = x % 10;
        while (x != 0){
            int x1 = x % 10;
            if (nrMare < x1){
                nrMare = x1;
            }
            x /= 10;
        }
        System.out.println(nrMare);
        int nrOri = 0;
        x = x2;
        while(x > 0){
            int x1 = x % 10;
            if (x1 == nrMare){
                nrOri++;

            }
            x /= 10;
        }
        System.out.println(nrOri);
//        int x = 919582965;
//        int nrMare = 0;
//        byte count = 0;
//        while (x > 0){
//            int x1 = x % 10;
//            if (nrMare <= x1){
//                nrMare = x1;
//            }
//            if (nrMare == x1){
//                count++;
//            }
//            x /= 10;
//        }
//        System.out.println(count);
    }
}
