public class CouponHappy20 implements Coupon {
    public String getCode() {
        return "HAPPY20";
    }

    public int getDiscountCost(Event event) {
        return event.getTotalCost() * 4 / 5;
    }
}