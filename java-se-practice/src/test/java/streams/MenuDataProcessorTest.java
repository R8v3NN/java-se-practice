package streams;

import lessons.streams.Dish;
import lessons.streams.MenuDataProcessor;

import java.util.List;

import static java.awt.SystemColor.menu;

public class MenuDataProcessorTest {
    private String title;private int calories;
    private int cookingTime;
    private boolean isVegan;
    private List<String> ingredients;
    List<Dish> dishList = List.of(
            new Dish("Pasta", 450, 30, false, List.of("pasta", "cheese", "tomato", "olive oil")),
            new Dish("Pizza", 600, 20, false, List.of("flower", "cheese", "tomato", "ham")),
            new Dish("Hot dog", 300, 15, false, List.of("white bread", "sausage", "mustard")),
            new Dish("Ham sandwich", 270, 10, false, List.of("bread", "ham", "sauce", "salad")),
            new Dish("Pastrami sandwich", 250, 24, false, List.of("bread", "ham", "sauce", "salad")),
            new Dish("Kebab", 250, 13, false, List.of("tortilla", "chicken", "sauce", "tomato", "cucumber", "chili")),
            new Dish("Sushi", 200, 10, false, List.of("rice", "fish", "algi", "avocado")),
            new Dish("Boiled eggs", 130, 10, false, List.of("egg")),
            new Dish("Tofu", 130, 5, true, List.of("tofu")),
            new Dish("Vegetable biryani", 97, 60, true, List.of("rice", "olive oil", "vegetables", "chili")));
    menu = new Menu(dishList);
    @Test
    public void shouldReturnTotalCaloriesFOrMenu(){
        int expectedTotal = 2677;
        int total = MenuDataProcessor.getMenuTotalCaloriesForMenu(menu);
        Assert.assertEquals(expectedTotalCalories, totalCalories);
    }
    @Test
    public void shouldReturnOnlyVeganDisches(){
        List<String> veganDishesTitle = List.of("Tofu", "Vegetable biryani")
                List<Dish> veganMenu = MenuDataProcessor.getVeganDishesForMenu(menu);
        Assert.assertTrue(veganDishesTitle.contains ((veganMenu.get(0).getTitle())));
    }
    @Test
    public void shouldReturnDishesWithCaloriesLessThanSpecifiedValue(){
        int calories = 100;

    }
}
