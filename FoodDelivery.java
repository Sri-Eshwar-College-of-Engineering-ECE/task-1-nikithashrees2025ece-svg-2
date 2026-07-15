
abstract class FoodItem {
    String foodName;
    double basePrice;

    FoodItem(String foodName, double basePrice) {
        this.foodName = foodName;
        this.basePrice = basePrice;
    }

    abstract double calculatePrice();
}

class Pizza extends FoodItem {

    Pizza(String foodName, double basePrice) {
        super(foodName, basePrice);
    }

    double calculatePrice() {
        return basePrice + (basePrice * 0.10);
    }
}

class Burger extends FoodItem {

    Burger(String foodName, double basePrice) {
        super(foodName, basePrice);
    }

    double calculatePrice() {
        return basePrice + 30;
    }
}

class Biryani extends FoodItem {

    Biryani(String foodName, double basePrice) {
        super(foodName, basePrice);
    }

    double calculatePrice() {
        return basePrice + 50;
    }
}

public class FoodDelivery {
    public static void main(String[] args) {

        FoodItem[] items = new FoodItem[3];

        items[0] = new Pizza("Veg Pizza", 300);
        items[1] = new Burger("Cheese Burger", 150);
        items[2] = new Biryani("Chicken Biryani", 250);

        System.out.println("Food Delivery System");
        System.out.println("--------------------------");

        for (FoodItem item : items) {
            System.out.println("Food Name : " + item.foodName);
            System.out.println("Final Price : ₹" + item.calculatePrice());
            System.out.println();
        }
    }
}