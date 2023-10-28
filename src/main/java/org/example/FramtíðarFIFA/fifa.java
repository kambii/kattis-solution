package org.example.FramtíðarFIFA;

import java.util.Scanner;

public class fifa{
    // Print the current year.
    public void put(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // the number of improvements since you were frozen.
        int k = sc.nextInt();  // the number of improvements the game receives every year.

        int currentYear = 2022 + (n / k);
        System.out.println(currentYear);

    }
    public static void main(String[] args) {

        fifa year = new fifa();
        year.put();
    }
}
