package loops;

public class PingPong {
    public static void main(String[] args) {

        // We start with our counter variable
        int counter = 1;
        // We know it should do this 100 times
        while (counter <= 100) {
            // We start with checking if any given number coming through the loop is divisible by 6
            // We need to start with the biggest divisible number because
            // if otherwise 6 will never be true
            // for example, if we check for 2 first, and out counter has reached 12
            // it would write ping to the console
            if (counter % 6 == 0) {
                System.out.println("ping pong");
                // then we check for the next biggest number
            } else if (counter % 3 == 0) {
                System.out.println("pong");
                // and the last and smalles check
            } else if (counter % 2 == 0) {
                System.out.println("ping");
            } else {
                // we define what happens if the number is not divisible by 2, 3 or 6
                System.out.println("-");
            }
            // and last but not least, we increment our counter
            counter++;
        }

        // Dividing line so the difference between the loops will be easier to see in the console
        System.out.println("--------------------------------------------------------------------");

        // We can implement the same logic with the for loop
        // it already comes with its in-built counter i
        // so we define our range from 1 - 100
        for (int i = 1; i <= 100; i++) {
            // the logic is the same, except we can make use of i as our counter
            if (i % 6 == 0) {
                System.out.println("ping pong");
            } else if (i % 3 == 0) {
                System.out.println("pong");
            } else if (i % 2 == 0) {
                System.out.println("ping");
            } else {
                System.out.println("-");
            }
        }
    }
}
