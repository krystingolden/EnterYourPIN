package com.pluralsight;

import java.util.Scanner;

public class Main {

    /*
https://programmingbydoing.com/

Enter your PIN - Assignment #48
 */

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;

        System.out.println("WELCOME TO THE BANK OF JAVA.");
        System.out.print("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();

        while ( entry != pin )
        {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");

    }
}
