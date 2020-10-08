import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        String[] persons = new String[3];

        persons[0] = "Penny";
        persons[1] = "Mando";
        persons[2] = "Denver";



        String[] addPerson = Arrays.copyOf(persons, persons.length + 1);

//        addPerson[0] = "Penny2";
//        addPerson[1] = "Mando2";
//        addPerson[2] = "Denver2";
        addPerson[3] = "Azalea";

        System.out.println("addPerson = " + addPerson[3]);

        for(String person: persons){
            System.out.println("person = " + person);
        }

        for (String person: addPerson){
            System.out.println("person = " + person);
        }


    }
}
