package org.example.FYI;

import java.util.Scanner;

public class fyi {

    /* input
The single line of input contains a single integer n which is a telephone number.

Output a single integer, which is 1
 if the number should be routed to the directory information operator, or 0
 if the number should not be routed to the directory information operator.*/
    Scanner sc = new Scanner(System.in);

    public void input(){
        int n = sc.nextInt();
        String numberString = Integer.toString(n);
        if(numberString.length() >= 3){
            String firstThreeCharacters = numberString.substring(0, 3);
            if ("555".equals(firstThreeCharacters)){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

    }

    public static void main(String[] args) {
        fyi object = new fyi();
        object.input();
    }
}
