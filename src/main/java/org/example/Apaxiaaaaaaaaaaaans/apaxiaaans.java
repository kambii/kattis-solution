package org.example.Apaxiaaaaaaaaaaaans;

import java.util.Scanner;

public class apaxiaaans {
 //  taking Apaxian names and replacing all consecutive runs of
 //  the same letter by a single instance of such letter.
    public static String input(String name){
        StringBuilder result = new StringBuilder(); // Used to build and manipulate strings efficiently
        char previousChar = 0;

        for (char currentChar : name.toCharArray()) {
            if (currentChar != previousChar) {
                result.append(currentChar);
                previousChar = currentChar;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String compactName = input(name);
        System.out.println(compactName);
    }
}
