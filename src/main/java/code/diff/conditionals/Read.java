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

        // Problem 2
        boolean isSad = false;
        System.out.println(isSad);

        // ================================================================
        // Relational Operators

        // Problem 3
        System.out.println(3 < 8);

        // Problem 4
        System.out.println(3 > 8);

        // Problem 5
        System.out.println(3 == 8);

        // Problem 6
        int a = 34;
        int b = 56;
        System.out.println(a <= b);

        // Problem 7
        int c = 42;
        int d = 21;
        System.out.println(c >= d);

        // Problem 8
        int e = 0;
        int f = 3;
        System.out.println(e != f);

        // ================================================================
        // if Statements

        // Problem 9
        int g = -7;
        if(g < 0){
            System.out.println("The variable g is negative!");
        }

        // Problem 10
        int h = scanner.nextInt();
        if(h > 0){
            System.out.println("The number you entered was positive!");
        }

        // Problem 11
        boolean thirsty = false;
        if (thirsty == true) {
            System.out.println("Have a glass of water");
        }

        // Problem 12
        boolean hungry = true;
        if (hungry) {
            System.out.println("Taco Time");
        }

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

        // Problem 14
        int age = 17;

        if(age >= 18){
            System.out.println("Go vote!");
        }
        else if(age >= 16){
            System.out.println("Go for a ride!");
        }

        // ================================================================
        // else Statements

        // Problem 15
        double height = 4.5;

        if (height > 3.5) {
            System.out.println("Tall engough to ride");
        } else {
            System.out.println("Too short to ride");
        }

        // Problem 16
        int limit = 60;
        int input = scanner.nextInt();

        if (input < limit) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // Problem 17
        int length = scanner.nextInt();
        if (length > 0) {
            System.out.println(Math.pow(length, 2));
        } else {
            System.out.println(0);
        }

        // Problem 18
        double total = 150.0;
        double discount = 0.1;
        if (total >= 100.0) {
            total = total - total * discount;
        }
        System.out.println(total);

        // ================================================================
        // Logical Operators

        // Problem 19
        boolean z = true;
        boolean y = true;
        System.out.println(z && y);

        // Problem 20
        boolean w = true;
        boolean x = false;
        System.out.println(w && x);

        // Problem 21
        boolean u = true;
        boolean v = false;
        System.out.println(u || v);

        // Problem 22
        boolean s = false;
        boolean t = false;
        System.out.println(s || t);

        // Problem 23
        boolean q = true;
        System.out.println(!q);

        // Problem 24
        boolean r = false;
        System.out.println(!r);

        // Problem 25
        int yearsOld = 15;
        boolean hasCar = true;
        if(yearsOld >= 15 && hasCar){
            System.out.println("Here I come Taco stand!");
        }

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

        // ================================================================
        // Ternary

        // Problem 28
        double num = 6.2;
        int roundedNum = (num > 6.5) ? 7 : 6;

        // Problem 29
        int j = 5;
        int k = 9;

        int abs = (k > j) ? k-j : j-k;
        System.out.println(abs);

        // Problem 30
        int i = 5;

        i = (i < 8) ? i + 1 : i;
        i = (i < 8) ? i + 1 : i;
        i = (i < 8) ? i + 1 : i;
        i = (i < 8) ? i + 1 : i;

        System.out.println(i);

    }

}
