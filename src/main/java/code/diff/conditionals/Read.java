package code.diff.conditionals;

import java.util.Scanner;

public class Read {

    public static void main(String[] args) {

        // Setup
        Scanner scanner = new Scanner(System.in);

        // Boolean

        // Problem 1
        boolean isHappy = true;
        System.out.println(isHappy);
        //Boolean variables or expressions can only have true or false values.
        //store true in boolean variable and print the same line so,
        //it will print true
         Problem 2
        boolean isSad = false;
        System.out.println(isSad);
        //Boolean variables or expressions can only have true or false values.
        //store true in boolean variable and print the same line so,
        //it will print false
        // ================================================================
        // Relational Operators

        // Problem 3
        System.out.println(3 < 8);
        // checks condition as 3 is less than 8 so prints true
        // Problem 4
        System.out.println(3 > 8);
// checks condition as 3 is greater than 8 so prints false
        // Problem 5
        System.out.println(3 == 8);
// checks condition as 3 is equal to 8 so prints false
        // Problem 6
        int a = 34;
        int b = 56;
        System.out.println(a <= b);
// takes 2 integers a and b values and compare whether a is less than or equal to b and outcome will be true
        // Problem 7
        int c = 42;
        int d = 21;
        System.out.println(c >= d);
// takes 2 integers c and d values and compare whether c is greater than or equal to d and outcome will be true
        // Problem 8
        int e = 0;
        int f = 3;
        System.out.println(e != f);
// true as e is not equal to f
        // ================================================================
        // if Statements

        // Problem 9
        int g = -7;
        if(g < 0){
            System.out.println("The variable g is negative!");
        }
// prints variable g is negative because condition is satisfied
        // Problem 10
        int h = scanner.nextInt();
        if(h > 0){
            System.out.println("The number you entered was positive!");
        }
        // ask for random input and if h is greater than 0 then condition is satisfied prints no. is positive if not then nothing is printed
        // Problem 11
        boolean thirsty = false;
        if (thirsty == true) {
            System.out.println("Have a glass of water");
        }
// As condition is not satisfied, nothing printed
        // Problem 12
        boolean hungry = true;
        if (hungry) {
            System.out.println("Taco Time");
        }
// condition is true so prints Taco time
        // ================================================================
        // if else Statements

        // Problem 13
        int grade = 89;

        if(grade >= 90){
            System.out.println("You got an A!");
        }
        else if(grade >= 80){
            System.out.println("You got an B!");
        }
// Prints B
        // Problem 14
        int age = 17;

        if(age >= 18){
            System.out.println("Go vote!");
        }
        else if(age >= 16){
            System.out.println("Go for a ride!");
        }
// Go for ride
        // ================================================================
        // else Statements

        // Problem 15
        double height = 4.5;

        if (height > 3.5) {
            System.out.println("Tall engough to ride");
        } else {
            System.out.println("Too short to ride");
        }
// tall enough to ride
        // Problem 16
        int limit = 60;
        int input = scanner.nextInt();

        if (input < limit) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
// input is checked against limit and prints true or false based on condition satisfied or not
        // Problem 17
        int length = scanner.nextInt();
        if (length > 0) {
            System.out.println(Math.pow(length, 2));
        } else {
            System.out.println(0);
        }
// checks length, if it is greater than 0 then takes power of 2 of that otherwise prints 0
        // Problem 18
        double total = 150.0;
        double discount = 0.1;
        if (total >= 100.0) {
            total = total - total * discount;
        }
        System.out.println(total);
// prints 135
        // ================================================================
        // Logical Operators

        // Problem 19
        boolean z = true;
        boolean y = true;
        System.out.println(z && y);
// true
        // Problem 20
        boolean w = true;
        boolean x = false;
        System.out.println(w && x);
// false
        // Problem 21
        boolean u = true;
        boolean v = false;
        System.out.println(u || v);
// true
        // Problem 22
        boolean s = false;
        boolean t = false;
        System.out.println(s || t);
// false
        // Problem 23
        boolean q = true;
        System.out.println(!q);
// false
        // Problem 24
        boolean r = false;
        System.out.println(!r);
// true
        // Problem 25
        int yearsOld = 15;
        boolean hasCar = true;
        if(yearsOld >= 15 && hasCar){
            System.out.println("Here I come Taco stand!");
        }
// here i come taco stand
        // ================================================================
        // Switch

        // Problem 26
        int day = 4;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
//Thursday
        // Problem 27
        int color = 2;
        switch(color){
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Blue");
                break;
            case 6:
                System.out.println("Purple");
                break;
        }
// Orange
        // ================================================================
        // Ternary

        // Problem 28
        double num = 6.2;
        int roundedNum = (num > 6.5) ? 7 : 6;
// 6
        // Problem 29
        int j = 5;
        int k = 9;

        int abs = (k > j) ? k-j : j-k;
        System.out.println(abs);
// 4
        // Problem 30
        int i = 5;

        i = (i < 8) ? i + 1 : i;
        i = (i < 8) ? i + 1 : i;
        i = (i < 8) ? i + 1 : i;
        i = (i < 8) ? i + 1 : i;

        System.out.println(i);
// 8
    }

}
