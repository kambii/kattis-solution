package org.example.KikiBoba;

import java.util.Scanner;

public class kikiboba {

    Scanner sc = new Scanner(System.in);

    public void input(){
        String a = sc.nextLine();

        boolean hasB = false;
        boolean hasK = false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'b') {
                hasB = true;
            } else if (a.charAt(i) == 'k') {
                hasK = true;
            }

            // Check if both 'k' and 'b' are present and 'k' appears before the last occurrence of 'b'
            if (hasB && hasK && a.lastIndexOf('k') < a.lastIndexOf('b')) {
                System.out.println("boki");
                return; // Exit the loop if we found the category
            }
        }

        if (hasB) {
            System.out.println("boba");
        } else if (hasK) {
            System.out.println("kiki");
        } else {
            System.out.println("none");
        }

    }

    public static void main(String[] args) {
        kikiboba object = new kikiboba();
        object.input();
    }
}
