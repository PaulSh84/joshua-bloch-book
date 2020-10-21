package creatinganddestroyingobjects.builderpatternoverconstructorwithmanyparams;

// Telescoping constructor pattern
public class NutritionFactsTelescope {

    private final int servingSize;  // (mL)            required

    private final int servings;     // (per container) required

    private final int calories;     // (per serving)   optional

    private final int fat;          // (g/serving)     optional

    private final int sodium;       // (mg/serving)    optional

    private final int carbohydrate; // (g/serving)     optional



    public NutritionFactsTelescope(int servingSize, int servings) {

        this(servingSize, servings, 0);

    }



    public NutritionFactsTelescope(int servingSize, int servings,

                                   int calories) {

        this(servingSize, servings, calories, 0);

    }



    public NutritionFactsTelescope(int servingSize, int servings,

                                   int calories, int fat) {

        this(servingSize, servings, calories, fat, 0);

    }



    public NutritionFactsTelescope(int servingSize, int servings,

                                   int calories, int fat, int sodium) {

        this(servingSize, servings, calories, fat, sodium, 0);

    }




    public NutritionFactsTelescope(int servingSize, int servings,

                                   int calories, int fat, int sodium, int carbohydrate) {

        this.servingSize  = servingSize;

        this.servings     = servings;

        this.calories     = calories;

        this.fat          = fat;

        this.sodium       = sodium;

        this.carbohydrate = carbohydrate;

    }

    NutritionFactsTelescope telescope = new NutritionFactsTelescope(123, 35);

}