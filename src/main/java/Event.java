import java.util.ArrayList;

public class Event {
    private int mGuestCount;
    private ArrayList<Food> mFoodList;

    public Event() {
        mGuestCount = 0;
        mFoodList = new ArrayList<Food>();
    }

    public Event(int guestCount){
        mGuestCount = guestCount;
        mFoodList = new ArrayList<Food>();

    }

    public int getGuestCount(){
        return mGuestCount;
    }

    public int getCost(){
        int foodCost = 0;
        for (Food food: mFoodList){
            foodCost += food.getCost();

        }
        return foodCost * mGuestCount;
    }

    public void addFood(String foodName){
        mFoodList.add(new Food(foodName));
    }
}
