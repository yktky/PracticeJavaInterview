package day25;

import java.util.Arrays;

public class GroceriesSplitPrac {
    public static void main(String[] args) {

        String groceries = "Tomatoes, Potatoes,"+"Cheese, bread,oions, pepper," +"grapes, oranges,apples";

        String[] items = groceries.split(",");
        System.out.println(items.length);
        System.out.println(Arrays.toString(items));

        for (int x = 0; x < items.length; x++) {
            System.out.println(items[x].trim());

            System.out.println(items[x].trim().length());
        }
    }
}
