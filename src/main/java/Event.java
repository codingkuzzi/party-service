import java.util.ArrayList;

public class Event {
    private int mGuestCount;
    private ArrayList<MenuItem> mFoodList;
    private ArrayList<MenuItem> mBeveragesList;
    private ArrayList<MenuItem> mDrinksList;
    private ArrayList<MenuItem> mEntertainmentList;
    private Coupon mCoupon;

    public Event(int guestCount,
                 ArrayList<MenuItem> foodList,
                 ArrayList<MenuItem> beveragesList,
                 ArrayList<MenuItem> drinksList,
                 ArrayList<MenuItem> entertainmentList,
                 Coupon coupon) {
        mGuestCount = guestCount;
        mFoodList = foodList;
        mBeveragesList = beveragesList;
        mDrinksList = drinksList;
        mEntertainmentList = entertainmentList;
        mCoupon = coupon;
    }

    public int getGuestCount() {
        return mGuestCount;
    }

    public int getFoodCost() {
        return mGuestCount * mFoodList.stream().mapToInt(menuItem -> menuItem.getCost()).sum();
    }

    public int getBeveragesCost() {
        return mGuestCount * mBeveragesList.stream().mapToInt(menuItem -> menuItem.getCost()).sum();
    }

    public int getDrinksCost() {
        return mGuestCount * mDrinksList.stream().mapToInt(menuItem -> menuItem.getCost()).sum();
    }

    public int getEntertaimnentCost() {
        return mEntertainmentList.stream().mapToInt(menuItem -> menuItem.getCost()).sum();
    }

    public int getTotalCost() {
        return getFoodCost() + getBeveragesCost() + getDrinksCost() + getEntertaimnentCost();
    }

    public int getDiscountCost() {
        if (mCoupon == null) {
            return getTotalCost();
        }
        else {
            return mCoupon.getDiscountCost(this);
        }
    }
}
