import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        //#2 Create a class named Bob with a main method for the following exercise.
        //
        //Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        //
        //Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        //He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        //He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        //He answers 'Whatever.' to anything else.

        System.out.println("Ask Bob a question?");
        Scanner sc = new Scanner(System.in);


        String answer1 = "Sure.";
        String answer2 = "Whoa, chill out!";
        String answer3 = "Fine. Be that way!";
        String answer4 = "Whatever.";
        String userInput = sc.nextLine();
        System.out.println("User input = " + userInput);

        if(userInput.endsWith("?")){
            System.out.println(answer1);
        }
         else if(userInput.endsWith("!")){
            System.out.println(answer2);
        }
        else if(userInput.equals("")){
            System.out.println(answer3);
        } else{
            System.out.println(answer4);
        }





    }
}
