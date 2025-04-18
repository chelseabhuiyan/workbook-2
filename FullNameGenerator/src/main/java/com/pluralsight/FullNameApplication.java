package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

         System.out.println("Please enter your name: ");

         System.out.println("First Name: ");
         String firstName=scanner.nextLine().trim();

         System.out.println("Middle Name: ");
         String middleName=scanner.nextLine().trim();

         System.out.println("Last Name: ");
         String lastName=scanner.nextLine().trim();

         System.out.println("Suffix: ");
         String suffix=scanner.nextLine().trim();

         StringBuilder fullName=new StringBuilder();

         fullName.append(firstName);

         //If user input a middle name then it adds a space and middle name
         if (!middleName.isEmpty()){
             fullName.append(" ").append(middleName);
         }

         fullName.append(" ").append(lastName);

         if (!suffix.isEmpty()) {
            fullName.append(", ").append(suffix);
         }

         System.out.println("Full name: " + fullName.toString());

         scanner.close();

    }
}
