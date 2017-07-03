public class MenuItem {
    private String mId;
    private String mName;
    private int mCost;

    public MenuItem(String id, String name, int cost) {
        mId = id;
        mName = name;
        mCost = cost;
    }

    public String getId(){
        return mId;
    }

    public  String getName(){
        return mName;
    }

    public int getCost() {
        return mCost;
    }
}

