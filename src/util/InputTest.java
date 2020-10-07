package util;

public class InputTest {
    public static void main(String[] args) {

        Input input = new Input();

        if(input.yesNo())
            System.out.println("This returned a true");
        else
            System.out.println("this returned a false");


        input.getString();

        input.getInt(50, 110);










    }
}
