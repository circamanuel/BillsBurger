

public class Side {

    public String type;
    public double price;

    // Konstruktor für allgemeine Getränke
    public Side(String type) {
        this.type = type;
        this.price = 1.0; // Standardpreis für ein allgemeines Getränk
    }

    // Factory-Methode zur Erstellung von Drinks
    public static Side getSide(String type ) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'P' -> new Pommes(type);
            case 'N' -> new Nuggets(type);
            case 'W' -> new Wings(type);
            default -> new Side(type);
        };
    }

    // Zeigt Informationen zum Getränk an
    public void returnSide() {
        System.out.println("Drink of " + type + " with price " + price + " is returned.");
    }

    // Gibt den Preis des Getränks zurück
    public double returnPrice() {
        return price;
    }
     @Override
    public String toString() {
        return type + " with price " + price + " is returned";
     }
}

// Spezifisches Getränk: Cola
class Pommes extends Side {

    public Pommes(String size) {
        super(size);
        this.price = 1.50; // Spezifischer Preis für Cola
    }

    // Überschreibt die Methode für den Preis
    @Override
    public double returnPrice() {
        return price;
    }
}

// Spezifisches Getränk: Ice Tea
class Nuggets extends Side {

    public Nuggets(String type) {
        super(type);
        this.price = 2.00; // Spezifischer Preis für Ice Tea
    }

    @Override
    public double returnPrice() {
        return price;
    }
}
class Wings extends Side {

    public Wings(String type) {
        super(type);
        this.price = 3.00; // Spezifischer Preis für Ice Tea
    }

    @Override
    public double returnPrice() {
        return price;
    }
}
