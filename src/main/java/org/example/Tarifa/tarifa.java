package org.example.Tarifa;

import java.util.Scanner;

public class tarifa {
    public static void input(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int totalMegabytesUsed = 0;
        // Read megabytes used in each month and calculate the total
        for (int i = 0; i < n; i++) {
            int megabytesUsedInMonth = sc.nextInt();
            totalMegabytesUsed += megabytesUsedInMonth;
        }
        // Calculate the remaining megabytes
        int remainingMegabytes = x * (n + 1) - totalMegabytesUsed;
        // Output the remaining megabytes
        System.out.println(remainingMegabytes);
    }

    public static void main(String[] args) {
        input();
    }
}
