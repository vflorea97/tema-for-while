package com.tema13part5;

public class ex12 {
    public static void main(String[] args) {
        int nr = 234879;
        int nrPar = 0;
        int nrImp = 9;
        while (nr > 0){
            int n2 = nr % 10;
            if (n2 < nrImp && n2 % 2 != 0){
                nrImp = n2;
            }
            if (n2 > nrPar && n2 % 2 == 0){
                nrPar = n2;
            }
            nr /= 10;
        }
        int sum = nrImp + nrPar;
        System.out.println(sum);
    }

}
