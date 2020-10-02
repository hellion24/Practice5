package com.company;

import java.util.Scanner;

public class Exercise5 {

    public static int summa(int n){
        if(n == 0){
            return 0;
        }
        int sum = n%10;
        sum += summa(n/10);
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(summa(n));
    }
}
