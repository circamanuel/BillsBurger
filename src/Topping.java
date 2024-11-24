public class Topping {

    public String type;
    public double price;

    // Konstruktor für allgemeine Toppings
    public Topping(String type) {
        this.type = type;
        this.price = 0.0; // Standardpreis für ein allgemeines Topping
    }

    public Topping(String type, double price) {
        this.type = type;
        this.price = price;
    }

    // Factory-Methode zur Erstellung von Toppings
    public static Topping getTopping(String type) {
        return switch (type) {
            case "Cheese" -> new CheeseTopping(type);
            case "Bacon" -> new BaconTopping(type);
            default -> new Topping(type);
        };
    }

    // Zeigt Informationen zum Topping an
    public void returnTopping() {
        System.out.println("Topping: " + type + ", Price: $" + price);
    }

    // Überschreibt die toString-Methode
    @Override
    public String toString() {
        return "Topping: " + type + ", Price: $" + price;
    }

    public double returnPrice() {
        return price;
    }
}

// Spezifisches Topping: Bacon
class BaconTopping extends Topping {

    public BaconTopping(String type) {
        super(type, 1.50); // Preis direkt im Konstruktor übergeben
    }
}

// Spezifisches Topping: Cheese
class CheeseTopping extends Topping {

    public CheeseTopping(String type) {
        super(type, 1.00); // Preis direkt im Konstruktor übergeben
    }
}
