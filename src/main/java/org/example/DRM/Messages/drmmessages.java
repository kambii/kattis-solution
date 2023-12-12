package org.example.DRM.Messages;


import java.util.Scanner;



public class drmmessages {
   Scanner sc = new Scanner(System.in);

   //method is responsible for reading a DRM message from the user, attempting to decrypt it using the decryptDrmMessage method
    public void input() {
        try {
            String drmMessage = sc.nextLine();
            String decryptedText = decryptDrmMessage(drmMessage);
            System.out.println(decryptedText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // splits the message in half
    private String decryptDrmMessage(String message) {
        int mid = message.length() / 2;
        String firstHalf = message.substring(0, mid);
        String secondHalf = message.substring(mid);

        String decryptedFirstHalf = rotateCharacters(firstHalf);
        String decryptedSecondHalf = rotateCharacters(secondHalf);

        return mergeHalves(decryptedFirstHalf, decryptedSecondHalf);
    }

    // The method rotateCharacters takes a string str as input and calculates a
    // rotation amount based on the characters in that string.
    private String rotateCharacters(String str) {
        int rotationAmount = 0;
        for (char ch : str.toCharArray()) {
            rotationAmount += ch - 'A';
        }

        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            char decryptedChar = (char) ((ch - 'A' + rotationAmount) % 26 + 'A');
            result.append(decryptedChar);
        }

        return result.toString();
    }

    // this method combines characters from two halves (firstHalf and secondHalf) by performing a merging operation.
    private String mergeHalves(String firstHalf, String secondHalf) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < firstHalf.length(); i++) {
            char decryptedChar = (char) ((firstHalf.charAt(i) - 'A' + secondHalf.charAt(i) - 'A') % 26 + 'A');
            result.append(decryptedChar);
        }
        return result.toString();
    }


    // method for running the program
    public static void main(String[] args) {
        drmmessages object = new drmmessages();
        object.input();
    }

}
