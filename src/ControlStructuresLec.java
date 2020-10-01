import java.util.Scanner;

public class ControlStructuresLec {
    public static void main(String[] args) {
        System.out.println("Control Structures Lec");

        int operatorId = 8922;
        int operatorAge = 18;

        boolean isSignedIn = operatorId == 8922;
        //this can not work. can't compare an int to a string
       // boolean isSignedIn = operatorId == "8922";

        System.out.println("isSignedIn = " + isSignedIn);

        boolean isTerminated = operatorId != 8922;
        System.out.println("isTerminated = " + isTerminated);

        boolean isMinor = operatorAge < 18;
        System.out.println("isMinor = " + isMinor);
        //will work the same as above
        isMinor = operatorAge <= 17;
        System.out.println("isMinor = " + isMinor);

        boolean canSellTobacco = operatorAge > 17;
        System.out.println("canSellTobacco = " + canSellTobacco);

        boolean canSellAlcohol = operatorAge >= 21;
        System.out.println("canSellAlcohol = " + canSellAlcohol);


        boolean canProceed = isSignedIn && canSellAlcohol;
        System.out.println("canProceed = " + canProceed);

        canProceed = isSignedIn && canSellTobacco;
        System.out.println("canProceed = " + canProceed);

        boolean isRestrictedCashier = !canSellAlcohol || !canSellTobacco;
        System.out.println("isRestrictedCashier = " + isRestrictedCashier);


//        Scanner sc = new Scanner(System.in);
//        System.out.print("continue? [y/N] ");
//        String userInput = sc.next();

        //Don't do this!!!!!!!!!!
//        boolean confirmation = userInput == "y";

        //this is how we do it!!!
//        boolean confirmation = userInput.equals("y");

        //Y or y will be valid
//        boolean confirmation = userInput.equalsIgnoreCase("y");
//        System.out.println("Confirmation = " + confirmation);

        isTerminated = true;
        isSignedIn = false;
        if(!isTerminated && isSignedIn){
            //If true, run this code please
            System.out.println("Start ringing items");
        } else if (isTerminated){
            System.out.println("Hasta la vista! You are Terminated!");
        }else if(!isSignedIn){
            System.out.println("You are not signed in. Please sign in.");
        }else {
            //If false, run this code instead please.
            System.out.println("Cannot compute!");
        }


        // switch case
        int dayOfWeekNumber = 7;
        String dayOfWeek = "";

        switch(dayOfWeekNumber){
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Unknown";
        }
        System.out.println("Today is " + dayOfWeek);



        //While Loop
        int i = 0;
        while(i <= 10){
            //While true, keep running please
            System.out.println("While loop: i: " + i);
            i++;
        }
        int counter = 0;
                do {
                    System.out.println("Do while loop: counter: " + counter);
                    counter++;
                } while (counter <= 10);

                for(int x = 0; x <= 10; x++){
                    System.out.println("The value of x: " + x);
                }
        //Break and Continue
        for(int a = 0; a <= 10; a++){  //<-
            if(a % 2 == 1){            //|
                continue; //----------------
            } else if (a > 5) {
                break; //--------------------
            }                               //|
                                            //|
            System.out.println("a = " + a);  //|
        }                                   //|
        // <----------------------------------
        System.out.println("Finished");
    }
}
