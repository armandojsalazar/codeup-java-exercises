package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student william = new Student("William A.");
        Student susan = new Student("Susan Q.");
        Student roger = new Student("Roger D.");
        Student herman = new Student("Herman D.");

        william.addGrade(100);
        william.addGrade(92);
        william.addGrade(85);

        susan.addGrade(70);
        susan.addGrade(89);
        susan.addGrade(100);

        roger.addGrade(100);
        roger.addGrade(100);
        roger.addGrade(98);

        herman.addGrade(92);
        herman.addGrade(92);
        herman.addGrade(88);

        students.put("willieAdams", william);
        students.put("suzzyq", susan);
        students.put("rogerdodger", roger);
        students.put("herbyderby", herman);

        Input input = new Input();
        System.out.println("Welcome!\nHere are the GitHub usernames of our students:");
        for(String gitHubUsernames: students.keySet()){
            System.out.print(gitHubUsernames + " ");
            System.out.println(" ");
        }
        System.out.println("What Student would you like to see more information on?");
        String keyTyped = input.getString();
        if(students.containsKey(keyTyped)){
            System.out.printf("Name: %s - GitHub Username: %s\n" + "Current Average: %f\n", students.get(keyTyped).getName(), keyTyped, students.get(keyTyped).getGradeAverage());
        }else {
            System.err.println("Sorry, no student found with that GitHub username of \"" + keyTyped + "\".");

        }
        System.out.println("Would you like to see another student?");
        input.yesNo();
    }

}
