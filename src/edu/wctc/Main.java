package edu.wctc;

import java.util.Scanner;

public class Main {

    public static int totalSum = 0;

    public static void main(String[] args) {

        int selection = 0;
        int num = 5;
        int decision = 0;
        boolean answer;

        String[] selections = {"Mild", "Spicy", "Tea", "Coffee", "Breakfast", "Brunch", "Summer", "Winter", "Paper", "Plastic"};
        String[] display = {"Choose 0 for the first selection", "Choose 1 for the second selection"};

        do {
            System.out.printf("Please Enter you selections below! %n");
            System.out.printf("********************************** %n");
            System.out.printf("********************************** %n");

            for (int i = 0; i < num; i++) {
                System.out.println("Do you prefer " + selections[selection] + " or " + selections[++selection] + "?");
                System.out.println(display[0] + "\n" + display[1]);
                Scanner scanner = new Scanner(System.in);
                totalSum += scanner.nextInt();
                ++selection;
            }

            myChoices();

            selection = 0;
            totalSum = 0;

            System.out.println("Do you want ot try again? Enter 1 to play again, or any other key to exit.");
            Scanner keyboard = new Scanner(System.in);
            decision = keyboard.nextInt();
            answer = decision >= 1;
        }
        while (answer);


    }

    static void myChoices() {
        if (totalSum < 3) {
            System.out.println("You score: " + totalSum);
            System.out.println("You prefer to have an organized life an calm!!! ");
        } else if (totalSum == 3) {
            System.out.println("You score: " + totalSum);
            System.out.println("You prefer to have a balanced life!!! ");
        } else {
            System.out.println("You score: " + totalSum);
            System.out.println("You prefer to live your life with excitement!!! ");

        }
    }
}
