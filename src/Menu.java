public class Menu {
    private final Burger burger;
    private final Topping topping;
    private final Drink drink;
    private final Side side;

    public Menu(Burger burger, Topping topping, Drink drink, Side side) {
        this.burger = burger;
        this.topping = topping;
        this.drink = drink;
        this.side = side;
    }

    // Gibt die Details des Menüs aus
    public void displayMenu() {
        System.out.println("Menu Details: ");
        System.out.println("Burger: " + burger);
        System.out.println("Topping: " + topping);
        System.out.println("Drink: " + drink);
        System.out.println("Side: " + side);
    }

    // Berechnet den Gesamtpreis
    public double calculatePrice() {
        return burger.returnPrice() + topping.returnPrice() + drink.returnPrice() + side.returnPrice();
    }

    // Gibt den Menüpreis als String aus
    @Override
    public String toString() {
        return "Menu [Burger=" + burger + ", Topping=" + topping + ", Drink=" + drink + ", Side=" + side +
                ", Total Price=$" + calculatePrice() + "]";
    }
}


