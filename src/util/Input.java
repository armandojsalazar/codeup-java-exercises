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
        System.out.println("Enter a number.");
        int num;
        try {
            String input = sc.nextLine();
            num = Integer.valueOf(input);
        }catch(RuntimeException re){
            System.out.println("You must enter an integer.");
            return getInt(min,max);
        }
        if (num < min) {
            System.out.println("Enter a higher number");
            return getInt(min, max);
        } else if (num > max) {
            System.out.println("Enter a lower number");
            return getInt(min, max);
        }
        return num;
    }

    public int getInt() {
        System.out.println("Enter a number.");
        int num;
        String input = sc.nextLine();
        try {
            num = Integer.parseInt(input);
        }catch(NumberFormatException nfex){
            System.out.println("You must enter an integer");
            return getInt();
        }
        return num;
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a decimal number less than 1");
        double num;

        try{
            String input = sc.nextLine();
            num = Double.parseDouble(input);
        }
        catch(NumberFormatException nfex){
            System.out.println("You must enter a double");
            return getDouble();
        }
        if (num < min) {
            System.out.println("Enter a higher number decimal number less than 1");
            return getDouble(min, max);
        } else if (num > max) {
            System.out.println("Enter a lower decimal number greater than 0");
            return getDouble(min, max);
        }
        return num;
    }

    public double getDouble() {

            System.out.println("Enter a decimal number less than 1 but greater than 0");
            double num;
            String input = sc.nextLine();
            try{
                num = Double.parseDouble(input);
            }
            catch(NumberFormatException nfex){
                System.out.println("You must enter a double");
                return getDouble();
            }
            return num;
    }
}
