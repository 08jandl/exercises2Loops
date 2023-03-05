package loops;

public class ArithmeticTower {
    public static void main(String[] args) {
        //Create a new class called “ArithmeticTower”.
        // Write a program that creates an arithmetic tower,
        // i.e., a program where the result of the previous operation is the basis for the next operation.
        // If you start with 1 , for example, and the first operation is to multiply by 2,
        // the result is now the basis for the next operation:
        //1 * 2 = 2
        //2 * 3 = 6
        //6 * 4 = 24
        // You can start with any number you like to build your tower.
        //Tip: You will need to write two for loops, running from 2 to 9.
        // Multiply or divide the result of the previous run with the current value of the loop (index).


        // First we define our starting number
        int startingFrom = 1;

        //Extra: to use the method if you want
        makeTower(startingFrom);

        // I want to see the starting number, so I have to print it before the loop
        // because we will be changing it inside the loop
        // and we don't want to see it in every round (this is optional)
        System.out.println(startingFrom);
        // Then we start with writing our first for loop to build up the first part of the tower
        // we are starting from 2, otherwise our tower doesn't look so nice ;)
        // we go until 9, so i < 10 or i <= 9
        for (int i = 2; i < 10; i++) {
            // Then we determine which number we want to see
            int printNumber = i * startingFrom;
            // print it with the * sign and i
            System.out.println(printNumber + " * " + i);
            // and change our starting number inside our loop
            startingFrom = printNumber;
        }

        // second loop works the same, just decrementing and dividing
        for (int j = 9; j >= 2; j--) {
            int printNumber = startingFrom / j;
            System.out.println(printNumber + " / " + j);
            startingFrom = printNumber;
        }
        System.out.println(startingFrom);
    }

    // Extra: slightly shorter version as method:
    public static void makeTower(int startValue) {
        for (int i = 2; i <= 9; i++) {
            System.out.println(startValue + " * " + i);
            startValue = startValue * i;
        }

        for (int i = 2; i <= 9; i++) {
            System.out.println(startValue + " / " + i);
            startValue = startValue / i;
        }
    }
}
