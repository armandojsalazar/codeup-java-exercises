import java.util.Arrays;

public class ArrayLec {
    public static void main(String[] args) {

        double[] prices = new double[3];
        int[] numbers = new int[8];
        int[] otherNumbers = new int[8];

        prices[0] = Double.parseDouble("1.0");
        prices[1] = 2.0;
        prices[2] = 3.0;

        String[] names = {"fer", "Doug", "Dan"};
//
//        System.out.println(names[0]);
//        System.out.println(names[2]);
//
//        System.out.println("prices.length = " + prices.length);
//
//        System.out.println("prices[0] = " + prices[0]);
//        System.out.println("prices[2] = " + prices[2]);

        for(int i = 0; i < prices.length; i++){
            System.out.println("prices[i] = " + prices[i]);
        }
        for(String name: names){
            System.out.println("name = " + name);
        }
        
        Arrays.sort(prices);
        Arrays.sort(names);
        
        
        
        
//        for (Double price: prices){
//            System.out.println("prices = " + price);
//        }
        Arrays.fill(numbers, 10);
        Arrays.fill(otherNumbers, 15);
        
        System.out.println("Array.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("Array.toString(numbers) = " + Arrays.toString(otherNumbers));
        
        
        
//        String[] copyOfNames = new String[names.length+1];

        String[] copyOfNames = Arrays.copyOf(names, names.length+1);

        System.out.println("copyOfNames.length = " + copyOfNames.length);
        copyOfNames[3] = "Justin";
        System.out.println("Arrays.toString(copyOfNames) = " + Arrays.toString(copyOfNames));


        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");
    }
}
