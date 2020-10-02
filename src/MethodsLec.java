public class MethodsLec {
    public static void main(String[] args) {
//        System.out.println( sayHello("Mando") );
//        System.out.println( sum(1, 2) );
//        printer(sayHello("Mando"));
//        printer( sum(3, 4) );
//        printer( "SSG", "Salazar" );
        count(6);


    }

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }


    public static void printer(String data){
        System.out.println("printing...... = " + data);
    }

    public static void printer(int data){
        System.out.println("printing...... = " + data);
    }

    public static void printer(String prefix, String data) {
        System.out.println("PRINTING STRINGS WITH A PREFIX..... = " + prefix + " " + data);

    }


    public static String sayHello(String name){
        return String.format("Hello, %s!", name);
    }
    public static int sum(int num1, int num2){
        return num1 + num2;
    }
}
