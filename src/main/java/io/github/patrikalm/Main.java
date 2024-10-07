package io.github.patrikalm;

import java.util.Scanner;
import java.math.*;


public class Main {
    public static void main(String[] args) {

       /* System.out.println("Hello");
        System.out.println("Patrik!");
        */

        /* int number = 0;
        System.out.println(number++);
        System.out.println(number);
         */

       /* Scanner scanner = new Scanner(System.in);
        int year = 0;

        System.out.println("Do you want to know if a year is a leap year?");
        System.out.print("Type the year here to find out: ");
        year = scanner.nextInt();

          if (year % 4 > 0) {
            System.out.println("This is not a leap year...");
        } else {
            System.out.println("This is a leap year!");
        }
        */

        /* Scanner scanner = new Scanner(System.in);
        float number1,number2 = 0f;

        System.out.println();
        System.out.print("Enter the first number: ");
        number1 = scanner.nextInt();

        System.out.println();
        System.out.print("Enter the second number: ");
        number2 = scanner.nextInt();

        System.out.println();
        System.out.println("Here comes the result:");

        System.out.println();
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));

         */

        /* Scanner scanner = new Scanner(System.in);
        int seconds,hour,minute,second = 0;

        System.out.println();
        System.out.print("Enter the amount of seconds to convert: ");
        seconds = scanner.nextInt();

        hour = seconds / 3600;
        minute = (seconds - hour * 3600) / 60;
        second = seconds - hour * 3600 - minute * 60;

        System.out.println();
        System.out.println("Result of seconds converted to format (hour:min:sec): ");
        System.out.println(hour + ":" + minute + ":" + second);

         */

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int guessedNumber = 0;
        int randomNumber = (int) (Math.random() * 499) + 1;
        int numberOfGuesses = 0;

        System.out.println();

        while (guessedNumber != randomNumber && guessedNumber < 501) {

            System.out.print("Guess a number between 1 and 500: ");
            guessedNumber = scanner.nextInt();

            if (guessedNumber < randomNumber){
               System.out.println("Your guess was too small");
                System.out.println();
            } else if (guessedNumber > randomNumber) {
               System.out.println("Your guess was too big");
                System.out.println();
           }
            numberOfGuesses = ++numberOfGuesses;
        }


        System.out.println();
        System.out.println("You guessed the right number!!!");
        System.out.println("It took you only " + numberOfGuesses + " times.");

    }
}