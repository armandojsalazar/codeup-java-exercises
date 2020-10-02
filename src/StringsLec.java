public class StringsLec {

    public static void main(String[] args) {
        String message = "Hello";
//        message = message.replace('e','a');
        System.out.println(message);
        message = message + " World";
        System.out.println(message);

        String dbEmail = "fer@codeup.com";
        String email = "Fer@Codeup.com";
        //True statement, will show when ran
        if(email.equalsIgnoreCase(dbEmail)){
            System.out.println("email = " + email);
            System.out.println("they match");
        }
        //False Statement. Won't show when ran
        if(email.equals(dbEmail)){
            System.out.println("email = " + email);
            System.out.println("they match");
        }




    }
}
