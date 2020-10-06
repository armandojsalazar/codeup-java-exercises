package util;
import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);

    String getString(){
        System.out.println("Enter a word.");
        String userInput = sc.nextLine();
        return userInput;

    }
    boolean yesNo(){
        System.out.println("Do you like Codeup?");
        String userInput = sc.nextLine();
        if(userInput == "yes"){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return yesNo();
    }
}

