package loops;

public class Triangle {
    //Create a new class with a main method. Using two nested loops (writing a second loop within a loop), write code that prints the following triangle of numbers to the console.
    //0
    //0 1
    //0 1 2
    //0 1 2 3
    //0 1 2 3 4
    //0 1 2 3 4 5
    //0 1 2 3 4 5 6
    //0 1 2 3 4 5 6 7
    //0 1 2 3 4 5 6 7 8
    //0 1 2 3 4 5 6 7 8 9

    public static void main(String[] args) {
        // For our first loop we know we want 10 lines
        // we start from 0 (int i = 0)
        // and go up to 10 ( i < 11 or i <= 10)
        for (int i = 0; i < 11; i++) {
            // in our first loop all we want to do is to make sure that there is a line break
            // an empty sout will simply go to the next line before the next printing
            System.out.println();
            // our second loop is the one from which we will actually see the numbers in the console
            // that's why we have print out j
            // we need the System.out.print here NOT printLN so the numbers will be in a row
            // the numbers we want start with 0 (int j = 0)
            // traditionally if there are several nested loops, you start with the i variable and then go on further in the alphabet - j
            // in order for the j line we print to grow every loop, we limit the number our second loop should run to be smaller than i
            for ( int j = 0; j < i; j++) {
                System.out.print(j);
            }
        }

        // Thinking it though:
        // We run our first loop
        // i = 0
        // we print an empty line ( if we wanted to prevent that, we could say to only print the empty line if i > 0)
        // the first for loop then increments i to 1
        // now the second loop starts with j = 0 and it runs 1 time
        // so it prints j -> 0
        // now we go back to the first loop
        // i = 1
        // we print a line break
        // increment i to 2
        // second loop has j = 0 and now goes to < i (=2)
        // it runs 2 times, printing first a 0, then a 1
        // and the second loop is done, so back to the first loop etc.
    }
}
