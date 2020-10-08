public class ServerNameGenerator {

    static String[] adjectives = {"adorable", "bad", "calm", "defiant", "eager", "fair", "gentle", "happy", "impossible", "jealous"};
    static String[] nouns = {"Bob", "Sarah", "Mando", "Dave", "Penny", "Azalea", "Roger", "Juan", "Kathy", "Ryan"};


    static void randomUserName(){
        int randomNum = (int)Math.floor(Math.random() * 9);
        int randomNum2 = (int)Math.floor(Math.random() * 9);

        System.out.println("randomNum = " + randomNum);
        System.out.println("randomNum2 = " + randomNum2);
        System.out.println("Here is you server name: \n" + nouns[randomNum] + "-" + adjectives[randomNum2]);
    };

    public static void main(String[] args) {

        randomUserName();


}
}