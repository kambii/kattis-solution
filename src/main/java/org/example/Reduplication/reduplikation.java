package org.example.Reduplication;

import java.util.Scanner;

public class reduplikation {
    Scanner sc = new Scanner(System.in);

    public void input(){
        String s = sc.nextLine();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        reduplikation object = new reduplikation();
        object.input();
    }
}
