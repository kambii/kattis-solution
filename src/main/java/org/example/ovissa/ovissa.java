package org.example.ovissa;

import java.util.Scanner;

public class ovissa{
    public static void input(){

        Scanner sc = new Scanner(System.in);

        String sound = sc.nextLine();
        int counter = 0;
        for(int i = 0; i< sound.length(); i++){
            counter++;

        }
        System.out.println(counter);
    }

    public static void main(String[] args){

        input();
    }

}
