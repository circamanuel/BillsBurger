public class Burger {

    public String type;
    public double price;

    // Konstruktor für allgemeine Burger
    public Burger(String type) {
        this.type = type;
        this.price = 12.00; // Standardpreis
    }

    // Konstruktor für benutzerdefinierte Burger
    public Burger(String type, double price) {
        this.type = type;
        this.price = price;
    }

    // Factory-Methode zur Erstellung von spezifischen Burgern
    public static Burger getBurger(String type) {
        return switch (type) {
            case "BigTasty" -> new BigTasty(type);
            case "McChicken" -> new McChicken(type);
            case "BigMac" -> new BigMac(type);
            case "Deluxe Burger" -> new DeluxeBurger(type);
            default -> new Burger(type);
        };
    }

    // Zeigt Informationen zum Burger an
    public void orderBurger() {
        System.out.println("Ordering the " + type + " costs " + price);
    }

    public double returnPrice() {
        return price;
    }

    @Override
    public String toString() {
        return type + " costs " + price;
    }
}

// Abstrakte Klasse für Burger mit Toppings
abstract class CustomizableBurger extends Burger {

    public String topping1;
    public String topping2;
    public String topping3;

    // Konstruktor für Burger ohne Toppings
    public CustomizableBurger(String type, double price) {
        super(type, price);
    }

    // Konstruktor für Burger mit Toppings
    public CustomizableBurger(String type, double price, String topping1, String topping2, String topping3) {
        super(type, price);
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
    }

    @Override
    public void orderBurger() {
        System.out.printf("Ordering the %s costs %.2f%nToppings: %s, %s, %s%n",
                type, price, topping1, topping2, topping3);
    }


}

// McChicken Burger
class McChicken extends CustomizableBurger {

    public McChicken(String type) {
        super(type, 8.50); // Standardpreis
    }

    public McChicken(String type, double price, String topping1, String topping2, String topping3) {
        super(type, price, topping1, topping2, topping3);
    }
}

// BigMac Burger
class BigMac extends CustomizableBurger {

    public BigMac(String type) {
        super(type, 9.00); // Standardpreis
    }

    public BigMac(String type, double price, String topping1, String topping2, String topping3) {
        super(type, price, topping1, topping2, topping3);
    }
}

// BigTasty Burger
class BigTasty extends CustomizableBurger {

    public BigTasty(String type) {
        super(type, 10.00); // Standardpreis
    }

    public BigTasty(String type, double price, String topping1, String topping2, String topping3) {
        super(type, price, topping1, topping2, topping3);
    }
}

// Deluxe Burger
class DeluxeBurger extends CustomizableBurger {

    public DeluxeBurger(String type) {
        super(type, 12.50); // Standardpreis
    }

    public DeluxeBurger(String type, double price, String topping1, String topping2, String topping3) {
        super(type, price, topping1, topping2, topping3);
    }
}
