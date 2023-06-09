package day17_loops;

import java.util.Scanner;

public class AtmLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int validPin = 1234;
        int userPin;
        int numAttempt=0;

        do {

            System.out.println("Enter your pin");
            userPin = input.nextInt();
            numAttempt++;
            if (numAttempt == 3) {
                System.out.println("You account is blocked. Please, contact the customer service");
            }

            if (userPin == validPin) {
                System.out.println("Welcome, you are logged in");
            }

        } while (userPin != validPin || numAttempt != 3);    // run it until it matches.


        // Or you can put the if parts outside but while needs to be while (userPin != validPin && numAttempt != 3);
//        if (userPin == validPin) {
//            System.out.println("Welcome, you are logged in");
//        } else {
//            System.out.println("You account is blocked. Please, contact the customer service");
//        }


    }
}
