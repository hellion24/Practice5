package com.company;

import java.util.Scanner;

public class Exercise4 {

    static int perebor(int dlinaChisla, int sum, int k, int s){
        if(dlinaChisla == k) {
            return (sum == s ? 1 : 0);
        }
        int c = (dlinaChisla == 0 ? 1 : 0);
        int res = 0;
        for(int i = c; i < 10; i++) {
            res += perebor(dlinaChisla + 1, sum + i, k, s);
        }

        return res;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int s = scan.nextInt();
        System.out.println(perebor(0,0, k, s));

    }
}