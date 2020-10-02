import java.util.Formatter;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        System.out.println("Control Flow Exercises");


        //#1 a. While
        //
        //Create an integer variable i with a value of 5.
        //Create a while loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
        //Your output should look like this:
        //
        //5 6 7 8 9 10 11 12 13 14 15

        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }

        //#1 b. Do While
        //
        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        int b = 0;

        do {
            System.out.println(b);
            b += 2;
        } while (b <= 100);


        //Alter your loop to count backwards by 5's from 100 to -10.
        int c = 100;

        do {
            System.out.println(c);
            c -= 5;
        } while (c >= -10);
        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
        long d = 2;

        do {
            System.out.println(d);
            d *= d;
        } while (d <= 1000000);

        //#1 c. For
        // Refactor the previous two exercises to use a for loop instead.

        for (int e = 0; e <= 15; e++) {
            System.out.println(e);
        }

        for (int f = 0; f <= 100; f += 2) {
            System.out.println(f);
        }

        for (int g = 100; g >= -10; g -= 5) {
            System.out.println(g);
        }

        for (long h = 2; h <= 1000000; h *= h) {
            System.out.println(h);
        }

        //#2 Fizzbuzz
        //
        //One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //
        //Write a program that prints the numbers from 1 to 100.
        //For multiples of three: print “Fizz” instead of the number.
        //For the multiples of five: print “Buzz”.
        //For numbers which are multiples of both three and five: print “FizzBuzz”.

        for (int j = 1; j <= 100; j++) {
            if (j % 15 == 0) {
                System.out.println("FizzBuzz " + j);
            } else if (j % 5 == 0) {
                System.out.println("Buzz " + j);
            } else if (j % 3 == 0) {
                System.out.println("Fizz " + j);
            } else {
                System.out.println(j);
            }
        }

        //#3 Display a table of powers

        Scanner sc = new Scanner(System.in);
        boolean userContinues = true;
        System.out.println("What number would you like to go up?");
        int userInput = sc.nextInt();
        System.out.println("Here's your table:");
        System.out.println("");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int k = 1; k <= userInput; k++) {
            System.out.printf("%-6d", k);
            System.out.print(" | ");
            System.out.printf("%-7d", k * k);
            System.out.print(" | ");
            System.out.print(k * k * k);
            System.out.println();
        }
        System.out.println("Would you like to enter another number (y/n)?");
        String userResponse = sc.next();
        if (!userResponse.equalsIgnoreCase("y")) {
            userContinues = false;
        }
        while (userContinues) ;
    }
//        Formatter l = new Formatter();
//        l.format("%-6s %1s %-7s %1s %-6s", "Number", "|", "Squared", "|", "Cubed");
//        l.format("%-6s %1s %-7s %1s %-6s", "------", "|", "------", "|", "------");
//
//        for(int k = 1; k <= userInput; k++){
//            l.format("%-6s %1s %-7s %1s %-6s", k, "|", (int)Math.pow(k, 2), "|", (int)Math.pow(k, 3));
//        }
//        System.out.println(l);



    }


