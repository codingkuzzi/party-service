public class Coupon100Plus implements Coupon {
    public String getCode() {
        return "100PLUS";
    }

    public int getDiscountCost(Event event) {
        if (event.getGuestCount() >= 100)
            return event.getTotalCost() - event.getBeveragesCost();
        else
            return event.getTotalCost();
    }
}
