package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Exercise 3
        int seconds;
        int hours, minutes, seconds_print, remainder;
        final int SECONDS_PER_MINUTE = 60;
        final int MINUTES_PER_HOUR = 60;
        final int SECONDS_PER_HOUR = 3600;
        Scanner in = new Scanner(System.in);


        //Get amount of seconds from user
        System.out.print("Enter amount of seconds: ");
        seconds = in.nextInt();

        //Convert to hours, minutes and seconds
        hours = (seconds/SECONDS_PER_HOUR);
        minutes = (seconds%SECONDS_PER_HOUR/SECONDS_PER_MINUTE);
        seconds_print = (seconds%SECONDS_PER_HOUR%SECONDS_PER_MINUTE);

        System.out.printf("%d hours, %d minutes and %d seconds", hours, minutes, seconds_print);





    }
}
