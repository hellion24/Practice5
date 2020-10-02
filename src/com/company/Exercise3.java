package com.company;

import java.util.Scanner;

public class Exercise3 {
    public static int AB(int a, int b){
        if (a == b){
            return a;
        }

        if(a>b){System.out.println(a);
            return AB(a-1,b);
        }
        else{
            System.out.println(a);
            return AB(a+1,b);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(AB(a,b));
    }
}
