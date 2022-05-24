package com.tema13part3;

public class ex7 {
    public static void main(String[] args) {
        int nr = 18;
        int i = 0;
        int sum = 0;
        int div = 0;
        while (i < nr){
            i++;
            if (nr % i == 0){
                sum += i;
                div++;
            }
        }
        float medAr = (float) sum / div;
        System.out.println(div);
    }
}
