package util;
import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }


    public String getString() {
//        System.out.println("Enter a word.");
        String userInput = sc.nextLine();
        return userInput;
    }

    public boolean yesNo() {
//        System.out.println("Do you like Codeup?");
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
//        System.out.println("Enter a number.");
        int userInput = sc.nextInt();
        if (userInput < min) {
            System.out.println("Enter a higher number");
            return getInt(min, max);
        } else if (userInput > max) {
            System.out.println("Enter a lower number");
            return getInt(min, max);
        }
        return userInput;
    }

    public int getInt() {
        System.out.println("Enter a number.");
        int userInput = sc.nextInt();
        return userInput;
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a decimal number less than 1");
        double userInput = sc.nextDouble();
        if (userInput < min) {
            System.out.println("Enter a higher number decimal number less than 1");
            return getDouble(min, max);
        } else if (userInput > max) {
            System.out.println("Enter a lower decimal number greater than 0");
            return getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble() {
        try {
            System.out.println("Enter a decimal number less than 1 but greater than 0");
            double userInput = sc.nextDouble();
            return userInput;
        }catch(){

        }
    }
}
