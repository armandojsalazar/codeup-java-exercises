import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        //#1 Basic Arithmetic
        sum(3, 5);
        sub(10, 4);
        multiple(5, 6);
        divide(144, 12);
        System.out.println(mod(26, 5));

        //#2
        System.out.println(getInteger(1, 10));
        System.out.println(getInteger(5, 8));

    }

    //#1
    public static void sum(int num1, int num2) {
        System.out.println("The sum of " + num1 + " and " + num2 + " equals: " + (num1 + num2));
    }

    public static void sub(int num1, int num2) {
        System.out.println("The sum of " + num1 + " minus " + num2 + " equals: " + (num1 - num2));
    }

    public static void multiple(int num1, int num2) {
        System.out.println("The sum of " + num1 + " multiplied by " + num2 + " equals: " + (num1 * num2));
        ;
    }

    public static void divide(int num1, int num2) {
        System.out.println("The sum of " + num1 + " divided by " + num2 + " equals: " + (num1 / num2));
        ;
    }

    public static int mod(int num1, int num2) {
        return num1 % num2;
    }

    //#2

    public static int getInteger(int min, int max) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number between " + min + " and " + max);
        int userInput = Integer.parseInt(scan.nextLine());


        if(userInput < min){
            System.out.println("This number is lower than " + min);
            return getInteger(min, max);
        } else if ( userInput > max) {
            System.out.println("This number is bigger than " + max);
            return getInteger(min, max);
        }

       return userInput;

    };

    //#3




}
