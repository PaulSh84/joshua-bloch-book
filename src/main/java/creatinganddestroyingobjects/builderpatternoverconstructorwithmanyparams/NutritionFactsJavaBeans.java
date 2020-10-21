package creatinganddestroyingobjects.builderpatternoverconstructorwithmanyparams;

// Java Beans Pattern
public class NutritionFactsJavaBeans {

    // Parameters initialized to default values (if any)

    private int servingSize  = -1; // Required; no default value

    private int servings     = -1; // Required; no default value

    private int calories     = 0;

    private int fat          = 0;

    private int sodium       = 0;

    private int carbohydrate = 0;



    public NutritionFactsJavaBeans() { }


    // Setters

    public void setServingSize(int val)  { servingSize = val; }

    public void setServings(int val)    { servings = val; }

    public void setCalories(int val)    { calories = val; }

    public void setFat(int val)         { fat = val; }

    public void setSodium(int val)      { sodium = val; }

    public void setCarbohydrate(int val) { carbohydrate = val; }


    public static void main(String[] args) {
        NutritionFactsJavaBeans cocaCola = new NutritionFactsJavaBeans();

        cocaCola.setServingSize(240);

        cocaCola.setServings(8);

        cocaCola.setCalories(100);

        cocaCola.setSodium(35);

        cocaCola.setCarbohydrate(27);

    }
}