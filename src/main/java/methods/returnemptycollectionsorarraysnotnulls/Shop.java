package methods.returnemptycollectionsorarraysnotnulls;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    // Returns null to indicate an empty collection. Don't do this!


    private final List<Cheese> cheesesInStock = new ArrayList<>();


    /**
     * @return a list containing all of the cheeses in the shop,
     * <p>
     * or null if no cheeses are available for purchase.
     */

    public List<Cheese> getCheeses() {

        return cheesesInStock.isEmpty() ? null

                : new ArrayList<>(cheesesInStock);

    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        List<Cheese> cheeses = shop.getCheeses();

        if (cheeses != null && cheeses.contains(Cheese.STILTON))

            System.out.println("Jolly good, just the thing.");
    }

}
