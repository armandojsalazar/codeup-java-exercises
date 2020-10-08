import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        Person[] people = new Person[3];

        people[0] = new Person("Penny");
        people[1] = new Person ("Mando");
        people[2] = new Person ("Denver");



        Person[] addPerson = Arrays.copyOf(people, people.length + 1);

//        addPerson[0] = "Penny2";
//        addPerson[1] = "Mando2";
//        addPerson[2] = "Denver2";
        addPerson[3] = new Person ("Azalea");

        System.out.println("addPerson = " + addPerson[3]);

        for(Person person: people){
            System.out.println("person = " + person);
        }
        for (Person person: addPerson){
            System.out.println("person = " + person);
        }


    }
}
