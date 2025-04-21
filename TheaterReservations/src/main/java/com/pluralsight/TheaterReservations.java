package com.pluralsight;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TheaterReservations {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name= scanner.nextLine().trim();

        String[] fullName= name.split(" "); //splits the input name based on where the space is

        if (fullName.length < 2) {  //checks if both first name and last name were put
            System.out.println("Please enter both your first and last name.");
            return;
        }
        String firstName = fullName[0]; //the first word is the first name
        String lastName = fullName[1];  //the second word is the last name

        //Parse the date
        System.out.print("What days will you be coming? (MM/dd/yyyy): ");
        String date= scanner.nextLine().trim();

        //reformat the date to yyyy-MM-dd
        String[] dateParts = date.split("/");
        if (dateParts.length != 3) {
            System.out.println("Invalid date format. Please use MM/dd/yyyy.");
            return;
        }

        String month = dateParts[0];
        String day = dateParts[1];
        String year = dateParts[2];

        //add the 0 in front of month or day if it is one digit
        if (month.length() == 1) month = "0" + month;
        if (day.length() == 1) day = "0" + day;

        String formattedDate = year + "-" + month + "-" + day;

        System.out.print("How many tickets would you like?: ");
        int tickets= scanner.nextInt();


        //if its one ticket there is no s
        String ticketWord = (tickets == 1) ? "ticket" : "tickets";

        //Display the sentence.
        System.out.printf("%d %s reserved for %s under %s, %s\n.",
                tickets, ticketWord, formattedDate, lastName, firstName);


        scanner.close();
    }
}
