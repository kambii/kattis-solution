package org.example.Oddities;

import java.util.Scanner;

public class oddities {
    // the program checks if a number is even or odd
    public static void input(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(x % 2 == 0) {
                System.out.println(x + " is even");
            } else {
                System.out.println(x + " is odd");
            }
        }
    }

    public static void main(String[] args) {
        input();
    }
}
