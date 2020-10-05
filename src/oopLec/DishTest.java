package oopLec;

public class DishTest {
    public static void main(String[] args) {

        Dish dish1 = new Dish();
        Dish dish2 = new Dish();
        dish1.costInCents = 35;
        dish1.nameOfDish = "Ratatouille";
        dish1.wouldRecommend = true;
        dish1.printSummary();

        dish2.costInCents = 45;
        dish2.nameOfDish = "Pizza";
        dish2.wouldRecommend = false;
        dish2.printSummary();




    }
}
