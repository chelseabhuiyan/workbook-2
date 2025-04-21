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

        //both arrays should have a length of two now, if not something is wrong
        if (teams.length != 2 || scores.length != 2) {
            System.out.println("Invalid input format. Use TeamA:TeamB|ScoreA:ScoreB");
            return;
        }

        String team1=teams[0]; //first string stored in the teams array is name of team A
        String team2=teams[1];  //second string in the teams array is name of Team B
        int score1 = Integer.parseInt(scores[0].trim()); //first number in the score list is score of team A
        int score2 = Integer.parseInt(scores[1].trim()); //second number in the score list is socre of team b

        // Determine the winner
        String winner;
        if (score1 > score2) {
            winner = team1;
        } else if (score2 > score1) {
            winner = team2;
        } else {
            winner = "It's a tie!";
        }

        //Print the result
        System.out.print("Winner: "+winner);


        scanner.close();
    }
}
