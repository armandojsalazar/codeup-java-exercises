import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f \n", pi);

        Scanner sc = new Scanner(System.in);



      /*  System.out.println("Enter your favorite number.");
        int inputNumber = sc.nextInt();
        System.out.println("Your favorite number is: " + inputNumber);

        System.out.println("Whats your full name?");
        String firstName = sc.next();
        String middleName = sc.next();
        String lastName = sc.next();
        System.out.printf("Hello, %s %s %s\n", firstName, middleName, lastName);

        sc.nextLine();

        System.out.println("What is your favorite movie quote?");
        String movieQuote = sc.nextLine();
        System.out.printf("\"%s\" is a great movie quote!\n", movieQuote);*/


        Scanner lwInput = new Scanner(System.in);
        lwInput.useDelimiter("\n");
        System.out.println("What is the length and width of the class room?");
        int userLength = Integer.parseInt(lwInput.nextLine());
        int userWidth = Integer.parseInt(lwInput.nextLine());

        int area = (userLength * userWidth);
        int perimeter = ((userLength * 2) + (userWidth * 2));

        System.out.printf("The area of the class room is: %d sqft\n", area);
        System.out.printf("The perimeter of the class room is: %d ft\n", perimeter);
    }
}
