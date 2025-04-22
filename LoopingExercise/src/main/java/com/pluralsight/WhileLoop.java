package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args){
        int counter=0; //Start counter at 0
        while (counter<5){ //Counter will increment up by 1 after each iteration of while loop until it is done 5 times
            System.out.println("I love Java");
            counter=counter+1; //add 1 to counter at the end of while loop
        }
    }
}
