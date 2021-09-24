package code.diff.conditionals;
import java.util.Scanner;
public class Write {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//     Problem 1: Relaxation
//     Ask the user if they are at work (true or false) and if they are traveling (true or false). Using
//     those two pieces of information, determine if we are relaxing or not. We are relaxing if it we are
//     not a work or we're traveling. Return display if we are relaxing or not.

//        Ex 1:If we are not working and not traveling then we are relaxing
//        Ex 2:If we are working and not traveling then we are not relaxing
//        Ex 3:If we are not working and traveling then we are relaxing

        System.out.println("Are you working");
        boolean working = input.nextBoolean();
        System.out.println("Are you traveling?");
        boolean traveling = input.nextBoolean();
        if (!working && !traveling) {
            System.out.println("We are relaxing");
        } else if (working && !traveling) {
            System.out.println("We are not relaxing");
        } else {
            System.out.println("We are relaxing");

        }

    // ================================================================
    // Problem 2: Laughing Babies
    // Ask the users if each of their babies are laughing. We have a problem if both babies are laughing or
    // if neither baby is laughing. Display if there is a problem or not.

    // Ex 1: If both babies are laughing then we have a problem
    // Ex 2: If neither baby is laughing then we have a problem
    // Ex 3: If the first baby is not laughing and the second is, we don't have a problem

        System.out.println("is first baby laughing");
        boolean firstLaughing = input.nextBoolean();
        System.out.println("is second baby laughing");
        boolean secondLaughing = input.nextBoolean();
        if (firstLaughing && secondLaughing){
            System.out.println("We have a problem");}
            else if(firstLaughing || secondLaughing){
                System.out.println("We don't have problem");
            }else{
            System.out.println("We have problem");
            }


    // ================================================================
    // Problem 3: First digit
    // Prompt the user for two numbers between 10 and 99. Display "Match!" if both numbers have the same
    // value in the 10s place, otherwise display "Miss"

    // Ex 1: If num one is 23 and num two is 56, display "Miss"
    // Ex 2: If num one is 29 and num two is 26, display "Match!"
    // Ex 3: If num one is 30 and num two is 30, display "Match!"

        System.out.println("Enter number one from 10 to 99");
            int no1 = input.nextInt();
        System.out.println("Enter number two from 10 to 99");
        int no2 =  input.nextInt();

        boolean tens = (no1 / 10) == (no2 / 10);
        if (tens) {
            System.out.println("Match");
        }
        else
            System.out.println("Miss");


    // ================================================================
    // Problem 4: Barking Puppy

    // The user just got a new puppy. Prompt the user for the hour of the day (0-23) and if the puppy is
    // barking or not. If the dog is barking before 6 or after 19, we have a problem. Display if there is
    // a problem or not.

        System.out.println("Enter the hour of the day from 0 to 23");
        int hour = input.nextInt();
        if (hour < 6 || hour> 19){
            System.out.println("We have problem");
        } else {
            System.out.println("We don't have problem");
        }


    // ================================================================
    // Problem 5: Over the Hill
    // Prompt the user for two ages. Sum the two ages provided and display. However, if either value is 50+, the age
    // should be treated as 49.

    // Age1  Age2   Display
    // 24    36     60
    // 24    50     73 (the 50 is treated as 49)
    // 100   90     60 (both ages are treated as 49)

        System.out.println("Enter age 1");
        int age1 = input.nextInt();
        if (age1>=50){
            age1=49;
        }
        System.out.println("Enter age 2");
        int age2 = input.nextInt();
        if (age2 >=50){
            age2 = 49;
        }
        int age = age1 + age2;
        System.out.println(age);

    // ================================================================
    // Problem 6: WuTangForever
    // Prompt the user for a number. If the number is a multiple of 3, display "Wu". If it is a multiple of 5,
    // display "Tang". If it is a multiple of both 3 and 5, display "WuTangForever". If the number is not a
    // multiple of 3 or 5, display n;

    // Number   Display
    // 9      → "Wu"
    // 20     → "Tang"
    // 30     → "WuTangForever"
    // 7      → 7
        System.out.println("Enter a number");
        int num = input.nextInt();
        if (num%3 ==0){
            System.out.println("Wu");}
            else if (num%5 == 0){
                System.out.println("Tang");
            }
            else if (num%3 == 0 && num%5 ==0){
            System.out.println("WuTangForever");
        }
            else{
            System.out.println(num);
        }
        }

}
