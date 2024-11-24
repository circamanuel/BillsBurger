import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Benutzer wählt einen Burger
        System.out.println("Choose a Burger (BigTasty, McChicken, BigMac, Deluxe Burger): ");
        String burgerType = scanner.nextLine();
        Burger burger = Burger.getBurger(burgerType);

        // Benutzer wählt ein Topping
        System.out.println("Choose a Topping (Cheese, Bacon): ");
        String toppingType = scanner.nextLine();
        Topping topping = Topping.getTopping(toppingType);

        // Benutzer wählt ein Getränk
        System.out.println("Choose a Drink Size (Small, Medium, Large): ");
        String drinkSize = scanner.nextLine();
        Drink drink = Drink.getDrink(drinkSize);

        // Benutzer wählt eine Beilage
        System.out.println("Choose a Side (Pommes, Nuggets, Wings): ");
        String sideType = scanner.nextLine();
        Side side = Side.getSide(sideType);

        // Erstellen des Menüs
        Menu menu = new Menu(burger, topping, drink, side);

        // Menü anzeigen und Gesamtpreis berechnen
       menu.displayMenu();
       System.out.println("Total Price: $" + menu.calculatePrice());

        scanner.close();
    }
}
