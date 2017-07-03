

public class Menu {
    private MenuItem[] mFoodMenu;
    private MenuItem[] mBeveragesMenu;
    private  MenuItem[] mDrinksMenu;
    private MenuItem[] mEntertainmentMenu;

    public Menu(){
        mFoodMenu = new MenuItem[]{
                new MenuItem("chicken", "Grilled Chicken Breast", 20),
                new MenuItem("fried_fish", "Cornmeal Fried Cat Fish", 23),
                new MenuItem("meatballs", "Italian Meatballs", 25),
                new MenuItem("fish_filet", "Vegetarian Fish Filet", 21),
                new MenuItem("pie", "Apple Pie", 10),
                new MenuItem("pudding", "Chocolate Pudding", 14)
        };
        mBeveragesMenu = new MenuItem[]{
                new MenuItem("juice", "Juices", 5),
                new MenuItem("lemonade", "Lemonade", 6),
                new MenuItem("coffee", "Brewed Hot Coffee", 6),
                new MenuItem("tea", "Tea", 5)
        };
        mDrinksMenu = new MenuItem[]{
                new MenuItem("budweiser", "Budweiser", 8),
                new MenuItem("becks", "Becks", 7),
                new MenuItem("ale", "Copper Ale", 7),
                new MenuItem("chardonnay", "Chardonnay", 15),
                new MenuItem("cabernet", "Cabernet", 16),
                new MenuItem("merlot", "Merlot", 16),
                new MenuItem("castle", "Thew Castle", 17),
        };
        mEntertainmentMenu = new MenuItem[]{
                new MenuItem("band", "Jazz Band", 800),
                new MenuItem("comedy", "Stand-Up Comedy", 1000),
                new MenuItem("clowns", "Clowns", 600),
        };

    }

    public MenuItem[] getFood(){
        return mFoodMenu;
    }

    public MenuItem[] getBeverages(){
        return mBeveragesMenu;
    }

    public MenuItem[] getDrinks(){
        return mDrinksMenu;
    }

    public MenuItem[] getEntertainment(){
        return mEntertainmentMenu;
    }
}
