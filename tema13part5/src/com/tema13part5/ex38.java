package com.tema13part5;

public class ex38 {
    public static void main(String[] args) {
    int n = 378549;
    int sum = 0;
    while (n > 0) {
        int n2 = n % 10;
        sum += n2;
        n /= 10;
        }
        int ogld = 0;
        while (sum > 0) {
            int n3 = sum % 10;
            ogld = ogld * 10 + n3;
            sum /= 10;
        }
        System.out.println(ogld);
    }
}
