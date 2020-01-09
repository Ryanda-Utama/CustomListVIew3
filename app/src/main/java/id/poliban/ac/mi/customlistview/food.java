package id.poliban.ac.mi.customlistview;

public class food {
    private String food;
    private String foodName;
    private String foodDescription;


    public food(String food, String foodName, String foodDescription) {
        this.food = food;
        this.foodName = foodName;
        this.foodDescription = foodDescription;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s",getFoodName(), getFoodDescription());
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }
}

