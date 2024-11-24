public class Drink {

    public String size;
    public double price;

    // Konstruktor für allgemeine Getränke
    public Drink(String size) {
        this.size = size;
        this.price = 0.0; // Standardpreis für ein allgemeines Getränk
    }

    // Factory-Methode zur Erstellung von Drinks
    public static Drink getDrink(String size ) {
        return switch (size.toUpperCase().charAt(0)) {
            case 'S' -> new Small(size);
            case 'M' -> new Medium(size);
            case 'L' -> new Large(size);
            default -> new Drink(size);
        };
    }

    // Zeigt Informationen zum Getränk an
    public void returnDrink() {
        System.out.println("Drink of " + size + " with price " + price + " is returned.");
    }

    // Gibt den Preis des Getränks zurück
    public double returnPrice() {
        return price;
    }

    @Override
    public String toString() {
        return size + " with price " + price + " is returned";
    }
}

// Spezifisches Getränk: Cola
class Small extends Drink {

    public Small(String size) {
        super(size);
        this.price = 1.50; // Spezifischer Preis für Cola
    }


}

// Spezifisches Getränk: Ice Tea
class Medium extends Drink {

    public Medium(String type) {
        super(type);
        this.price = 2.00; // Spezifischer Preis für Ice Tea
    }

}
class Large extends Drink {

    public Large(String type) {
        super(type);
        this.price = 3.00; // Spezifischer Preis für Ice Tea
    }

}