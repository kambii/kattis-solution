package org.example.FizzBuzz;

import java.util.Scanner;

public class fizzbuzz {

 /*   Print integers from 1 to n
    in order, each on its own line, replacing the ones divisible by x
    with Fizz, the ones divisible by y
    with Buzz and ones divisible by both x and y with FizzBuzz. */
        public static void input() {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                if (i % x == 0 && i % y == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % x == 0) {
                    System.out.println("Fizz");
                } else if (i % y == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
            sc.close();
        }

        public static void main(String[] args) {
            input();
        }

    }
