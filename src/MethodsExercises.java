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
//        System.out.println(getInteger(3, 10));

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

   /* public static int getInteger(int min, int max) {
        if (min >= 1 && max <= 10) {
            System.out.println("This is in range");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int userInput = sc.nextInt();

    };*/
}
