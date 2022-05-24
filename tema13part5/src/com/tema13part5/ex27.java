package com.tema13part5;

public class ex27 {
    public static void main(String[] args) {
        int nr = 3456924;
        int cifMa = 0;
        int cifMi = 9;
        while (nr > 0) {
            int n2 = nr % 10;
            if (n2 > cifMa) {
                cifMa = n2;
            }
            if (n2 < cifMi){
                cifMi = n2;
            }
            nr /= 10;
        }
        int sum= cifMa + cifMi;
        System.out.println(sum);
    }
}
