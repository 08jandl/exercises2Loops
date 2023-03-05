package switches;

public class SwitchMontWeek {
    public static void main(String[] args) {
        //Switch Months
        //Create a new class “Months”.
        // Write a program that takes an int as a parameter and prints out the corresponding month.
        // For example, if the input is "1", the program should print out "January".

        // we are using a simple int and initialize it here
        // if you want to have more fun with this exercise, feel free to work with a scanner to get your number
        int number = 1;
        // we write the enhanced switch statement
        // which evaluates our number, so that's what goes in the bracket
        switch (number) {
            // then we write our cases and directly print out the month if the condition applies
            // so if the number is 1
            // it will write January to the console and jump out of the switch
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            // We can have a default here for any other case
            // it also works without the default
            default -> System.out.println("Number not in range");
        }

        //Switch Week
        //Create a new class “Week”.
        // Write a program that takes an int from a scanner as a parameter and prints out the corresponding weekday.
        // For example if the input is 1, the program should print out “Monday”.
        // IF the input parameter is any other number, the program should print out an error message.

        // Again you can write this whole program with a scanner to get your int variable.
        int weekdayNumber = 9;
        // this time we evaluate our weekdayNumber variable, otherwise the switch is pretty similar to the first one
        switch (weekdayNumber) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            // We can put our error message right here, as it catches any case that is not 1-7
            default -> System.out.println("Error: No weekday for number " + weekdayNumber);
        }
    }
}
