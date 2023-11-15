package org.example.Millifærsla;

import java.util.Scanner;

public class millifaersla {
    // The input consists of three lines. The first line consists of a single integer
    //, the transaction fee on Monnei. The second line consists of a single integer
    //, the transaction fee on Fjee. The third line consists of a single integer
    //, the transaction fee on Dolladollabilljoll.
    // ---------
    // Output the name of the service with the lowest transaction fee in a single line.

    public static void input(){
        Scanner sc = new Scanner(System.in);
       int aMonnei = sc.nextInt();
        int bFjee = sc.nextInt();
        int cDolla = sc.nextInt();
        for (int i = 0; i < aMonnei; i++){
            if(aMonnei < bFjee && aMonnei < cDolla){
                System.out.println("Monnei");
                break;
            } else if (bFjee < aMonnei && bFjee < cDolla){
                System.out.println("Fjee");
                break;
            } else if (cDolla < aMonnei && cDolla < bFjee) {
                System.out.println("Dolladollabilljoll");
                break;
            }
        }
    }

    public static void main(String[] args) {
        input();
    }
}
