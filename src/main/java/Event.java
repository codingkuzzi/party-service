import java.util.ArrayList;

public class Event {
    private int mGuestCount;
    private ArrayList<String> mFoodList;
    private ArrayList<String> mBeverageList;
    private ArrayList<String> mDrinkList;
    private ArrayList<String> mEntertainmentList;
    private String mCouponCode;


    /*public Event() {
        mGuestCount = 0;
        mFoodList = new ArrayList<String>();
    }

    public Event(int guestCount){
        mGuestCount = guestCount;
        mFoodList = new ArrayList<String>();

    }

    public int getGuestCount(){
        return mGuestCount;
    }

    public int getCost(){
        int foodCost = 0;
        for (String food: mFoodList){
            foodCost += food.getCost();

        }
        return foodCost * mGuestCount;
    }

    public void addFood(String foodName){
        mFoodList.add(new MenuItem(foodName));
    }
    */
}
