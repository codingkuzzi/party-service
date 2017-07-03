import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class App {
    public static void main(String[] args){
        System.out.println("Hello! Welcome to our party-planning service.");
        System.out.println("Choose different options to create your own unique party.");
        System.out.println("Answer following questions to get cost.");

        Menu menu = new Menu();

        Integer guestCount = getUserInteger(10, "How many guests do you expect?");
        ArrayList<MenuItem> foodChoices = getUserMenuItems(menu.getFood(),1, "What food is being served?");
        ArrayList<MenuItem> beveragesChoices = getUserMenuItems(menu.getBeverages(),1, "What beverages are being served?");
        ArrayList<MenuItem> drinksChoices = getUserMenuItems(menu.getDrinks(),0, "What drinks are being served?");
        ArrayList<MenuItem> entertainmentChoices = getUserMenuItems(menu.getEntertainment(),0, "What entertainment is expected?");
        Coupon coupon = getUserCoupon(new Coupon[] {new CouponHappy20(), new Coupon100Plus()}, "Do you have any coupon (only one is applicable)?");

        Event event = new Event(guestCount, foodChoices, beveragesChoices, drinksChoices, entertainmentChoices, coupon);
        System.out.println();
        System.out.println(String.format("Total cost is $%d", event.getTotalCost()));
        System.out.println(String.format("Discount cost is $%d", event.getDiscountCost()));
    }

    private static String readLine() {
        if (System.console() != null)
            return System.console().readLine();
        try {
            return new BufferedReader(new InputStreamReader(System.in)).readLine();
        }
        catch (IOException e) {
            return "";
        }
    }

    public static int getUserInteger(int minValue, String question) {
        System.out.println();
        System.out.println(question);
        int result = -1;
        while (result < 0) {
            System.out.print(String.format("Enter number (min. %d): ", minValue));
            try {
                // readLine() is workaround due to System.console() sometimes returns null
                Integer intInput = Integer.parseInt(readLine());
                if (intInput >= minValue)
                    result = intInput;
            }
            catch (NumberFormatException e) {
            }
        }
        return result;
    }

    public static Coupon getUserCoupon(Coupon[] coupons, String question) {
        System.out.println();
        System.out.println(question);
        Coupon result = null;
        while(result == null) {
            System.out.print("Enter valid value or press Enter to skip: ");
            // readLine() is workaround due to System.console() sometimes returns null
            String strInput = readLine();
            if (strInput.equals(""))
                break;
            Optional<Coupon> optCoupon = Arrays.stream(coupons).filter(coupon -> coupon.getCode().equals(strInput)).findFirst();
            if (optCoupon.isPresent())
                result = optCoupon.get();
        }
        return result;
    }

    public static ArrayList<MenuItem> getUserMenuItems(MenuItem[] choicesArray, int requiredMin, String question){
        System.out.println();
        System.out.println(question);

        ArrayList<MenuItem> result = new ArrayList<MenuItem>();
        ArrayList<MenuItem> choicesList = new ArrayList<MenuItem>(Arrays.asList(choicesArray));

        while(choicesList.size() > 0) {
            boolean canExit = result.size() >= requiredMin;
            if (canExit) {
                System.out.println("  0 - Go to next question");
            }
            for (int i = 0; i < choicesList.size(); i++) {
                System.out.println(String.format("  %d - %s", i + 1, choicesList.get(i).getName()));
            }
            int choice = -1;
            while (choice < 0) {
                int minChoice = canExit ? 0 : 1;
                int maxChoice = choicesList.size();
                System.out.print(String.format("Enter your choice (%d - %d): ", minChoice, maxChoice));
                try {
                    // readLine() is workaround due to System.console() sometimes returns null
                    Integer intInput = Integer.parseInt(readLine());
                    if (intInput >= minChoice && intInput <= maxChoice)
                        choice = intInput;
                }
                catch (NumberFormatException e) {
                }
            }

            if (choice == 0) {
                choicesList.clear();
            }
            else {
                result.add(choicesList.get(choice - 1));
                choicesList.remove(choice - 1);
            }
        }
        return result;
    }
}
