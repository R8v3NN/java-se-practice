package lessons.streams;

import java.util.ArrayList;
import java.util.List;

public class MenuDataProcessor {
    public static int getTotalCaloriesForMenu(Menu menu){
        int total = 0;
        for(Dish dish : menu.getDishList()){
            total += dish.getCalories();
        }
        return total;
    }
    public static List<Dish> getVeganDishesForMenu(Menu menu){
        List<Dish> veganDishes = new ArrayList<>();
        for(Dish dish : menu.getDishList ()){
            if()
        }
        return veganDishes;
    }


}
