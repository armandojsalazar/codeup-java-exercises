import java.util.Scanner;

public class JavaBasicExercises {
    public static void main(String[] args) {
//1.TODO Write a Java program to print 'Hello' on screen and then print your name on a separate line
        System.out.println("Question 1's Answer:");
        System.out.println("Hello\nArmando Salazar");

//2.TODO Write a Java program to print the sum of two numbers. Go to the editor
//Test Data:
//74 + 36
//Expected Output :
//110
        System.out.println("Question 2's Answer:");
        System.out.println(76 + 36);

//3.TODO Write a Java program to divide two numbers and print on the screen. Go to the editor
//Test Data :
//50/3
//Expected Output :
//16
        System.out.println("Question 3's Answer:");
        System.out.println(50/3);


//TODO 4. Write a Java program to print the result of the following operations. Go to the editor
//Test Data:
//a. -5 + 8 * 6
//b. (55+9) % 9
//c. 20 + -3*5 / 8
//d. 5 + 15 / 3 * 2 - 8 % 3
//Expected Output :
//43
//1
//19
//13
        System.out.println("Question 4's Answer:");
        System.out.println(-5 + (8*6));
        System.out.println((55+9)%9);
        System.out.println(20 + -3 * 5/8);
        System.out.println(5+15/3*2-8%3);


//5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
//Test Data:
//Input first number: 25
//Input second number: 5
//Expected Output :
//25 x 5 = 125
        System.out.println("Question 5's Answer:");
        System.out.println("Enter 1st number input:");
        Scanner input1 = new Scanner(System.in);
        int num1 = input1.nextInt();
        System.out.println("Enter 2nd number input:");
        int num2 = input1.nextInt();
        System.out.println(num1 + " x " + num2 + " = " + (num1*num2));


//6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output :
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000
//125 / 24 = 5
//125 mod 24 = 5



        System.out.println("Question 6's Answer:");
        Scanner input2 = new Scanner(System.in);
        System.out.println("Input 1st number:");
        int num3 = input2.nextInt();
        System.out.println("Input 2ns number:");
        int num4 = input2.nextInt();
        System.out.println(num3 + " + " + num4 + " = " + (num3+num4));
        System.out.println(num3 + " - " + num4 + " = " + (num3-num4));
        System.out.println(num3 + " x " + num4 + " = " + (num3*num4));
        System.out.println(num3 + " / " + num4 + " = " + (num3/num4));
        System.out.println(num3 + " mod " + num4 + " = " + (num3%num4));

//7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
//Test Data:
//Input a number: 8
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80

        System.out.println("Question 7's Answer:");
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num5 = input3.nextInt();

        System.out.println(num5 + " x" + " 1 = " + (num5 * 1));
        System.out.println(num5 + " x" + " 2 = " + (num5 * 2));
        System.out.println(num5 + " x" + " 3 = " + (num5 * 3));
        System.out.println(num5 + " x" + " 4 = " + (num5 * 4));
        System.out.println(num5 + " x" + " 5 = " + (num5 * 5));
        System.out.println(num5 + " x" + " 6 = " + (num5 * 6));
        System.out.println(num5 + " x" + " 7 = " + (num5 * 7));
        System.out.println(num5 + " x" + " 8 = " + (num5 * 8));
        System.out.println(num5 + " x" + " 9 = " + (num5 * 9));
        System.out.println(num5 + " x" + " 10 = " + (num5 * 10));


//8. Write a Java program to display the following pattern. Go to the editor
//Sample Pattern :
//
//   J    a   v     v  a
//   J   a a   v   v  a a
//J  J  aaaaa   V V  aaaaa
// JJ  a     a   V  a     a

        System.out.println("Question 8's Answer:");
        System.out.println("   J     a   V     V   a");
        System.out.println("   J    a a   V   V   a a");
        System.out.println("J  J   aaaaa   V V   aaaaa");
        System.out.println(" JJ   a     a   V   a     a");

//9. Write a Java program to compute the specified expressions and print the output. Go to the editor
//Test Data:
//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
//Expected Output
//2.138888888888889


        System.out.println("Question 9's Answer:");

    }
}
