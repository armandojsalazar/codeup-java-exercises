package oopLec;

public class ObjectOrientedProgramingLec {
    public static void main(String[] args) {

        Person rick1 = new Person();

        rick1.firstName = "Rick";
        rick1.lastName = "Sanchez";

        System.out.println(rick1.sayHello());


        rick1.firstName = "Morty";
        System.out.println(rick1.sayHello());

        dog d1 = new dog();


    }
}

