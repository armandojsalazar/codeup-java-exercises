package oopLec;

public class DishTools {

    public static final int AverageCostOfDishInCents = 1300;

    public static void shoutDishName(Dish dish1){
        System.out.println(dish1.nameOfDish.toUpperCase());
    }

    public static void analyzeDishCost(Dish dish1) {
        if(dish1.costInCents < AverageCostOfDishInCents){
            System.out.println("Less expensive than average");
        } else {
            System.out.println("More expensive than average");
        }
    }

    public static void flipRecommendation(Dish dish1){
        dish1.wouldRecommend = !dish1.wouldRecommend;
    }
}
