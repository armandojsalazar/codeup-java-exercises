import oopLec.Post;

import java.util.ArrayList;

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


    }



}
