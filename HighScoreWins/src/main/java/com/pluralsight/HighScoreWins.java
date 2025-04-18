package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        //Prompt user to enter the score
        System.out.print("Print the score: ");
        String score =scanner.nextLine().trim();   // Example: "Home:Visitor|21:9"

        String[] parts= score.split("\\|");  //splits Home:Visitor and 21:9
        if (parts.length != 2) {
            System.out.println("Invalid input format. Use TeamA:TeamB|ScoreA:ScoreB");
            return;
        }

        String teamPart = parts[0];  // "Home:Visitor"
        String scorePart = parts[1]; // "21:9"

        //Split by colons
        String[] teams = teamPart.split(":");       // ["Home", "Visitor"]
        String[] scores = scorePart.split(":");     // ["21", "9"]

        
        scanner.close();
    }
}
