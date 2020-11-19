package generalprogramming.avoidfloatanddoublewhenexactanswerisrequired;

public class MonetaryCalculations {

    public static void main(String[] args) {
//        System.out.println(1.03 - 0.42);
//
//        System.out.println(1.00 - 9 * 0.10);

        // Broken - uses floating point for monetary calculation!

            double funds = 1.00;

            int itemsBought = 0;

            for (double price = 0.10; funds >= price; price += 0.10) {

                funds -= price;

                itemsBought++;

            }

            System.out.println(itemsBought + " items bought.");

            System.out.println("Change: $" + funds);

        }


    /*  The float and double types are particularly ill-suited for monetary calculations */
}
