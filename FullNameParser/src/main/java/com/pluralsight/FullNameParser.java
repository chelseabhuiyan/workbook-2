package com.pluralsight;

import java.util.Scanner;
public class FullNameParser {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        // Prompt the user
        System.out.print("Please enter your name: ");
        String input = scanner.nextLine().trim(); // Trim leading/trailing spaces

        // Split by spaces
        String[] parts = input.split("\\s+"); // "\\s+" handles multiple spaces

        String firstName = "";
        String middleName = "(none)";  //User can input no middle name so leave none as default
        String lastName = "";

        // Process based on number of parts
        if (parts.length == 2) {    //if only first and last name given
            firstName = parts[0];
            lastName = parts[1];
        } else if (parts.length == 3) {  //if first, middle, and last name given
            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];
        } else {
            System.out.println("Invalid input. Please enter either: first last OR first middle last");
            return; // Exit early
        }

        // Output the parsed name parts
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
        scanner.close();
    }
}
