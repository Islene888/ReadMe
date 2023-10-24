package edu.neu.mgen.Assigsment;

import java.util.Scanner;

public class Assistant20231025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter any word: ");
        String userWord = scanner.nextLine();

        // Record the time when the prompt was displayed
        long startTime = System.currentTimeMillis();

        // Calculate the length of the entered word
        int wordLength = userWord.length();

        // Calculate the time elapsed in seconds
        double reactionTime = (System.currentTimeMillis() - startTime) / 1000.0;

        // Check if the entered word is empty
        if (userWord.isEmpty()) {
            System.out.println("You did not enter any word");
        } else {
            String classification;
            if (wordLength <= 5) {
                classification = "short";
            } else if (wordLength <= 10) {
                classification = "medium";
            } else {
                classification = "long";
            }

            // Print the output
            System.out.println("Your word is " + userWord);
            System.out.println("It is a " + classification + " word");
            System.out.println("The length of the word is " + wordLength);
            System.out.println("Your reaction time is " + reactionTime + " seconds");
        }
    }
    }










    






   
