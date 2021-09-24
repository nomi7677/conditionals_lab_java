package code.diff.conditionals;

import java.util.Random;
import java.util.Scanner;

public class Create {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    // Problem 1: Fire and Ice

    // Prompt the user for two numbers. If one is less than 32 and the other greater than 212, display
    // "Fire and Ice!", otherwise display "Lukewarm"

    // Ex 1: If temp1 is 240 and temp2 is 0 then display "Fire and Ice!"
    // Ex 2: If temp1 is 0 and temp2 is 240 then display "Fire and Ice!"
    // Ex 3: If temp1 is 40 and temp2 is 0 then display "Lukewarm"
        System.out.println("Enter number 1");
        int num1 = input.nextInt();
        System.out.println("Enter number 2");
        int num2 = input.nextInt();

        if (num1 < 32 && num2 > 212 || num1 > 212 && num2 < 32){
            System.out.println("Fire and Ice");
        }else{
            System.out.println("Lukewarm");
        }

    // ===================================================================
    // Problem 2: Fencing

    // Create a function that produces the price of fences by the foot.
    // Prompt the user for a total length in feet of fence to purchase.
    // Each foot should cost $16.00, but if the purchase more than 100 feet of Fencing
    // a discount of 20% for each foot over 100 feet. Display the final cost

    // Ex 1: If distance is 50 feet then the total cost will be 800
    // Ex 2: If distance is 150 feet the the total cost will be 2240 (100ft at regular cost and 50ft at discounted rate)

        System.out.println("Enter the length in feet: ");
        double feet = input.nextInt();
        double price = feet * 16;
        double discount = (feet - 100) * 16 * 20 / 100;
        if (feet < 100) {
            System.out.println(price);
        } else {
            double totalPrice = price - discount;
            System.out.println(totalPrice);
        }

    // ===================================================================
    // Problem 3: Guessing Game

    // Generate a number between 1-10. Ask the user to guess the number and display if the user guessed correctly or not.
    // Additionally, if the user guesses within 1 number above or below also output that they were close.
        Random rand = new Random();
        int answer = rand.nextInt(10)+1;
        System.out.println("Guess the number between 1 to 10");
        int randomNumber = input.nextInt();


        if (answer == randomNumber) {
            System.out.println("The number is correct");
        } else if (answer == randomNumber - 1) {
            System.out.println("below 1,You were close. Try again");
        } else if (answer == randomNumber + 1) {
            System.out.println("Above 1,You were close. Try again");
        } else {
            System.out.println("wrong number");
        }
    // ===================================================================
    // Problem 4: Leap Year

    // Prompt the user to enter a year. Display back to the user if the year they entered was a leap year or not. Make
    // sure to do research on leap years, its not just every 4 years! Here's a hint -> https://en.wikipedia.org/wiki/Leap_year
        System.out.println("Enter the year: ");
        int year = input.nextInt();

        if ((year%4==0) && (year%100 !=0) || (year%400==0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not the Leap year");
        }


    }

}

