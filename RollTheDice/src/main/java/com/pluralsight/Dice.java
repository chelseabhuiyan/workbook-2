package com.pluralsight;

public class Dice{
    //Method roll() that generates a random number between 1 and 6
    public int roll() {
        int minValue = 1;
        int maxValue = 6;
        return (int) (Math.random() * maxValue) + minValue;

    }
    //Main function
    public static void main(String[] args) {
        //Created a new instance of Dice named dice
        Dice dice= new Dice();

        //Integers Variables for roll1,roll2, and 4 different counters for the number of times 2,4,6,7 are rolled
        int roll1;
        int roll2;
        int counter2=0;
        int counter4=0;
        int counter6=0;
        int counter7=0;

        //Loop is executed 100 times and in the while loop you call your dice roll() two times
        for (int i=0; i<100; i++){
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            //Print value of each roll of the dice
            System.out.println("Roll " + (i + 1) + ": " + roll1 + " - " + roll2 + " Sum: " + sum);


            if (sum == 2) counter2++; //Determine if the sum of roll1 and roll2 is 2, and if so increment the counter2
            if (sum == 4) counter4++; //Determine if the sum of roll1 and roll2 is 4, and if so increment the counter4
            if (sum == 6) counter6++; //Determine if the sum of roll1 and roll2 is 6, and if so increment the counter6
            if (sum == 7) counter7++; //Determine if the sum of roll1 and roll2 is 7, and if so increment the counter7
        }
        //After loop terminates display the values of counters
        System.out.println("Sum of 2 rolled: " + counter2);
        System.out.println("Sum of 4 rolled: " + counter4);
        System.out.println("Sum of 6 rolled: " + counter6);
        System.out.println("Sum of 7 rolled: " + counter7);
    }


}
