package org.example.Nsum;


import java.util.Scanner;

public class nsum {

    // Output a single integer – the sum of the
    // n integers from the input.
    public static void input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of integers your program should add.
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;  // The value of the variable num is added to the value of the variable sum.
        }
      System.out.println(sum);

    }

    public static void main(String[] args) {
      input();
    }
}
