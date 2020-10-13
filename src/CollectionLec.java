import java.util.ArrayList;

public class CollectionLec {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("Armando");
        System.out.println(names.size());
        names.add("Kelli");
        names.add("Kristan");

        System.out.println("names.get(0) = " + names.get(0));
//        System.out.println("names.get(1) = " + names.get(1));

        System.out.println("names.indexOf(\"Kelli\") = " + names.indexOf("Kelli"));
        if (names.contains("Kelli")) {
            System.out.println("names.get(1) = " + names.get(1).toUpperCase());
        }

    }
}
