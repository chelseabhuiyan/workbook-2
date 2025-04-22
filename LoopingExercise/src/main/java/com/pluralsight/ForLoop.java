package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException{
        for (int countDown=10;countDown>0;countDown--){  //for loop to countdown from 10 to 1
            System.out.println(countDown); //prints numbers 10 to 1
            Thread.sleep(1000);  //pauses for a second between each number
        }
        System.out.println("Launch!");
    }
}
