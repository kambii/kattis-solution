package org.example.Áleiðíbíó;

import java.util.Scanner;

public class aleidibio {

    /* Input
The input consists of three lines. The first line consists of a single integer
, the number of minutes it takes to drive from Hannes to Arnar. The second line consists of a single integer
, the number of minutes it takes to drive from Arnar to the cinema. The third line consists of a single integer
, the minute of the day, on which the film is scheduled to start.

Output a single integer, the latest possible minute of the day, on which Hannes can start driving without them being late.*/


    Scanner sc = new Scanner(System.in);

    public void input(){
        int a = sc.nextInt(); // the number of minutes it takes to drive from Hannes to Arnar.
        int b = sc.nextInt(); // the number of minutes it takes to drive from Arnar to the cinema.
        int c = sc.nextInt(); //  the minute of the day, on which the film is scheduled to start.

        System.out.println(c - a - b);
    }

    public static void main(String[] args) {
        aleidibio object = new aleidibio();
        object.input();
    }
}
