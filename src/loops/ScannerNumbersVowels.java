package loops;

import java.util.Scanner;

public class ScannerNumbersVowels {
    public static void main(String[] args) {
        //1. Write a Scanner that asks you to enter a number.
        // Write a program that keeps adding up all the positive numbers it gets through the scanner.
        //Rules for specific numbers:
        //-	If a 2 is entered, the sum doubles
        //-	If a 3 is entered the sum id tripled
        //-	If a 22 is entered, the sum is halved
        //As soon as a negative number or 0 is entered, the Scanner closes and prints the sum to the console.

        // We get ourselves a scanner
        Scanner scanner1 = new Scanner(System.in);
        // we print out the instruction
        // we do this only so we know when the program is ready for our input in the console
        // the scanner would work without
        System.out.println("Please enter a number: ");

        // to start with our sum is 0 because we haven't counted anything up yet
        // we're using double or float here because we know if we're dividing things there may well be fractional numbers
        double sum = 0;
        // and we will store the first input right here
        double number = scanner1.nextDouble();
        // or condition for the while loop is to keep going only if the incoming number is not 0 or smaller
        while (number > 0) {
            // we are implementing our special rules here
            if (number == 2) {
                // this can of course be written in the longer form: sum = sum * 2
                sum *= 2;
            } else if (number == 3) {
                sum *= 3;
            } else if (number == 22) {
                sum /= 2;
                // our default case, if no special rules apply is to just add the number that came from the console to the sum
            } else {
                sum += number;
            }
            // Still in the while loop we need to change the variable the loop is checking
            // we will do that with the help of our scanner
            // so first, for us to know when we can put in the next number
            // we print a message for ourselves (or our test users)
            System.out.println("Please enter a number: ");
            // and then change the variable to be checked and worked with in the next round
            number = scanner1.nextInt();
        }
        // And lastly, we print the result to the console.
        // Because we want to know the result after all the numbers have been addded via the loop
        // we needed to define the sum variable outside the loop
        // and change it within the loop
        System.out.println("The sum of all numbers entered is " + sum);

        //--------------------------------------------------------------------------------------------------------------

        //2.
        //Write a Scanner that asks you to enter a letter. Write a method that figures out whether the input from the console is a vowel or not and print the result to the console.
        //The scanner closes only after you put in 0, otherwise it continues to ask for more letters to evaluate.
        //Remember: you compare Strings with .equals() !

        // We get a second scanner for our letters
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter a letter: ");
        // we store the input in a String variable
        String letter = scanner2.nextLine();

        // We make sure to have a stopping condition
        // we need to check for the String of 0, not the number because all we are getting from our scanner is Strings
        // the not (!) goes before the whole .equals expression
        while (!letter.equals("0")) {
            // here we put our logic
            // we can do it all at once with the ||
            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
                // we print our results
                System.out.println("Yes " + letter + " is a vowel!");
            } else {
                // we print our case if it is anything other than a, e, i, o, u
                System.out.println("No " + letter + " is not a vowel.");
            }
            // and again in our loop we need to change the letter variable to the next input from the console
            System.out.println("Evaluate another letter or press 0: ");
            letter = scanner2.nextLine();
        }
    }
}
