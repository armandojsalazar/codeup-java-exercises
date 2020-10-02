public class StringsLec {

    public static void main(String[] args) {
        String message = "Hello";
//        message = message.replace('e','a');
        System.out.println(message);
        message = message + " World";
        System.out.println(message);

        String dbEmail = "fer@codeup.com";
        String email = "Fer@Codeup.com".toLowerCase();
        String studentEmail = "fergmail.com";


        //True statement, will show when ran
//        if(email.equalsIgnoreCase(dbEmail)){
//            System.out.println("email = " + email);
//            System.out.println("they match");
//        }
        //False Statement. Won't show when ran
//        if(email.equals(dbEmail)){
//            System.out.println("email = " + email);
//            System.out.println("they match");
//        }

        if(email.endsWith("@codeup.com")){
            System.out.println("You can see the grades sheet");
        }else {
            System.out.println("You are not allowed to see this file");
        }

        if (studentEmail.startsWith("fer".toLowerCase())){
            System.out.println("You can see your grade sheet.");
        }

        //will return the character per the index
        System.out.println(email.charAt(0));
        //will return true or false
        System.out.println(email.charAt(0) == 'f');


        //will give you the index number which would be 3
        System.out.println(email.indexOf("@"));
        //if missing the @ char, it will give you a negative index
        System.out.println(studentEmail.indexOf("@"));

        if (studentEmail.indexOf("@") > 0){
            System.out.println("Email validation passed");
        } else {
            System.out.println("Email validation failed");
        }


        System.out.println("First index = " + email.indexOf("o"));
        System.out.println("Last index = " + email.lastIndexOf("o"));

    }
}
