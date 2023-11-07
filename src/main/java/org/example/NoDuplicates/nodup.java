package org.example.NoDuplicates;

import java.util.*;

public class nodup {
    /* Input is a line containing words separated by single spaces,
     where a word consists of one or more uppercase letters. A line contains no more than
 characters.
 The output is "yes" if no word is repeated, and "no" if one or more words repeat.
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        //Split the string into words using built-in function
        String[] words = n.split(" ");

        Set<String> wordSet = new HashSet<>();
        boolean hasDuplicate = false;

        for (String word : words) {
            if (wordSet.contains(word)) {
                hasDuplicate = true;
                break;
            }
            wordSet.add(word);
        }

        if (hasDuplicate) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
