package com.tema13part5;

public class ex16 {
    public static void main(String[] args) {
        int nr = 323222233;
        byte x2 = 0;
        int x22 = 0;
        byte x3 = 0;
        int x33 = 0;
        while (nr > 0) {
            int n2 = nr % 10;
            if (n2 == 2) {
                x2++;
                x22 = n2;
            }
            if (n2 == 3) {
                x3++;
                x33 = n2;
            }
            nr /= 10;
        }
        if (x2 > x3) {
            System.out.println(x22);
        }else{
            System.out.println(x33);
        }

    }
}
