package org.example.Flatbökuveisla;

import java.util.Scanner;

public class flatbokuveisla {

    // Input consists of two lines. The former line consists of a single integer
    //, the number of slices. The latter line consists of a single integer
    //, the number of residents in Ómar’s household.
    // ---------------------------------------------
    //Print one integer, the number of slices left over.

    public static void input() {
        Scanner sc = new Scanner(System.in);
        int slices = sc.nextInt(); // Number of slices
        int residents = sc.nextInt(); // Number of residents
        int slicesLeft = slices % residents; // Calculate the slices left over
        System.out.println(slicesLeft);
    }

    public static void main(String[] args) {
        input();
    }

}
