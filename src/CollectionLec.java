import oopLec.Post;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionLec {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Post> posts = new ArrayList<>();

        System.out.println(names.size());
        names.add("Armando");
        System.out.println(names.size());
        names.add("Kelli");
        names.add("Kristan");

        posts.add(new Post("Mando's Weekend", "Armando"));
        posts.add(new Post("Mando's 2nd Weekend", "Rick"));
        posts.add(new Post("Mando's 3rd Weekend", "Morty"));

        System.out.println("names.get(0) = " + names.get(0));
//        System.out.println("names.get(1) = " + names.get(1));

        System.out.println("names.indexOf(\"Kelli\") = " + names.indexOf("Kelli"));
        if (names.contains("Kelli")) {
            System.out.println("names.get(1) = " + names.get(1).toUpperCase());
        }

        Post deletedPost = posts.remove(1);
        deletedPost.printTitleAndAuthor();
        System.out.println("posts.lastIndexOf(deletedPost) = " + posts.lastIndexOf(deletedPost));

        if(!posts.isEmpty()){
            for(Post post: posts){
                post.printTitleAndAuthor();
            }
        }

hashMapsPractice();
    }

    public static void hashMapsPractice(){
        HashMap<String, String> usernames = new HashMap<>();
        usernames.put("daboskillz", "Armando J S");
        usernames.putIfAbsent("daboskillz", "Armando Jesus S");

        System.out.println("usernames.get(\"daboskillz\") = " + usernames.get("daboskillz"));

        if(usernames.containsKey("ryanorsinger")){
            System.out.println("usernames.get(\"ryanorsinger\") = " + usernames.get("ryanorsinger"));
            System.out.println("Login into the system");
        } else{
            System.out.println("User not found");
            System.out.println("Roll back transaction");
            System.out.println("Ask again");
        }

        System.out.println("usernames.containsValue(\"Armando Jesus S\") = " + usernames.containsValue("Armando Jesus S"));
        System.out.println("usernames.containsValue(\"Armando J S\") = " + usernames.containsValue("Armando J S"));
    }

}
