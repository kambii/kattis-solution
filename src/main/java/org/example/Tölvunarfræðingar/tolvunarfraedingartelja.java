package org.example.Tölvunarfræðingar;

import java.util.Scanner;

public class tolvunarfraedingartelja {
    // Input consists of one line with one integer n.
    // Output the n-th number, according to computer scientists.

    public static void input(){
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            n--;
            System.out.println(n);
            break;
        }
    }

    public static void main(String[] args) {
        input();
    }
}
