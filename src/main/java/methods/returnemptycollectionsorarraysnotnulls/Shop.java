package methods.returnemptycollectionsorarraysnotnulls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {

    // Returns null to indicate an empty collection. Don't do this!


    private final List<Cheese> cheesesInStock = new ArrayList<>();

    public static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];


    /**
     * @return a list containing all of the cheeses in the shop,
     * <p>
     * or null if no cheeses are available for purchase.
     */

    public List<Cheese> getCheeses() {

        return cheesesInStock.isEmpty() ? null

                : new ArrayList<>(cheesesInStock);

    }

    //The right way to return a possibly empty collection

    public List<Cheese> getCheesesTheRightWay() {

        return new ArrayList<>(cheesesInStock);

    }

    // Optimization - avoids allocating empty collections

    public List<Cheese> getCheesesOptimized() {

        return cheesesInStock.isEmpty() ? Collections.emptyList()

                : new ArrayList<>(cheesesInStock);

    }

    //The right way to return a possibly empty array

    public Cheese[] getCheesesInArray() {

        return cheesesInStock.toArray(new Cheese[0]);

    }
    // Optimization - avoids allocating empty arrays

    public Cheese[] getCheesesInArrayOptimized() {

        return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);

    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        List<Cheese> cheeses = shop.getCheeses();

        if (cheeses != null && cheeses.contains(Cheese.STILTON))

            System.out.println("Jolly good, just the thing.");
    }

}
